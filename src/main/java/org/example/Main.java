package org.example;

public class Main {
    public static void main(String[] args) {
        boolean result1 = isPalindrome(-1221);
        System.out.println(result1);
        boolean result2 = isPalindrome(707);
        System.out.println(result2);
        boolean result3 = isPalindrome(11212);
        System.out.println(result3);

        System.out.println("----------------------------------------------------");

        boolean result4 = isPerfectNumber(6);
        System.out.println(result4);
        boolean result5 = isPerfectNumber(28);
        System.out.println(result5);
        boolean result6 = isPerfectNumber(5);
        System.out.println(result6);
        boolean result7 = isPerfectNumber(-1);
        System.out.println(result7);

        System.out.println("----------------------------------------------------");

        String result8 = numberToWords(123);
        System.out.println(result8);
        String result9 = numberToWords(1010);
        System.out.println(result9);
        String result10 = numberToWords(-12);
        System.out.println(result10);
    }

    public static boolean isPalindrome(int num) {
        num = Math.abs(num);
        String num2 = String.valueOf(num);
        String palindromeNum = "";

        for(int i = num2.length()-1; i >= 0; i--) {
            palindromeNum += num2.charAt(i);
        }

        if(num2.equals(palindromeNum)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPerfectNumber(int num) {
        if(num < 0) {
            return false;
        } else {
            int total = 0;
            for(int i = 1; i < num; i++) {
                if(num % i == 0) {
                    total += i;
                }
            }
            if(num == total) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static String numberToWords(int num) {
        if(num < 0) {
            return "Invalid Value";
        } else {
            String num2 = String.valueOf(num);
            String word = "";

            for(int i = 0; i < num2.length(); i++) {
                if(num2.charAt(i) == '0') {
                    word += "Zero ";
                } else if(num2.charAt(i) == '1') {
                    word += "One ";
                } else if(num2.charAt(i) == '2') {
                    word += "Two ";
                } else if(num2.charAt(i) == '3') {
                    word += "Three ";
                } else if(num2.charAt(i) == '4') {
                    word += "Four ";
                } else if(num2.charAt(i) == '5') {
                    word += "Five ";
                } else if(num2.charAt(i) == '6') {
                    word += "Six ";
                } else if(num2.charAt(i) == '7') {
                    word += "Seven ";
                } else if(num2.charAt(i) == '8') {
                    word += "Eight ";
                } else if(num2.charAt(i) == '9') {
                    word += "Nine ";
                }
            }
            return word.trim();
        }
    }
}
