package com.epam.collection.set;

import java.util.EnumSet;

enum CarManufacturer{
    AUDI, BMW, VW, TOYOTA, HONDA, ISUZU, SUZUKI, VOLVO, RENAULT
}

public class UseEnumSet {
    public static void main(String[] args) {
        EnumSet<CarManufacturer> japanAuto = EnumSet.range(CarManufacturer.TOYOTA, CarManufacturer.SUZUKI);
        EnumSet<CarManufacturer> other = EnumSet.complementOf(japanAuto);
        System.out.println(japanAuto);
        System.out.println(other);
        action("audi", japanAuto);
        action("suzuki", japanAuto);
    }

    public static boolean action(String auto, EnumSet<CarManufacturer> enumSet){
        CarManufacturer manufacturer = CarManufacturer.valueOf(auto.toUpperCase());
        boolean ok = false;
        if(ok = enumSet.contains(manufacturer)){
            System.out.println("Обработан: " + manufacturer);
        } else { System.out.println("Обработка невозможна: " + manufacturer); }
        return ok;
    }
}
