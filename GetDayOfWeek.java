import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

/*
Просто день недели
*/

public class GetDayOfWeek {

    static LocalDate birthDate = LocalDate.of(2020, 3, 12);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(LocalDate date) {
        //напишите тут ваш код

        return  date.getDayOfWeek().getDisplayName(TextStyle.FULL,Locale.forLanguageTag("ru"));
    }
}