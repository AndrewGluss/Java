import java.time.LocalDate;

/*
Освоение нового API
*/

public class LocalDAyApi {

    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());
    }

    static LocalDate nowExample() {
        //напишите тут ваш код

        return LocalDate.now();
    }

    static LocalDate ofExample() {
        //напишите тут ваш код
        //LocalDate.of();

        return LocalDate.of(2020, 9, 12);
    }
    static LocalDate ofYearDayExample() {
        //напишите тут ваш код
        //LocalDate.ofYearDay

        return LocalDate.ofYearDay(2020, 256);
    }

    static LocalDate ofEpochDayExample() {
        //напишите тут ваш код
        return LocalDate.ofEpochDay(18517);
    }
}