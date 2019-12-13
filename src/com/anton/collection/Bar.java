package com.anton.collection;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.time.LocalDateTime;

        class Test {
            public static void main(String arg[]) {
                Test.log("Hi");
            }


            private static void log(String text){
                PrintWriter out;
                /*  Сначала откроем файл, в который будем писать ошибки */
                try {
                    out = new PrintWriter(new FileWriter("exceptions.log", true));
                } catch (IOException ex) {
                    ex.printStackTrace();
                    return;
                }
                try {
        /*  Тут находится основной код вашего приложения. Ошибки будут
            проявляться в виде исключений, например так (искуственный
            пример)
        */
                    out.append(text).append("\n");
                    throw new Exception();
                } catch (Exception ex) {
        /*  Перехватываем все необработанные исключения и пишем в логфайл
            временную отметку, сообщение об ошибке и стектрейс (в котором
            будут указаны методы, которые привели к ошибке и номера строк
            в исходниках)
        */
                    out.printf("\n%s: %s\n", LocalDateTime.now(), ex.getMessage());
                    ex.printStackTrace(out);
                    out.flush();
                }
            }
        }






