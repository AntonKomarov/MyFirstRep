package com.tcp_ip;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServSocket {

    public static void main(String[] args) throws IOException {
        try(ServerSocket servSocket = new ServerSocket(8189);
        Socket socket = servSocket.accept()){
            InputStream inputStream = socket.getInputStream(); // приходит поток данных. Информация пришла
            OutputStream outputStream = socket.getOutputStream(); // отправляем поток данных. Информация ушла

        }
    }
}
