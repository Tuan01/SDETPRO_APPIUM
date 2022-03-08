package lesson2;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        List<Integer>  myIntList = new ArrayList<>();
        myIntList.add(10);
        myIntList.add(12);
        myIntList.add(15);
        myIntList.add(20);
        myIntList.add(5);
        myIntList.add(6);
        boolean isContinuing = true;
        while (isContinuing){

            System.out.println("============Menu==========");
            System.out.println("1. Add a number into ArrayList");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximum number");
            System.out.println("4. Get minimum number");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Option number, please: ");
            int userInput = scanner.nextInt();

            int min = myIntList.get(0);
            int max = myIntList.get(0);;
            for (int i=1; i < myIntList.size(); i++){
                if(myIntList.get(i) > max){
                    max = myIntList.get(i);
                }else if(myIntList.get(i) < min){
                    min = myIntList.get(i);
                }
            }

            if(userInput == 1){
                System.out.println("Enter a number into Arraylist:");
                int number = scanner.nextInt();
                myIntList.add(2,number);
            }
            if(userInput == 2){
                System.out.println(myIntList);
            }
            if(myIntList.size()>0){
                if(userInput == 3){
                    System.out.println("Maximum is: " +max);
                }
                if(userInput == 4){
                    System.out.println("minimum is: " +min);
                }
            }
        }
    }
}
