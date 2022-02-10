package Arrayexampples;

public class Missingnumber {
    public static void main(String[] args) {
        int arr[]={1,4,3,5,7,8,9,2};
        System.out.println(missingnum(arr));
    }
    public static int missingnum(int arr[]){
        int n=arr.length;
        int sum=((n+1)*(n+2))/2;
        for(int i=0;i<n;i++){
            sum-=arr[i];
        }
        return sum;
    }
}
