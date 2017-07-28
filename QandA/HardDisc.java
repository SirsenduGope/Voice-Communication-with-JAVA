
import java.lang.management.*;
import java.io.*;

class HardDisc
{
    public static void main(String... a)
    {
        long diskSize = new File("/").getTotalSpace();
        String userName = System.getProperty("user.name");
        long maxMemory = Runtime.getRuntime().maxMemory();
        long memorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getTotalPhysicalMemorySize();
        System.out.println("Size of C:="+diskSize+" Bytes");
        System.out.println("User Name="+userName);

        System.out.println("RAM Size="+memorySize+" Bytes");
   }
}