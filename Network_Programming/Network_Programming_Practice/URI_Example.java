
import java.net.*;

class URI_Example {

    public static void main(String[] args) {
        try {
            URI uri = new URI("http://example.com/path/to/resource");
            System.out.println("scheme is  " + uri.getScheme());
            System.out.println("domain" + uri.getHost());
            System.out.println("path" + uri.getPath());
            System.out.println("query" + uri.getQuery());

        } catch (Exception e) {
        }
    }
}
