package by.ekaterina;

import java.io.*;
import java.net.Socket;
import java.sql.SQLException;


class ClientWorker extends Thread{
    private Socket cwsocket;

    ClientWorker(Socket cwsocket){
        super("ClientWorker");
        this.cwsocket=cwsocket;
    }

    public void run(){
        try {
            PrintWriter out = new PrintWriter(cwsocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(cwsocket.getInputStream()));
            String serverinput;
            while ((serverinput = in.readLine()) != null) {
                if (serverinput.equals("!!exit()!!")) {
                    System.out.println("отключился");
                    break;
                }
                String result=work(serverinput);
                System.out.println(result);
                out.println(result);
            }
            out.close();
            in.close();
            this.cwsocket.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("!отключился");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    private String work(String in) throws SQLException
    {
       //System.out.println(in);


        return in;
    }

}
