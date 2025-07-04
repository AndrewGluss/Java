import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/*
Оборачивание исключений
*/

public class FileUtilsException {

    public static void main(String[] args) throws RuntimeException{
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }

    static void copyFile(String sourceFile, String destinationFile) {
        try{
            FileUtils.readFile(sourceFile);
            FileUtils.writeFile(destinationFile);
            //напишите тут ваш код
        } catch (FileNotFoundException fn) {
            throw new RuntimeException(fn);
        } catch (FileSystemException fs) {
            throw new RuntimeException(fs);
        }
    }
}