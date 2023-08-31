
// Реализуйте метод, который запрашивает у пользователя ввод дробного числа
// (типа float),
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить
// к падению приложения,
// вместо этого, необходимо повторно запросить у пользователя ввод данных.
package Task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entered float is " + EnterFloat(scanner));
        scanner.close();
    }

    public static float EnterFloat(Scanner myInput) {

        try {
            System.out.println("Enter float: ");

            return myInput.nextFloat();

        } catch (InputMismatchException e) {
            System.out.println("Invalid input\nPlease, enter float data");
            myInput.nextLine();
            return EnterFloat(myInput);
        }
    }
}