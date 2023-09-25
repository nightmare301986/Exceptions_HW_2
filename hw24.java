import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hw24 {
    public static void main(String[] args) {
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любой текст кроме пустой строки");
        try(reader) {
            String result = reader.readLine();
            if(result == null || result.equals("") || result.trim().equals(""))  throw new RuntimeException("Пустую строку вводить нельзя");
            //if(result.equals(""))
            System.out.println(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}