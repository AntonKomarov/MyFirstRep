package com.tcp_ip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException, InterruptedException {

        int count = 0;
        ServerSocket serverSocket = new ServerSocket(8000);
        System.out.println("Server started");

        while(true) {
            // команда accept() используется для ожидания запроса от client. После чего создается socket для общения с client
            Socket clientSocketServer = serverSocket.accept(); // клиент подключился
            System.out.println("Client accepted " + (++count));


            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(clientSocketServer.getInputStream()));

            // Writer кэширует данные
            OutputStreamWriter writer = new OutputStreamWriter(clientSocketServer.getOutputStream());
            Thread.sleep(3000);
            writer.write("Client №" + count + " your message's length is " + reader.readLine().length());
            writer.flush(); // команда гарантирует что команда будет отправлена

            //Формула приеняющаяся для отображения в chrome
//            writer.write("HTTP/1.0 200 OK\n" +
//                             "Content-type: text/html\n" +
//                             "\n" +
//                             "<h1>Yor are client #<h1>" + count);


            // если использовать на прямую поток Output мы сможем отправлять только по 1 байту или по массиву байтов
            // создание потока для отправки данных на serverSocket
            //clientSocket.getOutputStream().write(20); // 20 соответствует ?-в квадрате
            reader.close();
            writer.close();
            clientSocketServer.close();
        }
//        serverSocket.close();

    }
}
