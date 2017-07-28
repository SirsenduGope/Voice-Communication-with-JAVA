import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

class SystemName {
    public static void main(String args[]) throws UnknownHostException{
        String hostName = "";
        try{
            InetAddress ia ;
            ia = InetAddress.getLocalHost();
            hostName = ia.getHostName();
            System.out.println("Computer Name is: "+hostName);
        }catch(UnknownHostException ex){
            System.out.println("error in fetching system name");
        }
    }
}
