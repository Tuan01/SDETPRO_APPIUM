package lesson2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your height: ");
        float heightValue = scanner.nextFloat();
        System.out.println("Please enter your weight: ");
        float weightValue = scanner.nextFloat();
        float bmiValue = weightValue / (heightValue*2);
        DecimalFormat value = new DecimalFormat("#.#");
        System.out.println("Gia Tri BMI la: " +value.format(bmiValue));
        if (bmiValue <= 18.5){
            System.out.print("UnderWeight");
        } else if(bmiValue < 24.9){
            System.out.print("Normal weight");
        } else if(bmiValue < 29.9){
            System.out.println("Overweight");
        } else {
            System.out.println("Obsity");
        }
    }
}
