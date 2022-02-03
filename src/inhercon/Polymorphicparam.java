package inhercon;

public class Polymorphicparam {
    public static void main(String[] args) {
        Huskey huskey=new Huskey(4);
        huskey.setAge(34);
        huskey.setName("xyz");
        printdetails(huskey);
        Rabbit r=new Rabbit();
        r.setName("abc");
        r.printdetails(5);
        Cat c=new Cat();
        c.setAge(3);
        c.setName("pqr");
        adddetails("pqr",45);
    }
    public static Anilmal adddetails(String name,int age) {
        if (name.equals("xyz")) {
            Anilmal animal = new Huskey(age);
            animal.setName(name);
            return animal;
        }
        else if (name.equals("pqr")) {
            Anilmal cat = new Cat(age);
            cat.setName(name);
            cat.setAge(34);
            return cat;
        }

        return null;
    }
    public static void printdetails(Anilmal animal){
        animal.printdetails();
    }

}
