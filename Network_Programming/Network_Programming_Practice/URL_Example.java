
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

class URL_Example {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            System.out.println(in.readLine());
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
