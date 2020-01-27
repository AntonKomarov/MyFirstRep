package com.tcp_ip;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServSocket {

    public static void main(String[] args) throws IOException {
        try(ServerSocket servSocket = new ServerSocket(8189);
        Socket socket = servSocket.accept()){

            Scanner scanner = new Scanner(socket.getInputStream()); // приходит поток данных. Информация пришла
            PrintWriter writer = new PrintWriter(socket.getOutputStream()); // отправляем поток данных. Информация ушла

//            InputStream inputStream = socket.getInputStream();
//            OutputStream outputStream = socket.getOutputStream();
        }
    }
}
