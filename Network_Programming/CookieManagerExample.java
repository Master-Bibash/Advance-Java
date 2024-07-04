
import java.io.*;
import java.net.*;
import java.util.*;

public class CookieManagerExample{
     public static void main(String[] args) throws IOException,URISyntaxException{
          
          URL url=new URL("https://example.com");
          CookieManager cookieManager=new CookieManager();
          CookieHandler.setDefault(cookieManager);
          //creating a cookie where cookie manager will handle the cookie
          HttpCookie cookie1=new HttpCookie("name","Bibash Karki");
          HttpCookie cookie2=new HttpCookie("address","Sindhuli");
          cookieManager.getCookieStore().add(url.toURI(), cookie1);
          cookieManager.getCookieStore().add(url.toURI(), cookie2);
          cookieManager.getCookieStore().remove(url.toURI(), cookie1);

          List<HttpCookie> cookies=cookieManager.getCookieStore().get(url.toURI());
          for(HttpCookie cookie:cookies){
               System.out.println(cookie.getName()+":"+cookie.getValue());
          }


cookieManager.getCookieStore().remove(url.toURI(), cookie2);

     }
}