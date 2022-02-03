package pkg1.pkg2;

public class Primitivecheck {
    public static void main(String[] args) {
        Integer val=new Integer(34);
        Integer val1=Integer.valueOf(12);
        Integer val2=Integer.parseInt("45");
        Integer val3=10;
        Integer val4=null;
        int Public=45;

      //  int val5=null; error
        Integer val5=val4;
        int val6=val4;// null ptr exception , primitive cant contais null
        System.out.println(val6);


    }
}
