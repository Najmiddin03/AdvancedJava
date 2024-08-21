package Networking;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        String url = "www.youtube.com";
        InetAddress inetAddress = Inet4Address.getByName(url);

        System.out.println("Address: " + Arrays.toString(inetAddress.getAddress()));
        System.out.println("Host address: " + inetAddress.getHostAddress());
        System.out.println("Is any local address: "+inetAddress.isAnyLocalAddress());
        System.out.println("Is link local address: "+inetAddress.isLinkLocalAddress());
        System.out.println("Is loop back address: "+inetAddress.isLoopbackAddress());
        System.out.println("Is site local address: "+inetAddress.isSiteLocalAddress());
        System.out.println("Hashcode: "+inetAddress.hashCode());
    }
}
