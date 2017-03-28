package by.ekaterina;

import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.sql.SQLException;


public class MainApp {
    public static void main(String[]args) {
            Server server = new Server();
            server.start();
    }
}
