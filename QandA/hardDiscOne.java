import java.lang.management.*;
import java.io.*;
import javax.swing.filechooser.FileSystemView;

class hardDiscOne{
    public static void main(String args[]){
        File [] drives = File.listRoots();
        if((drives != null) && (drives.length> 0)){
            FileSystemView fsv = FileSystemView.getFileSystemView();
            
            for(File eDrive : drives){
                System.out.println("Drives: "+eDrive +" "+fsv.getSystemTypeDescription(eDrive));                
            }
            for(File eDrive : drives){
                System.out.println("Free Space: "+eDrive.getFreeSpace());
                System.out.println("Total Space: "+eDrive.getTotalSpace());
            }
        }                
    }
}