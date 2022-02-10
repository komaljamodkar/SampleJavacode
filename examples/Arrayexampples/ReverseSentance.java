package Arrayexampples;

import java.util.Scanner;

public class ReverseSentance {
    public static void main(String[] args) {
        String str="xof nworb kciuq ehT";
        reverseString(str);
        reverseString1(str);
    }
    public static void reverseString1(String str) {
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.println("reverse :"+sb);
    }

    public static void reverseString(String str) {
        String temp="";
        char ch;
        String arr[]=str.split("");
        for(int i=0;i<str.length();i++) {
            ch=str.charAt(i);
            temp=ch+temp;
        }
        System.out.println("reverse :"+temp);
    }
}
