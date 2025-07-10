import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Файл или директория
*/

public class DirOrFile {

    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String result = sc.nextLine();
            while (Files.exists(Path.of(result))) {
                if (Files.isRegularFile(Path.of(result))) {
                    System.out.println(result + THIS_IS_FILE);
                } else if (Files.isDirectory(Path.of(result))) {
                    System.out.println(result + THIS_IS_DIR);
                }
                result = sc.nextLine();
            }
        } catch (Exception e) {

        }
    }
}
