package lesson2.lesson6;

import java.util.Scanner;

public class Lab_6_2 {
    public static void main(String[] args) {
        String myPassword = "password123";
        boolean isContinue = true;
        int count = 0;
        while(isContinue){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your password: ");
            String userInput = scanner.nextLine();
            count++;
            if(count >= 3){
               break;
            }
            if(userInput.equals(myPassword)){
                System.out.println("Your password is correctly");
            }else{
                System.out.println("Your password is incorrect");
            }
        }
    }
}
