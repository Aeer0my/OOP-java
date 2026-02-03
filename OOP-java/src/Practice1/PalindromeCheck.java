package Practice1;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String str = input.nextLine();

        input.close();

        boolean result = isPalindrome(str);

        if(result){
            System.out.println("It's a palindrome.");
        } else {
            System.out.println("It's not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str){
        String reversed = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        return reversed.equals(str);
    }
}
