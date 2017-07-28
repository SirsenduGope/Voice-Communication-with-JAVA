
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

class date{
    public static void main(String args[]){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:s:s").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp);
        
        String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);
        System.out.println(dayOfWeek); 
    }
}