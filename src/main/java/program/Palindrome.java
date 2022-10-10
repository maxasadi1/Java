package program;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String original;
        StringBuilder reverse = new StringBuilder();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter string or number to check if it is a palindrome");
        original = in.nextLine();
        int length = original.length() - 1;
        for (int i = length ; i >=0 ; i--) {
            reverse.append(original.charAt(i));
        }
        if(reverse.toString().equals(original))
            System.out.println("Entered string/number is a palindrome");
        else
            System.out.println("Entered string/number is not a palindrome");
    }
}
