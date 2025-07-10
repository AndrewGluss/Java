import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Поверхностное копирование
*/

public class CopyFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path sourceDirectory = Path.of(scanner.nextLine());
        Path targetDirectory = Path.of(scanner.nextLine());
        //напишите тут ваш код
        try(DirectoryStream<Path> x = Files.newDirectoryStream(sourceDirectory)){

            for(Path y: x) {
                if (Files.isRegularFile(y)) {
                    //System.out.println(y + THIS_IS_FILE);
                    Path newPath = targetDirectory.resolve(y.getFileName());
                    Files.copy(y, newPath);
                }
            }
        }
    }
}