import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static int givenArray[] = {2,5,7,1,9};
    public static void main(String[] args) {
        //take the smallest value of a given set of integers

        usingArrays();

    }
    //take the smallest value of a given set of integers

    public static void usingArrays(){
        Arrays.sort(givenArray);
        System.out.println(givenArray[0]);
    }


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
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter your pefered number");
        int num = sc.nextInt();

        int rev = 0;

        while (num != 0){
            rev = rev * 10 + num % 10;
            num = num/10;
        }
        System.out.println(rev);*/

        //convert a letter word in to descending order
        /*String str = "ABCD";
        String rev = "";

        char[] a = str.toCharArray();
        int len = a.length;

        for(int i=len-1; i>=0; i--){
            rev = rev + a[i];
        }
        System.out.println(rev);*/

        /*String str = "ABCDEFGH";
        String rev = "";

        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());*/

        //Making a triangle pattern
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and column count you want ");
        int numberLines = sc.nextInt();
        int row, column = 0;

        for(row=0; row>numberLines; row++){
            for(column=0; column>=row; column++){
                System.out.print(" *");
            }

        }
        System.out.println( );*/

        //Take the length of a given string without length method.
        /*String charCount = "LearnAutomation";
        char[] a = charCount.toCharArray();
        int length = 0;

        for(Character c: a){
            length++;
        }
        System.out.println(length);*/
        //make descending order of a given set of integers
        /*int[] numbers = {7,3,5,9,1};
        Arrays.sort(numbers);
        reverseArray(numbers);

        System.out.println("Descending order " + Arrays.toString(numbers));
*/


        //make descending order of a given set of integers
            /*public static void reverseArray(int[] arr){
        for(int i =0, j= arr.length-1; i<j;i++, j++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }*/

        //take the smallest value of a given set of integers





}