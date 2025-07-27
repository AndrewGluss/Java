import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Простой шаблон
*/

public class FormatDate {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyyг. Hч.mмин");
        String text = dtf.format(localDateTime);
        System.out.println(text);
    }
}