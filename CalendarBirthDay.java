import java.util.Calendar;
import java.util.GregorianCalendar;

/*
День недели рождения твоего
*/

public class CalendarBirthDay {

    static Calendar birthDate = new GregorianCalendar(1993, 1, 16);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        String result = "";

        switch (calendar.get(Calendar.DAY_OF_WEEK))
        {
            case 1:
                result = "Воскресенье";
                break;
            case 2:
                result = "Понедельник";
                break;
            case 3:
                result = "Вторник";
                break;
            case 4:
                result = "Среда";
                break;
            case 5:
                result = "Четверг";
                break;
            case 6:
                result = "Пятница";
                break;
            case 7:
                result = "Суббота";
                break;
        }
        return result;
    }
}