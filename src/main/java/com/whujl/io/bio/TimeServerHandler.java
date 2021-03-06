package com.whujl.io.bio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

/**
 * Created by whujl on 15/12/9.
 */
public class TimeServerHandler implements Runnable {

    private Socket socket;

    public TimeServerHandler(Socket socket) {
        this.socket = socket;
    }

    public void run() {
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            String currentTime;
            String body;
            while (true) {
                body = in.readLine();
                if (body == null) {
                    break;
                }
                System.out.println("The Time server receive order : " + body);
                currentTime = "QUERY TIME ORDER".equalsIgnoreCase(body) ?
                        new Date(System.currentTimeMillis()).toString() :
                        "BAD ORDER";
                out.println(currentTime);

            }
        } catch (IOException e) {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
            if (out != null) {
                out.close();
                out = null;
            }

            if(socket != null){
                try{
                    socket.close();
                }catch (IOException e2){
                    e2.printStackTrace();
                }
                socket = null;
            }

        }
    }
}
