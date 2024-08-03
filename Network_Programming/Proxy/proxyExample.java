
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import javax.net.ssl.HttpsURLConnection;



class proxyExample{
     public static void main(String[] args){
          String proxyHost="proxy.example.com";
          int proxyPort=8080;
         Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(proxyHost, proxyPort));
         String urlString="http://www.example.com";
         HttpURLConnection connection=null;
         BufferedReader reader=null;
         try{
          URL url=new URL(urlString);
          connection =(HttpsURLConnection) url.openConnection();
          connection.setRequestMethod("Get");
          reader=new BufferedReader(new InputStreamReader(connection.getInputStream()));
          String line;
          while((line=reader.readLine())!=null){
              System.out.println(line);
          }


         }catch(Exception e){
          e.printStackTrace();

         }finally{
          try {
              if(reader!=null){
               if(connection!=null)connection.disconnect();
              
          } 
          
         }catch(Exception e){
          e.printStackTrace();
         }

     }
}
}