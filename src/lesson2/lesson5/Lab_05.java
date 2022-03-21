package lesson2.lesson5;

import java.util.*;

public class Lab_05 {
    public static void main(String[] args) {
        Map<Integer, String> infoStudent = new HashMap<>();
        boolean isContinuing = true;
        while (isContinuing) {

            System.out.println("============Menu==========");
            System.out.println("1. Input student info");
            System.out.println("2. Find Student by ID");
            System.out.println("3. Exit");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Option number, please: ");
            int userInput = scanner.nextInt();
            if (userInput == 1) {
                System.out.println("Student Name:");
                String nameStudent = scanner.next();
                System.out.println("Student ID: ");
                int idStudent = scanner.nextInt();
                infoStudent.put(idStudent,nameStudent);
            } else if(userInput == 2){
                System.out.println("Please enter idStudent that you want to find: ");
                int idStudent = scanner.nextInt();
                System.out.println("Name of student is: " +infoStudent.get(idStudent));
            } else if (userInput == 3){
                isContinuing = false;
            }
        }
    }
}
