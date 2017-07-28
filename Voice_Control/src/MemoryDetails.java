import java.lang.management.*;
import java.io.*;
import javax.swing.filechooser.FileSystemView;

public class MemoryDetails{
    public static void ram(){
        long memorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getTotalPhysicalMemorySize();
        long Size = (((memorySize/1024)/1024/1000));
        String size = "Your machine's memory size is "+ String.valueOf(Size) +" GB";
        voiceControl.TextToSpeech(size);
    } 
    
    public static void hardDisk(){
        long total=0, free=0;
        String total_space, free_space;
        File [] drives = File.listRoots();
           
        for(File eDrive : drives){
            total += eDrive.getTotalSpace();
            free += eDrive.getFreeSpace();
        }
        total = ((total/1024)/1024)/1024;
        free = ((free/1024)/1024)/1024;
        
        total_space = "Your total hard disk space is "+ String.valueOf(total) + " GB";
        free_space = "Your total hard disk free space is "+ String.valueOf(free) + " GB";
        
        voiceControl.TextToSpeech(total_space);
        voiceControl.TextToSpeech(free_space);        
    }              
}
