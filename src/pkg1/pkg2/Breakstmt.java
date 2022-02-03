package pkg1.pkg2;

import java.util.Arrays;

public class Breakstmt {
    public static void main(String[] args) {
        String [] arr={"ac","hj","er","gh","hj"};
      mloop: for(String a:arr){
            if(a.equals("hj")){
                System.out.println(" "+a);
                break mloop;
            }

        }
        int [] a={1,0,1,0,1,0,1,0};

        Arrays.sort(a);
        for(int a1:a){
        System.out.print(a1);}
        System.out.println();
    for(int i=1;i<20;i+=2){
        if(i%2==0){
            continue;
        }
        System.out.print(i);
    }


    }
}
