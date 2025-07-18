import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Файловые операции
*/

public class MoveFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        //напишите тут ваш код

        if (Files.exists(filePath) && !Files.exists(fileNewPath)) {
            Files.move(filePath, fileNewPath);
        } else if (Files.exists(filePath) && Files.exists(fileNewPath)) {
            Files.delete(filePath);
        } else if (!Files.exists(filePath)) {
            Files.createFile(filePath);
        }
    }
}