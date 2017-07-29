import java.util.*;

public class command_hashtable{
    Hashtable<String,String> command = new Hashtable<String,String>();
    public void appication(){
//        1. Notepad:
        command.put("open notepad", "cmd /c start notepad");
        command.put("open notepad please", "cmd /c start notepad");
        command.put("notepad", "cmd /c start notepad");

//        2. MS-Paint:
        command.put("open paint", "cmd /c start mspaint");
        command.put("open paint please", "cmd /c start mspaint");
        command.put("paint", "cmd /c start mspaint");

//        3. WordPad:
        command.put("open wordpad please", "cmd /c start write.exe");
        command.put("open wordpad", "cmd /c start write.exe");
        command.put("wordpad", "cmd /c start write.exe");

//        4. OnScreen Keyboard:
        command.put("open on screen keyboard", "cmd /c start osk");
        command.put("on screen keyboard please", "cmd /c start osk");
        command.put("on screen keyboard", "cmd /c start osk");

//        5. Disc Clean Up:
        command.put("open disc clean up please", "cmd /c start c:/windows/system32/cleanmgr.exe");
        command.put("open disc clean up", "cmd /c start c:/windows/system32/cleanmgr.exe");
        command.put("disc clean up", "cmd /c start c:/windows/system32/cleanmgr.exe");

//        6. Device Manager:
        command.put("open device manager please", "cmd /c start devmgmt.msc");
        command.put("open device manager", "cmd /c start devmgmt.msc");
        command.put("device manager", "cmd /c start devmgmt.msc");

//        7. System Configuration:
        command.put("system configuration please", "cmd /c start msconfig");
        command.put("open system configuration", "cmd /c start msconfig");
        command.put("system configuration", "cmd /c start msconfig");

//        8. System Information:
        command.put("open system information please", "cmd /c start systeminfo");
        command.put("open system information", "cmd /c start systeminfo");
        command.put("system information", "cmd /c start systeminfo");

//        9. Windows Firewall:
        command.put("open windows firewall please", "cmd /c start wf.msc");
        command.put("open windows firewall", "cmd /c start wf.msc");
        command.put("windows firewall", "cmd /c start wf.msc");

//        10. Sound Recorder:
        command.put("open sound recorder please", "cmd /c start soundrecorder");
        command.put("open sound recorder", "cmd /c start soundrecorder");
        command.put("sound recorder", "cmd /c start soundrecorder");

//        11. Windows Media Player:
        command.put("open windows media player please", "cmd /c start mplayer2.exe");
        command.put("open windows media player", "cmd /c start mplayer2.exe");
        command.put("open windows media", "cmd /c start mplayer2.exe");

//        12. Windows Power Shell:
        command.put("open windows power shell please", "cmd /c start powershell");
        command.put("open windows power shell", "cmd /c start powershell");
        command.put("windows power shell", "cmd /c start powershell");

//        13. Snipping Tools:
        command.put("open snipping tool please", "cmd /c start snippingtool");
        command.put("open snipping tool", "cmd /c start snippingtool");
        command.put("snipping tool", "cmd /c start snippingtool");

//        14. Calculator:
        command.put("open calculator please", "cmd /c start calc");
        command.put("open calculator", "cmd /c start calc");
        command.put("calculator", "cmd /c start calc");

//        15. My Computer:
        command.put("open my computer please", "cmd /c start explorer");
        command.put("open my computer", "cmd /c start explorer");
        command.put("my computer", "cmd /c start explorer");

//        16. Internet Explorer:
        command.put("open internet explorer please", "cmd /c start iexplore");
        command.put("open internet explorer", "cmd /c start iexplore");
        command.put("internet explorer", "cmd /c start iexplore");

//        17. Microsoft Word:
        command.put("open microsoft word please", "cmd /c start winword");
        command.put("open microsoft word", "cmd /c start winword");
        command.put("microsoft word", "cmd /c start winword");

//        18. Microsoft Excel:
        command.put("open microsoft excel please", "cmd /c start excel");
        command.put("open microsoft excel", "cmd /c start excel");
        command.put("microsoft excel", "cmd /c start excel");

//        19. Microsoft Power Point:
        command.put("open microsoft power point please", "cmd /c start powerpnt");
        command.put("open microsoft power point", "cmd /c start powerpnt");
        command.put("microsoft power point", "cmd /c start powerpnt");

//        20. Microsoft Access:
        command.put("open microsoft access please", "cmd /c start msaccess");
        command.put("open microsoft access", "cmd /c start msaccess");
        command.put("microsoft access", "cmd /c start msaccess");

//        21. Microsoft Publisher:
        command.put("open microsoft publisher please", "cmd /c start mspub");
        command.put("open microsoft publisher", "cmd /c start mspub");
        command.put("microsoft publisher", "cmd /c start mspub");

//        22. Microsoft Outlook:
        command.put("open microsoft outlook please", "cmd /c start outlook");
        command.put("open microsoft outlook", "cmd /c start outlook");
        command.put("microsoft outlook", "cmd /c start outlook");

//        23. Microsoft Picture Manager:
        command.put("open microsoft picture manager please", "cmd /c start ois");
        command.put("open microsoft picture manager", "cmd /c start ois");
        command.put("microsoft picture manager", "cmd /c start ois");

//        24. Microsoft InfoPath:
        command.put("open microsoft infopath please", "cmd /c start infopath");
        command.put("open microsoft infopath", "cmd /c start infopath");
        command.put("microsoft infopath", "cmd /c start infopath");

//        25. Microsoft OneNote:
        command.put("open microsoft onenote please", "cmd /c start onenote");
        command.put("open microsoft onenote", "cmd /c start onenote");
        command.put("microsoft onenote", "cmd /c start onenote");

//        26. VLC Media Player:
        command.put("open vlc please", "cmd /c start c:/program filse/videoLAN/VLC/vlc.exe");
        command.put("open vlc", "cmd /c start c:/program filse/videoLAN/VLC/vlc.exe");
        command.put("vlc", "cmd /c start c:/program filse/videoLAN/VLC/vlc.exe");

    }
    
