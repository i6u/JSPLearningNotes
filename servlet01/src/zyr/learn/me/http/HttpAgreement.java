package zyr.learn.me.http;

import java.io.*;
import java.net.Socket;

/**
 * Created by zhouweitao on 16/9/20.
 */
public class HttpAgreement {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("www.baidu.com",80);
            PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            out.println("GET / HTTP/1.1");
            out.println("Host: www.baidu.com");
            out.println("Content-type:text/html");
            out.println();
            out.flush();
            String string = "";
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while ((string = bufferedReader.readLine())!=null) {
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
