package lesson2;

public class Lab4 {
    public static void main(String[] args) {
        int[] Array = {1,2,3,4,5,6,7,8,9,10,12};
        int min = Array[0];
        int max = Array[0];
        for (int i=1; i < Array.length; i++){
            if(Array[i] > max){
                max = Array[i];
            }else if(Array[i] < min){
                min = Array[i];
            }
        }
        System.out.println("Maximum is: " +max);
        System.out.println("Minimum is: " +min);
    }
}

