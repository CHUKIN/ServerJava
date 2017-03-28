package by.ekaterina;

import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.sql.SQLException;


public class Server {

        public void start(){


            int PORT_NUM = 4444;
            String result = "";

            ServerSocket serversocket = null;

            boolean flag = true;
            try {
                System.out.println("Начало прослушивания");
                serversocket = new ServerSocket(PORT_NUM);
            } catch (IOException e) {
                System.out.println("Невозможно использовать порт: " + PORT_NUM);
                System.exit(-1);
            }
            while (flag) {

                ClientWorker tmp = null;
                try {
                    tmp = new ClientWorker(serversocket.accept());
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tmp.start();

            }
            System.out.println("Конец...");
            try {
                serversocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}