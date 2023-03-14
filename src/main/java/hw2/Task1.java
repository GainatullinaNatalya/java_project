package hw2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

//        1. Напишите метод, который принимает на вход строку (String) и
//        определяет является ли строка палиндромом (возвращает boolean значение).
        System.out.println("Enter a string to check if it is a palindrome: ");
        String string = readString();
        System.out.println(definePalindrome(string));
    }

    public static String readString() {
//        System.out.println("Enter string: ");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        in.close();
        return string;
    }

    public static boolean definePalindrome(String str) {
        return str.equals((new StringBuilder(str)).reverse().toString());
    }
}
