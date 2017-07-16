import edu.cmu.sphinx.api.Configuration;
import edu.cmu.sphinx.api.LiveSpeechRecognizer;
import edu.cmu.sphinx.api.SpeechResult;
import java.io.IOException;

//Mouse an keyboar key event
import java.awt.Robot;
import java.awt.event.KeyEvent;

//Text to speech
import java.io.*;
import com.sun.speech.freetts.*;

public class voicecontrol{
    public static void main(String args[]) throws IOException, Exception{
        //Configuration Object
        Configuration configuration = new Configuration();
        
//        Robot robot = new Robot();
//        robot.mouseMove(10,10);
//        
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress(KeyEvent.VK_SHIFT);
//        robot.keyPress(KeyEvent.VK_O);
//        
//        robot.keyRelease(KeyEvent.VK_CONTROL);
//        robot.keyRelease(KeyEvent.VK_SHIFT);
//        robot.keyRelease(KeyEvent.VK_O);
        
        String VOICENAME = "kevin16";
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice(VOICENAME);
        voice.allocate();
        try{
            voice.speak("Hello World");
        }catch(Exception e){
            
        }
        
        
        
        //Set path to the acoustic model
        configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
//        //Set path to the Dictionary
        configuration.setDictionaryPath("file:dictionary.dict");
// //        //Set path to the language model

        configuration.setLanguageModelPath("file:dictionary.lm");
//   
//        
//        //Recognizer the object and pass the configuration object
        LiveSpeechRecognizer recognize = new LiveSpeechRecognizer(configuration);
//        //Start Recognition Process (The bool parameter clears the previous cache if true)
        recognize.startRecognition(true);
//        
//        //Create SpeechResult object
        SpeechResult result;
        result = recognize.getResult();
//        String command = result.getHypothesis();
//        System.out.println(command);
        
        //Checking if recognizer has recognized the speech
        while((result = recognize.getResult()) != null){
//            //Get the recognize speech
            String command = result.getHypothesis();
            String work = null;
              Process p;
//            
//            //Match recognize speech with our command
//            if(command.equalsIgnoreCase("open browser")){
//                work = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
//            }else if(command.equalsIgnoreCase("close browser")){
//                work = "TaskKill /IM chrome.exe";
//            }else if(command.equalsIgnoreCase("file manager")){
//                work = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
//            }else if(command.equalsIgnoreCase("close file manager") || command.equalsIgnoreCase("close manager") ){
//                work = "TaskKill /IM chrome.exe";
//            }
            
            System.out.println(command);
//            if(work != null){
//                p = Runtime.getRuntime().exec(work);
//            }
        }
        
    }
}