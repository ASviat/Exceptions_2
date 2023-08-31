package Task2;

import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class Task4 {

    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);

        System.out.println("Enter some data: ");
        String myData = myInput.nextLine();

        if (myData.equals("")) {
            myInput.close();
            throw new RuntimeException("You can't enter empty lines!");
        }

        myInput.close();
    }

}