    public void website(){
//        1. Google:
        command.put("open google please", "cmd /c start www.google.com");
        command.put("open google", "cmd /c start www.google.com");
        command.put("google", "cmd /c start infopath");

//        2. Facebook:
        command.put("open facebook please", "cmd /c start www.facebook.com");
        command.put("open facebook", "cmd /c start www.facebook.com");
        command.put("facebook", "cmd /c start www.facebook.com");

//        3. Gmail:
        command.put("open gmail please", "cmd /c start www.gmail.com");
        command.put("open gmail", "cmd /c start www.gmail.com");
        command.put("gmail", "cmd /c start gmail");

//        4. StackOverFlow:
        command.put("open stack over flow please", "cmd /c start www.stackoverflow.com");
        command.put("open stack over flow", "cmd /c start www.stackoverflow.com");
        command.put("stack over flow", "cmd /c start www.stackoverflow.com");

//        5. YouTube:
        command.put("open youtube please", "cmd /c start www.google.com");
        command.put("open youtube", "cmd /c start www.google.com");
        command.put("youtube", "cmd /c start www.youtube.com");

//        6. Twitter:
        command.put("open twitter please", "cmd /c start www.twitter.com");
        command.put("open twitter", "cmd /c start www.twitter.com");
        command.put("twitter", "cmd /c start www.twitter.com");
    }
    
    public void function_call(){
        //Time
        command.put("what is the time?", "time");
        command.put("what is the current time?", "time");
        command.put("what time it is?", "time");
        command.put("time?", "time");
        command.put("i want to know the time?", "time");
        command.put("current time?", "time");
        command.put("can you tell me the current time?", "time");
        command.put("tell me the current time?", "time");
        
        //Date
        command.put("today date?", "date");
        command.put("today's date?", "date");
        command.put("can you tell me the date?", "date");
        command.put("can you tell me today's date?", "date");
        command.put("can you tell me what is today's date?", "date");
        command.put("please tell me the date?", "date");
        command.put("please tell me today's date?", "date");
        command.put("what is today's date?", "date");
        command.put("date", "date");
        command.put("what date it is?", "date");
        command.put("tell me the current date?", "date");
        command.put("what date it is?", "date");
        
        //Day
        command.put("can you tell me the day?", "day");
        command.put("which day it is?", "day");
        command.put("tell me the current day?", "day");
        command.put("day", "day");
        command.put("today's day", "day");
        
        //RAM
        command.put("ram size?", "ram");
        command.put("what is my ram size?", "ram");
        command.put("what is ram size?", "ram");
        command.put("my computer ram size?", "ram");
        command.put("can you tell the ram size?", "ram");
        command.put("what is my memory size?", "ram");
        command.put("can you tell me my memory size?", "ram");
        command.put("memory size.", "ram");
        
        //HDD
        command.put("total hard disk size", "hdd");
        command.put("total free space", "hdd");
        command.put("hard disk size", "hdd");
        command.put("free space", "hdd");
        command.put("total space", "hdd");
        command.put("total space of my computer", "hdd");
        command.put("total free space of my computer", "hdd");
        
    }
    public String Process_call(String process){
        String value = process.toLowerCase();
        return command.get(value);
    }
    
    
}