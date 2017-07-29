import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateTime{
    public static void date(){
        String d;
        DateFormat dateFormat = new SimpleDateFormat("dd MMMMMMMM yyyy");
        Date date = new Date();
        d = "today's date is "+ dateFormat.format(date);
        voiceControl.TextToSpeech(d);
    }
    
    public static void time(){
        String h,m,s,a,time;
        h = new SimpleDateFormat("hh").format(Calendar.getInstance().getTime());
        m = new SimpleDateFormat("mm").format(Calendar.getInstance().getTime());
        s = new SimpleDateFormat("ss").format(Calendar.getInstance().getTime());
        a = new SimpleDateFormat("a").format(Calendar.getInstance().getTime());
        time = "the time is now "+ h+" O'clock "+m+" minute "+s+" second "+a;
        voiceControl.TextToSpeech(time);
    }
    
    public static void day(){
        Date date = new Date();
        String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
        String day = "todat is "+ dayOfWeek;
        voiceControl.TextToSpeech(day);
    }
}