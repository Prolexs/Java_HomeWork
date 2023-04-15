import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос фамилии пользователя
        System.out.println("Введите фамилию:");
        String surname = scanner.nextLine().trim().toUpperCase();

        while (!surname.matches("[A-Za-zА-Яа-я-]+")) {
            System.out.println("Ошибка ввода! Фамилия может содержать только буквы одного языка и знак \"-\". Введите фамилию заново:");
            surname = scanner.nextLine().trim().toUpperCase();
        }

        // Запрос имени пользователя
        System.out.println("Введите имя:");
        String name = scanner.nextLine().trim();

        while (!name.matches("[A-Za-zА-Яа-я-]+")) {
            System.out.println("Ошибка ввода! Имя может содержать только буквы одного языка и знак \"-\". Введите имя заново:");
            name = scanner.nextLine().trim();
        }

        // Запрос отчества пользователя
        System.out.println("Введите отчество:");
        String middleName = scanner.nextLine().trim();

        while (!middleName.matches("[A-Za-zА-Яа-я-]+")) {
            System.out.println("Ошибка ввода! Отчество может содержать только буквы одного языка и знак \"-\". Введите отчество заново:");
            middleName = scanner.nextLine().trim();
        }

        // Запрос даты рождения пользователя
        System.out.println("Введите дату рождения в формате дд.мм.гггг:");
        String birthdateStr = scanner.nextLine().trim();

        // Проверка корректности ввода даты рождения пользователя
        while (!birthdateStr.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            System.out.println("Ошибка ввода! Введите дату рождения в формате дд.мм.гггг:");
            birthdateStr = scanner.nextLine().trim();
        }

        // Запрос номера телефона пользователя
        System.out.println("Введите номер телефона в формате +71234567890:");
        String phoneNumberStr = scanner.nextLine().trim();

        // Проверка корректности ввода номера телефона пользователя
        while (!phoneNumberStr.matches("\\+\\d{11}")) {
            System.out.println("Ошибка ввода! Введите номер телефона в формате +71234567890:");
            phoneNumberStr = scanner.nextLine().trim();
        }

        // Запрос пола пользователя
        System.out.println("Введите пол (m/f):");
        String genderStr = scanner.nextLine().trim().toLowerCase();

        // Проверка корректности ввода пола пользователя
        while (!genderStr.equals("m") && !genderStr.equals("f")) {
            System.out.println("Ошибка ввода! Пол может быть только m или f");
            genderStr = scanner.nextLine().trim().toLowerCase();
        }

        // Составление имени файла
        String fileName = surname + ".txt";

        // Проверка существования файла и его перезапись, если необходимо
        File file = new File(fileName);
        boolean fileExists = file.exists();
        try {
            FileWriter writer = new FileWriter(file, true);
            if (fileExists) {
                System.out.println("Файл " + fileName + " успешно изменен");
                writer.write("\n");
            }
            else {
                System.out.println("Файл " + fileName + " успешно создан");
            }
            writer.write(String.format("%s %s %s\nДата рождения: %s\nТелефон: %s\nПол: %s\n",
                    surname, name, middleName, birthdateStr, phoneNumberStr, genderStr));
            writer.close();
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи в файл " + fileName);
            e.printStackTrace();
        }
    }
}

