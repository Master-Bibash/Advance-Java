
import java.io.*;
import java.net.*;

public class DictOrg {

    static final String SERVER = "dict.org";
    static final int PORT = 2628;

    static void define(String word, Writer writer, BufferedReader reader) throws IOException {
        writer.write("define wn " + word + "\r\n");
        writer.flush();
        String line;
        while ((line = reader.readLine()) != null);
        {
            if (line.startsWith("250")) {
                return;

            } else if (line.startsWith("5")) {
                System.out.println("Defination not found: " + word);
                return;

            } else {
                System.out.println(line);
            }

        }
        writer.close();

    }

    public static void main(String[] args) {
        try (Socket socket = new Socket(SERVER, PORT)) {

        } catch (Exception e) {
        }
    }
}
