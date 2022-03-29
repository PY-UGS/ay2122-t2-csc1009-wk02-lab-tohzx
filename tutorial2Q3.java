import java.util.*; //allows for Date and Timezone operator
import java.text.*; //allows for SimpleDatFormat and jdf

public class tutorial2Q3 {
    public static void main(String[] args) {
        //Unix seconds
        long unix_milliseconds = System.currentTimeMillis();
        //milliseconds to seconds
        long total_seconds = (unix_milliseconds / 1000);
        long current_seconds = (total_seconds % 60);
        long total_minutes = (total_seconds / 60);
        long current_minutes = (total_minutes % 60);
        long total_hours = (total_minutes / 60);
        long current_hours = ((total_minutes / 60) % 24);

        System.out.print("\nCurrent time is " + current_hours + ":" + current_minutes + ":" + current_seconds + " GMT \n");

//        //Unix seconds
//        long unix_seconds = System.currentTimeMillis();
//        //convert seconds to milliseconds
//        Date date = new Date(unix_seconds);
//        // format of the current time
//        SimpleDateFormat jdf = new SimpleDateFormat(" HH:mm:ss");
//        jdf.setTimeZone(TimeZone.getTimeZone("GMT"));
//        String java_date = jdf.format(date);
//        System.out.println("\nCurrent time is "+java_date+" GMT\n");


    }
}