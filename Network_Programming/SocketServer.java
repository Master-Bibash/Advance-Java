
import java.io.*;
import java.net.*;
import java.util.Date;

public class SocketServer {

    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(1234); Socket connectoin = server.accept()) {
            try {

            } catch (Exception e) {
            }
            Writer out = new OutputStreamWriter(connectoin.getOutputStream());

            Date now = new Date();
            out.write(now.toString() + "\r\n");
            out.flush();

        } catch (Exception e) {

        }
    }

}
