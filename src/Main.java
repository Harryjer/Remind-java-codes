import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //checkCount("Automation");


    /*public static void checkCount(String typeName){
        HashMap<Character, Integer> checkChar = new HashMap<Character, Integer>();
        char[] charArray = typeName.toCharArray();

        for(Character c: charArray){
            if(checkChar.containsKey(c)){
                checkChar.put(c,checkChar.get(c) + 1);
            }
            else {
                checkChar.put(c,1);
            }

        }
        System.out.println(checkChar);*/

        // reverse a number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pefered number");
        int num = sc.nextInt();

        int rev = 0;

        while (num != 0){
            rev = rev * 10 + num % 10;
            num = num/10;
        }
        System.out.println(rev);
    }


}