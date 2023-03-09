// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! 

import java.util.Scanner;

public class Work {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int i = iScanner.nextInt();
        System.out.printf("Треугольное число: %d\n", giveMeNumber(i));
        iScanner.close();
    }

    public static int giveMeNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}


// 2. (сумма чисел от 1 до n)

// public class Main {
//     public static void main(String[] args) {
//         int n = 10; // замените на любое другое значение
//         int sum = 0;
//         for (int i = 1; i <= n; i++) {
//             sum += i;
//         }
//         System.out.println("Сумма чисел от 1 до " + n + " равна " + sum);
//     }
// }

// 3 (произведение чисел от 1 до n)

// public class Main {
//     public static void main(String[] args) {
//         int n = 10; // замените на любое другое значение
//         int product = 1;
//         for (int i = 1; i <= n; i++) {
//             product *= i;
//         }
//         System.out.println("Произведение чисел от 1 до " + n + " равно " + product);
//     }
// }

