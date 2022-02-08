package Arrayexampples;
//find left diagonal and sum
public class LeftRightDiagonalsum {
    public static void main(String[] args) {
        int sum=0;
        int [][]arr= {{1,2,3},{4,5,6},{7,8,9}};
        //int [][]arr1=new int[3][3];
        // add element arr[0][1]=3;....

        System.out.println("print 2d array");
        printarray(arr);
        printleftdiagonal(arr);
        printrighttdiagonal(arr);
        printleftdiagonalsum(arr,0);
        printrighttdiagonalsum(arr,0);
        printmaxmin(arr);
    }
    public static void printarray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    //print left diagonal
    public static void printleftdiagonal(int arr[][]){
        // for(int i=0,j=0;i< arr.length && j<arr.length;i++,j++){ in 1 line
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    System.out.print("left val :"+arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    //print left diagonal sum
    public static void printleftdiagonalsum(int arr[][], int sum){
        sum=0;
        // for(int i=0,j=0;i< arr.length && j<arr.length;i++,j++){ in 1 line
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                    System.out.print("left val :"+arr[i][j]+" ");
                    sum+=arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("sum :"+sum);
    }

    //print right diagonal
    public static void printrighttdiagonal(int arr[][]){
        for(int i=0,j=arr.length-1;i< arr.length && j>=0;i++,j--){
            System.out.println("right val:"+arr[i][j]);
        }
    }

    //print right diagonal sum
    public static void printrighttdiagonalsum(int arr[][],int sum){
        sum=0;
        for(int i=0,j=arr.length-1;i< arr.length && j>=0;i++,j--){
            System.out.println("right val:"+arr[i][j]);
            sum+=arr[i][j];
        }
        System.out.println(" sum :"+sum);
    }

    //print middle col find max -8, print min from col-7
    public static void printmaxmin(int arr[][]){
        for(int i=0,j=1;i<arr.length;i++){
            System.out.println("right val:"+arr[i][j]);

        }
    }
}
