package inhercon;

public class Dog extends Anilmal{
    String name;
    public Dog(){
        super(3);
        System.out.println("Dog");
    }
    @Override
    public String setName(String name) {
        return this.name=name;
    }

    @Override
    protected void printname() {
        System.out.println("print name :"+name);
    }


    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog eating");
    }
}
