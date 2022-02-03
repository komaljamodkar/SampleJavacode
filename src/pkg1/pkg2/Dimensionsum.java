package pkg1.pkg2;

public class Dimensionsum {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
       int sum=0;
        for(int i=0,j=0;i< arr.length && j<arr.length;i++,j++){
        if(i==j){
            System.out.println("val:"+arr[i][j]);
           sum+=arr[i][j];
        }
        }
        System.out.println("left diagonal sum :"+sum);

        for(int i=0,j=arr.length-1;i< arr.length && j>=0;i++,j--){

                System.out.println("val:"+arr[i][j]);
                sum+=arr[i][j];
        }
        System.out.println("right diagonal sum :"+sum);

        for(int i=0,j=1;i< arr.length && j==1;i++){

            System.out.println("val:"+arr[i][j]);
            sum+=arr[i][j];
        }
        System.out.println("middle diagonal sum :"+sum);
    }
}
