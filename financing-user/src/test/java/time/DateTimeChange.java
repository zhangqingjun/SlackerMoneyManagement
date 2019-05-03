package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeChange {
    public static void main(String[] args){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String nowTime = localDateTime.format(dateTimeFormatter);
        System.out.println(nowTime);
        System.out.println(System.currentTimeMillis());
    }
}
