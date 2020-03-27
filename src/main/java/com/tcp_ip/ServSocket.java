package com.tcp_ip;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
// необходимо подключить telnet
public class ServSocket {

    public static void main(String[] args) throws IOException {
        try(ServerSocket servSocket = new ServerSocket(8189);
            Socket socket = servSocket.accept();
            Scanner scanner = new Scanner(socket.getInputStream())){

            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true); // отправляем поток данных. Информация ушла
//            writer.println("hello");
            while(scanner.hasNext()){
                String str = scanner.nextLine();
                writer.println("you've send: " + str);
                System.out.println(str);
                if(str.equals("exit")){
                    break;
                }
            }


//            InputStream inputStream = socket.getInputStream(); // приходит поток данных. Информация пришла
//            OutputStream outputStream = socket.getOutputStream();
        }
    }
}
