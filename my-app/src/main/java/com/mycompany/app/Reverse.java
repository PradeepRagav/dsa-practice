package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class Reverse {
    /*
    * Reverse array of numbers
    *
    * */
    public static List<Integer> reverseNumber(List<Integer> numbers) {
        List<Integer> reverseNumbers = new ArrayList<>();
        for(int i=numbers.size()-1;i>=0;i--) {
            reverseNumbers.add(numbers.get(i));
        }
        return reverseNumbers;
    }

    /*
    * Reverse a string
    *
    * */
    public static String reverseString(String aString) {
        char[] chars = new char[aString.length()];
        aString.getChars(0,aString.length(), chars, 0);
        System.out.println(chars);
        char[] revChars = new char[aString.length()];
        int indexNew = 0;
        for(int index=aString.length()-1;index>=0;index--) {
            revChars[indexNew] = chars[index];
            indexNew++;
        }
        System.out.println(revChars);
        return new String(revChars);
    }

    /*
    * Reverse a number
    * */
    public static int reverseNumber(int num) {
        List<Integer> newNumberList = new ArrayList<>();
        while(num > 0) {
            int lastDigit = num % 10;
            newNumberList.add(lastDigit);
            num = num / 10;
        }
        int newNumber = 0;
        for(int index=0; index<newNumberList.size(); index++) {
            newNumber += (int) (newNumberList.get(index)*(Math.pow(10,(newNumberList.size()-1) - index)));
        }
        return newNumber;
    }


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(reverseNumber(numbers));
        System.out.println(reverseString("pradeep"));
        System.out.println(reverseNumber(991631377));
    }
}
