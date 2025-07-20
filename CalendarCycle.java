import java.util.Calendar;
import java.util.GregorianCalendar;

/*
Выход из зацикленности
*/

public class CalendarCycle {

    public static void main(String[] args) {
        Calendar start = new GregorianCalendar(2014, Calendar.JANUARY, 2);
        Calendar end = new GregorianCalendar(2014, Calendar.FEBRUARY, 2);

        System.out.print("Старт");
        while (start.before(end)) {
            start.add(Calendar.DAY_OF_MONTH, 1);
            //start.roll(Calendar.DAY_OF_MONTH, 1);
            System.out.print(".");
        }
        System.out.print("Финиш");
    }
}
