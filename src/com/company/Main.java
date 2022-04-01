package com.company;

public class Main {

    public static void main(String[] args) {
        isPalindrome(101);
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;
        int lastDigit;
        int OriginalNumber = number;

        while (Math.abs(number) > 0) {

            reverse = reverse * 10;

            lastDigit = number % 10;

            reverse = reverse + lastDigit;
            System.out.println("Last Digit = " + lastDigit);
            System.out.println("First reverse= " + reverse);

            number = number / 10;
            System.out.println("Number= " + number);
        }

        if (reverse == OriginalNumber) {
            System.out.println(reverse);
            System.out.println("This is a Palindrome");
            return true;
        } else {

            System.out.println("Not Palindrome = " + reverse);
            return false;
        }
    }

}
