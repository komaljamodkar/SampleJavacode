package Arrayexampples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
SAMPLE INPUT
        5 3
        3 5 7 2 3
        10 7 6
        SAMPLE OUTPUT
        7 5 5

        Explanation
        The greatest number that is smaller than 10 is 7.
        The greatest number that is smaller than 7 is 5.
        The greatest number that is smaller than 6 is 5.

*/

public class Findmaxmin {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size and k size");
        int n=sc.nextInt();
       int k=sc.nextInt();
        int i=0,j=0;
        System.out.println(n+" "+k);
        int arrsize[]=new int[n];
        int ksize[]=new int[k];

        while(i<n){
            arrsize[i]=sc.nextInt();
            i++;
        }

        while(j<k){
            ksize[j]=sc.nextInt();
            j++;
        }

        System.out.println(findmxmin(arrsize, ksize));

    }
    public static List<Integer> findmxmin(int[] arrsize, int[] ksize){
        Arrays.sort(arrsize);
        List<Integer> ls=new ArrayList<Integer>();
        int k=0,max=0;
        while(k<ksize.length){
            for(int i=arrsize.length-1;i>=0;i--){
            if(ksize[k]==arrsize[i]){
            max=arrsize[i-1];
            ls.add(max);
            break;
            }
            else if(ksize[k]>arrsize[i] && !(ksize[k]<arrsize[i])){
                max=arrsize[i];
                ls.add(max);
                break;
            }

        }k++;
        }

        return ls;
    }
}
