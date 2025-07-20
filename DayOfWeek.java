import java.util.Calendar;
import java.util.Date;

/*
Лишь бы не в понедельник
*/

public class DayOfWeek {

    static Date birthDate = new Date(93, 1, 16);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
        int dayOfWeek = date.getDay();
        String result = "";
        switch (dayOfWeek)
        {
            case 0:
                result = "Воскресенье";
                break;
            case 1:
                result = "Понедельник";
                break;
            case 2:
                result = "Вторник";
                break;
            case 3:
                result = "Среда";
                break;
            case 4:
                result = "Четверг";
                break;
            case 5:
                result = "Пятница";
                break;
            case 6:
                result = "Суббота";
                break;
        }
        return result;
    }
}
