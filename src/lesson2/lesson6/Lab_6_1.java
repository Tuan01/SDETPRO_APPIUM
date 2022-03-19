package lesson2.lesson6;

public class Lab_6_1 {
    public static void main(String[] args) {
        String myString = "2hrs and 5 minutes";
        String[] words = myString.split("\\s");
        String subMinutes = words[2];
        int minuteToInt = Integer.parseInt(subMinutes);
        String subHourInString = words[0];
        String[] texts = subHourInString.split("", 2);
        String subHour = texts[0];
        int hourToInt = Integer.parseInt(subHour);
        int  sumMinutes = (hourToInt*60) + minuteToInt;
        System.out.println("The total of minutes: " +sumMinutes);
    }
}
