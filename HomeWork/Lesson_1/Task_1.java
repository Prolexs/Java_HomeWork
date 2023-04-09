import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = generateArray(5); // генерируем первый массив длиной 5
        int[] arr2 = generateArray(5); // генерируем второй массив длиной 5

        try {
            int[] result = divideArrays(arr1, arr2); // вызываем метод деления массивов
            System.out.println("Результат деления массивов: ");
            printArray(result); // выводим результат на экран
        } catch (RuntimeException e) { // обрабатываем исключение, если оно возникло
            System.out.println(e.getMessage());
        }
    }

    public static int[] divideArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не совпадают!");
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на ноль запрещено!");
            }
            result[i] = arr1[i] / arr2[i];
        }

        return result;
    }

    public static int[] generateArray(int length) {
        Random random = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = random.nextInt(10) + 1; // генерируем случайное число от 1 до 10
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


// import java.util.Random;

// public class Main {
//     public static void main(String[] args) {
//         int[] arr1 = generateArray(4); // генерируем первый массив длиной 4
//         int[] arr2 = generateArray(5); // генерируем второй массив длиной 5

//         try {
//             int[] result = divideArrays(arr1, arr2); // вызываем метод деления массивов
//             System.out.println("Результат деления массивов: ");
//             printArray(result); // выводим результат на экран
//         } catch (RuntimeException e) { // обрабатываем исключение, если оно возникло
//             System.out.println(e.getMessage());
//         }
//     }

//     public static int[] divideArrays(int[] arr1, int[] arr2) {
//         if (arr1.length != arr2.length) {
//             throw new RuntimeException("Длины массивов не совпадают!");
//         }

//         int[] result = new int[arr1.length];
//         for (int i = 0; i < arr1.length; i++) {
//             if (arr2[i] == 0) {
//                 throw new RuntimeException("Деление на ноль запрещено!");
//             }
//             result[i] = arr1[i] / arr2[i];
//         }

//         return result;
//     }

//     public static int[] generateArray(int length) {
//         Random random = new Random();
//         int[] arr = new int[length];
//         for (int i = 0; i < length; i++) {
//             arr[i] = random.nextInt(10) + 1; // генерируем случайное число от 1 до 10
//         }
//         return arr;
//     }

//     public static void printArray(int[] arr) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }
