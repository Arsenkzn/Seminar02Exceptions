//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.




import java.io.InputStream;
import java.util.Scanner;

public class HWexception1 {
    public static void main(String[] args) {
        boolean check = true;
        while(check) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Введите число типа float: ");
                float number = scanner.nextFloat();
                System.out.println(number);
                check = false;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
