import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

/*
Синтезируем LocalDateTime
*/

public class SetLocalDateTime {

    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());

        Set<LocalDateTime> dateSet = convert(dateMap);
        printCollection(dateSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        //напишите тут ваш код
        //HashMap<LocalDate, List<LocalTime>> newMap = sourceMap;

        HashSet<LocalDateTime> result = new HashSet<LocalDateTime>();

        for (LocalDate date : sourceMap.keySet()) {
            for (LocalTime time : sourceMap.get(date)) {
                result.add(LocalDateTime.of(date, time));
            }
        }

        return result;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}
