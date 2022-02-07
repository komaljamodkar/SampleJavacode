package Arrayexampples;

import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
    String str="hello";
    reversefunction(str);
        reversefunction1(str);
        reversefunction2(str);
        reversefunction3(str);
        reversefunction4(str);
        reversefunction5(str);
    }
    //reverse string with str.chatAt()
    public static void reversefunction(String str){
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    //reverse string with str.toCharArray()
    public static void reversefunction1(String str){
        char ch[]=str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    //reverse string with allocated to temp variable
    public static void reversefunction2(String str){
       String temp="";char ch;
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            temp=ch+temp;
        }
        System.out.print(temp);
        System.out.println();
    }

    //reverse string with Stringbuilder
    public static void reversefunction3(String str){
        StringBuffer sb=new StringBuffer();
        sb.append(str);
        sb.reverse();
        System.out.print(sb);
        System.out.println();
    }

    //reverse string with StringBuffer
    public static void reversefunction4(String str){
       StringBuffer sb=new StringBuffer(str);
       sb.reverse();
        System.out.print(sb);
        System.out.println();
    }

    //reverse string with collection
    public static void reversefunction5(String str){
        char ch[]=str.toCharArray();
        List<Character> ls=new ArrayList<>();
        for(char c:ch) {
            ls.add(c);
        }
        Collections.reverse(ls);
        System.out.print(ls);
        System.out.println();
        //or
        Iterator<Character> li= ls.iterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }

    }
}
