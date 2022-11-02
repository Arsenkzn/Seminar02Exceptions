//3. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//        Пользователю должно показаться сообщение, что пустые строки вводить нельзя.


import java.util.Scanner;

public class HWexception4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String number = scanner.nextLine();
        number = number.trim();
        if (number.isEmpty())
            throw new IllegalArgumentException("пустые строки вводить нельзя!");
        else
            System.out.println(number);
    }
}

