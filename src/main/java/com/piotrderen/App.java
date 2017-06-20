package com.piotrderen;

import java.util.Scanner;


public class App
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        reverse(input);
    }

    public static String reverse(String input){
        String[] inputPart = input.split(" ");
        String word;
        StringBuilder result = new StringBuilder();
        for (String res : inputPart){
            char[] charArray = res.toCharArray();
            for (int i = 0, j = charArray.length-1 ; i < j; i++, j-- ) {
                char tmp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = tmp;
            }
            word = new String(charArray);
            result.append(word + " ");
        }
        System.out.println(result);
        return result.toString().trim();
    }
}
