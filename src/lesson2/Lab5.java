package lesson2;

import java.util.Arrays;

public class Lab5 {
    public static void main(String[] args) {
        int[] Array = {12,45,67,43,1,5,7,3,6,8};
        int temp = 0;
        for (int i=0; i < Array.length; i++){
            for(int j=i; j <Array.length; j++){
                if(Array[j] < Array[i]){
                    temp = Array[j];
                    Array[j] = Array[i];
                    Array[i] = temp;
                }
            }
        }
        System.out.println("The integer array from min to max is: " + Arrays.toString(Array));
    }
}

