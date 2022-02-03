package inhercon;
//cant override private final  static method and constructor
public abstract class Anilmal {
    int age;
    String name;
    public Anilmal(){}
    public Anilmal(int age) {
        this.age=age;
        System.out.println("Animal");
        System.out.println("age :"+age);
    }
    public abstract String setName(String name);
    protected abstract void printname();
    public void printdetails(){
        printname();
        System.out.println("age :"+age);
    }

    public void setAge(int val){
        System.out.println("age :"+val);
    }
    public static void run(){
        System.out.println("running animal");
    }
    public void eat(){
        System.out.println("animals are eating..");
    }
}
