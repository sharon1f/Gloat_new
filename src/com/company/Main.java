package com.company;
import  java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        // write your code here

        String repretword[] = {"ABDA", "ABBACDA", "ABCACBEDD", "AB"};
        for (int i = 0; i < repretword.length-1; i++) {
            char character = repretword[i].charAt(i);
            int firstIndex = repretword[i].indexOf(character);
            int lastIndex = repretword[i].lastIndexOf(character);
            if (firstIndex != lastIndex) {
                System.out.println("The character '" + character + "' is repeated");

            }
        }
         int arr[]={1,6,5,8,4,3};
           Arrays.sort(arr);
            System.out.println(arr.length-1);
            System.out.println(arr.length-2 );


    }
}
