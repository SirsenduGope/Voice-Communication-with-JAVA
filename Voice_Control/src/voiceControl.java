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

public class voiceControl{
        
    public static void main(String args[]) throws IOException, Exception{
        
      
        //Configuration Object
        Configuration configuration = new Configuration();
        //Set path to the acoustic model
        configuration.setAcousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        //Set path to the Dictionary
        configuration.setDictionaryPath("file:dictionary.dict");
        //Set path to the language model
        configuration.setLanguageModelPath("file:dictionary.lm");
   
        //Recognizer the object and pass the configuration object
        LiveSpeechRecognizer recognize = new LiveSpeechRecognizer(configuration);
        //Start Recognition Process (The bool parameter clears the previous cache if true)
        recognize.startRecognition(true);       
        
        //Create SpeechResult object
        SpeechResult result;
        result = recognize.getResult();
        
        //Checking if recognizer has recognized the speech
        while((result = recognize.getResult()) != null){
            //Get the recognize speech
            String work = null;
            String command = result.getHypothesis();
            
            //Match recognize speech with our command
           
        }        
    }
    
    //Function for TextToSpeech
    public static void TextToSpeech(String text){
        String VOICENAME = "kevin16";
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice(VOICENAME);
        voice.allocate();
        try{
            voice.speak(text);
        }catch(Exception e){
            System.out.println("Speech error");
        }
    }
    
    public static void process(String work) throws IOException{
        try{
            if(work != null){
               Runtime.getRuntime().exec(work);
            }
        }catch(Exception e){
            TextToSpeech("Process does not work");
        }
    }
    
}