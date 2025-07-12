import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/*
Временное сохранение файла
*/

public class Url {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        try{
            URL url = new URL(line);
            InputStream input = url.openStream();
            byte[] buffer = input.readAllBytes();
            //String str = new String(buffer);

            Path path = Files.createTempFile(null, null);
            Files.write(path, buffer);
        } catch (MalformedURLException e) {

        }
    }
}
