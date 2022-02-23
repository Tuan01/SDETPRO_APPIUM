package lesson2;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Which number you want to check? ");
        int numberCheck = scanner.nextInt();
        if (numberCheck % 2 == 0){
            System.out.println("This is an even number");
        }else{
            System.out.println("This is an old number");
        }
    }
}
