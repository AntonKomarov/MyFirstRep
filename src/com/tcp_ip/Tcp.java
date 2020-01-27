package com.tcp_ip;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Tcp {

    public static void main(String[] args) {
        // india.colorado.edu:13
        try(Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress("india.colorado.edu", 13), 2000);
            Scanner scanner = new Scanner(socket.getInputStream());
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}






