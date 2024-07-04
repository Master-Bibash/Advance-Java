
import java.net.*;

public class SocketInfo {

    public static void main(String[] args) {
        System.out.println("No Proxy:");
        try (Socket socket = new Socket()) {
            SocketAddress address = new InetSocketAddress("www.example.com", 80);
            socket.connect(address);
            socket.setSoTimeout(500);
            // socket.setOOBInline(true); // palo kurnu parro by default is false
            System.out.println("Socket Info: ");
            System.out.println("Address " + socket.getInetAddress());
            System.out.println("Port " + socket.getPort());
            System.err.println("local port " + socket.getLocalPort());

        } catch (Exception e) {
        }
        System.out.println("\n Via Proxy Server");
        try {
            Socket socket = new Socket(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("213.217.30.69", 3128)));
            //   SocketAddress procyAddress = new InetSocketAddress("213.217.30.69", 3128);
            socket.connect(new InetSocketAddress("www.example.com", 80));
            System.out.println("Socket Info: ");
            System.out.println("Address " + socket.getInetAddress());
            System.out.println("Port " + socket.getPort());
            System.err.println("local port " + socket.getLocalPort());
            socket.close();
        } catch (Exception e) {
        }
    }

}
