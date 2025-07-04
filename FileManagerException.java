import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class FileManagerException {

    public static final String FAILED_TO_READ = "Не удалось прочесть файл.";
    public static final String FAILED_TO_WRITE = "Не удалось записать в файл.";

    public static FileManager fileManager = new FileManager();

    public static void main(String[] args) {
        try {
            fileManager.copyFile("book.txt", "book_final_copy.txt");
            fileManager.copyFile("book_final_copy.txt", "book_last_copy.txt");
            //напишите тут ваш код
        } catch (RuntimeException e){
            Throwable cause = e.getCause();
            if (cause instanceof FileNotFoundException) {
                System.out.println("Не удалось прочесть файл.");
            } else if (cause instanceof FileSystemException) {
                System.out.println("Не удалось записать в файл.");
            }
        }
    }
}

