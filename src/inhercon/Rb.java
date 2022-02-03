package inhercon;

public class Rb extends Rabbit{
    @Override
    public void print(int val) {
        super.print(7); //call parent class ovveride method with super keyword
       // super();error not to call construcor overrride
       // super.print(val);
       // this.print(5); pointing to current class method recusive stack overflow error
        System.out.println("value in Rb class :"+val);
    }

    public static void main(String[] args) {
        Rb r=new Rb();
        r.print(4);
    }
}
