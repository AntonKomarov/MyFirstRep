package com.tcp_ip;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Tcp {
    public static void main(String[] args) {
        // india.colorado.edu:13
        try(Socket socket = new Socket()) {
//            127.0.0.1 - localhost
//            ip-адрес нашего компьютера. Происходит эмуляция
            socket.connect(new InetSocketAddress(InetAddress.getLocalHost(), 8189), 2000);
            Scanner scanner = new Scanner(socket.getInputStream());
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}






