import java.util.*;

public class command_hashtable{
    Hashtable<String,String> command = new Hashtable<String,String>();
    public void command(){
        
        command.put("Open notepad","notepad");
        command.put("notepad","notepad");
        command.put("Open notepad please","notepad");
        command.put("Open paint","mspaint");
        command.put("paint","mspaint");
        command.put("Open paint please","mspaint");
        command.put("Open wordpad","wordpad.exe");
        command.put("wordpad","wordpad.exe");
        command.put("Open wordpad please","wordpad.exe");
        command.put("Open onscreen keyboard","cmd /c C:\\Windows\\System32\\osk.exe");
        command.put("onscreen keyboard","cmd /c C:\\Windows\\System32\\osk.exe");
        command.put("Open onscreen keyboard please","cmd /c C:\\Windows\\System32\\osk.exe");
        
    }
    
    
}