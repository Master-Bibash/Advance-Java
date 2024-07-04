
import java.io.*;
import java.net.*;
import java.util.*;

public class ExtendedCookieManager {

    public static void main(String[] args) throws IOException {
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        CookieHandler.setDefault(cookieManager);

        // Setup URL
        URL url = new URL("https://httpbin.org/cookies/set/address=Kathmandu,+Nepal");

        // Setup URL Connection
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");

        // Read the response
        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();

        // Retrieve Cookies
        CookieStore cookieStore = cookieManager.getCookieStore();
        List<HttpCookie> cookies = cookieStore.getCookies();
        System.out.println("Cookies from: " + url.toString());

        for (HttpCookie cookie : cookies) {
            System.out.println("Name: " + cookie.getName());
            System.out.println("Domain: " + cookie.getDomain());
            System.out.println("Path: " + cookie.getPath());
            System.out.println("Value: " + cookie.getValue());
            System.out.println("Secure: " + cookie.getSecure());
            System.out.println("HttpOnly: " + cookie.isHttpOnly());
            System.out.println("Max-Age: " + cookie.getMaxAge());
            System.out.println("Version: " + cookie.getVersion());
            System.out.println("Comment: " + cookie.getComment());
            System.out.println("CommentURL: " + cookie.getCommentURL());
        }
    }
}
