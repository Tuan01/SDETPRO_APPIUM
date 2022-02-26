package lesson2;

public class Lab3 {
    public static void main(String[] args) {
        int[] Array = {1,2,3,4,5,6,7,8,9,10,12};
        int even_count = 0;
        int old_count = 0;
        for (int i=0; i < Array.length; i++){
            if (Array[i] % 2==0){
                even_count++;
            } else{
                old_count++;
            }
        }
        System.out.println("Even numbers: " + even_count);
        System.out.println("Old numbers: " + old_count);
    }
}
