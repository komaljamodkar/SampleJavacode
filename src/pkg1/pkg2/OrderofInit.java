package pkg1.pkg2;

class Example{
    private String name="dog";
    {
        System.out.println(name);
    }
    private static int count=0;
    static{
        System.out.println(count);
    }
    {
        count+=10;
        System.out.println(count);
    }

    public Example(){
        System.out.println("constructor 1");
    }
}
class Demo{
    static {
        add(2);
    }
    static void add(int num){
        System.out.print(num+" ");
    }
    Demo(){
        add(5);
    }
    static {
        add(4);
    }
    {
        add(6);
    }
    static {
        new Demo();
    }
    {
        add(8);
    }
}

public class OrderofInit {
    public static void main(String[] args) {
        Example ex=new Example();
        new Demo(); //2,4,6,8,5,6,8,5 in seq
    }

}
