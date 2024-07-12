
import java.net.URLDecoder;
import java.net.URLEncoder;

class UrlEncoder {

    public static void main(String[] args) {
        try {
            String url = "https://www.example.com/query?name=Bibash karki&age=23";
            //encode
            String encodedUrl = URLEncoder.encode(url);
            System.out.println("encoded is " + encodedUrl);
            //decode
            String decodeUrl = URLDecoder.decode(encodedUrl, "UTF-8");
            System.out.println("decoded is " + decodeUrl);

        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}
