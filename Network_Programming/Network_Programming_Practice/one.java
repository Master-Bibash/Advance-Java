
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

class one {

    public static void main(String[] args) throws IOException {
        try {
            InetAddress address = InetAddress.getByName("www.example.com");
            System.out.println("  ----------------  ");
            System.out.println(address);

            //Check if the host is reachable
            boolean isRacable = address.isReachable(1);
            System.out.println("is reachle is " + isRacable);

            InetAddress localHost = InetAddress.getLocalHost();
            String ipAdrress = address.getHostAddress();
            System.out.println("in string ip is " + ipAdrress);
            byte[] ipAddressInBytes = address.getAddress();
            System.out.println("in byte " + ipAddressInBytes);
            System.out.println("our local");
            System.out.println("address is" + address + "and localhost is" + localHost);

            String gethostName = address.getHostName();
            System.out.println("the hostname is" + gethostName);

        } catch (UnknownHostException e) {
            // Handle exception
        }
    }
}
