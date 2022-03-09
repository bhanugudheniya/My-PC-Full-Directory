import java.net.InetAddress;
import java.net.UnknownHostException;
 
public class InetDemo {
 
    public static void main(String[] args) {
 
        try {
            InetAddress hostInfo = InetAddress.getByName("www.facebook.com"); 
            // Don't put https or https:// Just put the String only
            
            System.out.println("\nIP address of facebook is: " + hostInfo.getHostAddress());
            System.out.println("Host Name of facebook is : " + hostInfo.getHostName());
            
        } catch (UnknownHostException ex) {
            ex.printStackTrace();
        }
 
    }
 
}
