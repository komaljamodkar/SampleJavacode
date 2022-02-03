package pkg1.pkg2;

public class Staticoperation {
    static int a=10;
    final int b=13;
    static int count=0;
    public void count(){
        System.out.println(count);
    }
int r=34;

    final String x ="abc";

    public static void main(String[] args) {
        Staticoperation s=new Staticoperation();
        int b=45;
       final String x="rty";
s.count();
        System.out.print(a);
        System.out.println(s.b);
        System.out.println(s.x);
        System.out.println(x);
    }
}
