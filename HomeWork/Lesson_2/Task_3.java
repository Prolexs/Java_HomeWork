// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class EmptyStringExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите что-нибудь: ");
        String input = scanner.nextLine();
        try {
            if (input.isEmpty()) {
                throw new Exception("Нельзя вводить пустые строки!");
            } else {
                System.out.println("Вы ввели: " + input);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

// Вроде сделал все верно, но у меня этот код отказывается запускаться.