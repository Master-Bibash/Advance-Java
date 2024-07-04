import java.io.*;
import java.net.*;

public class GetMEthodExample{
     public static void main(String[] args)throws IOException{
          URL url=new URL("http://httpbin.org/get?id=1234");
          URLConnection connection=url.openConnection();
          connection.setRequestProperty("Accept", "applcation/json");
          BufferedReader buff=
          new BufferedReader(new InputStreamReader(connection.getInputStream()));
          String line;
          while((line=buff.readLine())!=null){
               System.out.println(line);

          }
          buff.close();

     }
}