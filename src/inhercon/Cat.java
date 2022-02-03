package inhercon;

public class Cat extends Anilmal{
    private String name;
    public Cat(){
        super(5);
        System.out.println("Cat");

    }
    public Cat(int age){
        super(5);
        System.out.println("Cat");

    }

    @Override
    public String setName(String name) {
        return this.name=name;
    }

    @Override
    protected void printname() {
        System.out.println("print name :"+name);
    }

    public int getspeed(int val){
        return val;
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("cat eating");
    }
}
