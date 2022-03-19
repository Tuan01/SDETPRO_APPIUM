package lesson2.lesson6;
public class Lab_6_3 {
    public static void main(String[] args) {
        String myStr = "123fdfdf45nabc674jfgfgf9999954dssds3343gfdgd8";
        char[] passwordCharacters = myStr.toCharArray();
        for (char single_char : passwordCharacters){
            if(Character.isDigit(single_char))
            {
                System.out.print(Character.toString(single_char));
            }
        }
    }
}
