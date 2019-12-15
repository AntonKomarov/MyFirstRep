package com.anton.jd02_01;

import java.util.ArrayList;
import java.util.List;

public class Buyer extends Thread implements IBuyer, IUseBacket {
    private int num; // пробема обращения потоков к одному ресурсу
    List<String> goodsInBacket = new ArrayList<>();
    private Double totalPrice;

    Double getTotalPrice() { return totalPrice; }

    private void setTotalPrice(Double totalPrice) { this.totalPrice=totalPrice; }

    private boolean pensioneer = false;

    Buyer(int num){
        this.num = num;
        this.setName("Buyer №" + num + " ");
        if(num%8 == 0) this.pensioneer = true;
    }

    @Override
    public void run() {
        enterToMarket();
        takeBacket();
        chooseGoods();
        putGoodsToBacket();
        getToQueue();
        goOut();
    }

    @Override
    public void enterToMarket() { System.out.println(this + "enter to market"); }

    @Override
    public void chooseGoods() {
        try {
            System.out.println(this + "choosing goods");
            if(pensioneer) { Helper.sleep(Helper.fromTo(750, 3000)); }
            Thread.sleep(Helper.fromTo(500, 2000)); // метод sleep() бросает ошибку
        } catch (InterruptedException e) {
            System.out.println(this + "некорректное завершение ожидания");
        }
    }


    @Override
    public void getToQueue(){
        System.out.println(this + "entred to queue");
        QueueBuyer.addBuyer(this);
        synchronized (this){
            try{
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(this + " finished service");
    }

    @Override
    public void goOut() {
        System.out.println(this + "leave market");
        synchronized (this){
            Dispatcher.countCompeteBuyers++;
        }
    }

    @Override
    public void takeBacket() {
        try {
            Thread.sleep(Helper.fromTo(500, 2000));
            System.out.println(this + "take backet");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void putGoodsToBacket() {
        double price = 0;
        int countOfGoods = Helper.fromTo(1, 4);
        int timeToPut = Helper.fromTo(500, 2000);
        if(pensioneer) timeToPut = Helper.fromTo(750,3000);
        for (int i = 0; i <countOfGoods ; i++) {
            Good good = Goods.getRandomGood();
            goodsInBacket.add(good+" for " + good.getPrice()+"$");
            price+=good.getPrice();
            System.out.println(this + " put to the basket " + good);
            Helper.sleep(timeToPut);
        }
        setTotalPrice(price);
    }
}
