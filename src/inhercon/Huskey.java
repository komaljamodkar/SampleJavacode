package inhercon;

public class Huskey extends Dog{
    public Huskey(){
        super();
    }

    public Huskey(int age){
        printdetails(age);
    }
    public void printdetails(int age){
        System.out.println("print huskey age :"+age);
    }
    @Override
    public void eat() {
        super.eat();
        System.out.println("huskey eating");
    }
}
