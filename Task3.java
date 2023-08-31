package Task2;

public class Task3 {

    public static void main(String[] args) {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[1] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (ArithmeticException ex) {
            System.out.println("На ноль делить нельзя");
        }
    }

    public static void printSum(Integer a, Integer b) {
        try {
            System.out.println(a + b);
        } catch (IllegalArgumentException e) {
            System.out.println("Введите корректные данные типа int");
        }

    }

}