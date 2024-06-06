package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw ?"));

        System.out.println("********************");

        System.out.println(convertDecimalToBinary(5));
        System.out.println(convertDecimalToBinary(6));
        System.out.println(convertDecimalToBinary(13));
    }

    public static boolean checkForPalindrome(String words){
        System.out.println("************************");
        List<String> wordsAtChar = List.of(words.toLowerCase().replaceAll("[^a-zA-z0-9]", "").trim().split(""));
        System.out.println(wordsAtChar);
        List<String> reverseWordsAtChar = new LinkedList<>();
        for(int i = wordsAtChar.size()-1 ; i >= 0 ; i-- ){
            reverseWordsAtChar.add(wordsAtChar.get(i));
        }
        System.out.println(reverseWordsAtChar);
    return wordsAtChar.equals(reverseWordsAtChar);
    }

    public static String convertDecimalToBinary(int numb){
        if ( numb == 0 ){
            return "0";
        }
        String binaryNumb = "";
        while(numb > 0 ){
          if(numb % 2 == 0 ){
              binaryNumb = 0 + binaryNumb;
          } else {
              binaryNumb = 1 + binaryNumb;
            }
            numb = numb / 2;
        }
        return binaryNumb;
    }

}