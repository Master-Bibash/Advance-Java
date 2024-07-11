
import java.io.IOException;
import java.net.InetAddress;

class Two {

    public static void main(String[] args) throws IOException {
        try {
            InetAddress address = InetAddress.getByName("192.168.1.1");
            if (address instanceof java.net.Inet4Address) {
                System.out.println("the address is instance of int4address");

            }
            System.out.println("get ip address is " + address.getAddress());
        } catch (Exception e) {
            System.out.println("error is " + e.getMessage());
        }
    }

}
