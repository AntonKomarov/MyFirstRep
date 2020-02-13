package com.tcp_ip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        //Создание сокета для подключения к серверу
        //При создании сокета,если он не пришёл от серверного сокета
        //Необхоимо указать IP-адрес "куда я иду" и порт .
        Socket clientSocketClient = new Socket("127.0.0.1", 8000);

        // Поток для вывода/отправки информации
        OutputStreamWriter writer = new OutputStreamWriter(clientSocketClient.getOutputStream());
        writer.write("Get me some information\n");
        writer.flush();

        // Поток для чтения/приёма информации
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(clientSocketClient.getInputStream()));
        System.out.println(reader.readLine());



        writer.close();
        reader.close();
        clientSocketClient.close();


    }
}
