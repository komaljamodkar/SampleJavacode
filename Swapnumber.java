package Arrayexampples;

import java.util.Scanner;

public class Swapnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int x=0,y=0;
        int i=0;
        while(i<n) {
            x=sc.nextInt();
            y=sc.nextInt();
            swapnum(x,y);
            i++;
        }
    }
    public static void swapnum(int x,int y) {// x=20 y=30
        x=x+y; //x=50
        y=x-y; //y=20
        x=x-y; //x=30

    }
}
