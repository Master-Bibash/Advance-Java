
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

class URLConnection {

    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            System.out.println("response is " + responseCode);
            //read the response
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

            }
            br.close();

        } catch (Exception e) {
            e.getStackTrace();
        }

    }

}
