import java.time.LocalTime;

/*
Нужно просто посчитать
*/

public class LocalTImeCycle {

    public static void main(String[] args) throws InterruptedException {
        LocalTime localTime = LocalTime.MIDNIGHT;
        LocalTime next = amazingMethod(localTime);
        while (next.isAfter(localTime)) {
            System.out.println(next);
            next = amazingMethod(next);
            Thread.sleep(500);
        }
    }

    static LocalTime amazingMethod(LocalTime base) {
        return base.plusHours(4).plusMinutes(48);
    }
}