
import java.io.IOException;
import static java.lang.System.exit;
import java.util.Scanner;


class myComputer{
    public static void main(String args[]) throws IOException{
        Scanner inp = new Scanner(System.in);
        System.out.println("Press 1 for Open Control Panel\nPress 2 for open My Computer\nPress 3 for open Google Chrome\nPress 4 for Terminate");
        int take = Integer.parseInt(inp.next());
        
        Runtime.getRuntime().exec("c:/>start explorer");
        // while(inp.hasNext()){
        //     switch(take){
        //     case 1:
        //         Runtime.getRuntime().exec("start control");
        //         //Control Panel\All Control Panel Items\Programs and Features
        //         break;
        //     case 2:
        //         Runtime.getRuntime().exec("start explorer");
        //         break;
        //     case 3:
        //         Runtime.getRuntime().exec("cmd /c start chrome.exe");
        //         break;            
        //     default: System.out.println("wrong input.");
        //    }
        //     break;
        // }
         
         
         
    }
}