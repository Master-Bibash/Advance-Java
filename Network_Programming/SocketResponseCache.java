
import java.io.*;
import java.net.*;

  class SocketExample{
     
     public static void main(String[] args) {
         String serverName="time.nist.gov";
         int port=13;
         try(Socket socket = new Socket(serverName, port);
          InputStream is = socket.getInputStream(); InputStreamReader isr = new InputStreamReader(is, "ASCII"); BufferedReader br = new BufferedReader(isr);
         ) {
            String line;
            while((line=br.readLine())!=null){
                System.out.println(line);
            }
           

             
         } catch (IOException e) {
             System.out.println("Server not Connected");


         }
     }
     

}