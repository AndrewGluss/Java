import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/*
Получение информации по API
*/

public class UrlApi {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.ru/api/1.0/rest/projects");
        //напишите тут ваш код

        InputStream input = url.openStream();
        byte[] buffer = input.readAllBytes();
        String str = new String(buffer);

        System.out.println(str);
    }
}