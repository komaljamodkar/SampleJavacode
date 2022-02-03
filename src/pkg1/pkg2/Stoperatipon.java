package pkg1.pkg2;

import java.util.Arrays;

public class Stoperatipon {
    public static void main(String[] args) {
        String s1="abc";
        StringBuilder sb=new StringBuilder("abc");
        String s2="abc";
        if(sb.equals(s1)){
            System.out.println("true");
        }
        int []num=new int[5];
        System.out.println(Arrays.toString(num));
    }
}
