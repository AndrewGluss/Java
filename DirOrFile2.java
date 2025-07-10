import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
А что же внутри папки?
*/

public class DirOrFile2 {

    private static final String THIS_IS_FILE = " - это файл";
    private static final String THIS_IS_DIR = " - это директория";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path directory = Path.of(scanner.nextLine());
        //напишите тут ваш код
        try(DirectoryStream<Path> x = Files.newDirectoryStream(directory)){
            for(Path y: x) {
                if (Files.isRegularFile(y)) {
                    System.out.println(y + THIS_IS_FILE);
                } else if (Files.isDirectory(y)) {
                    System.out.println(y + THIS_IS_DIR);
                }
            }
        }
    }
}
