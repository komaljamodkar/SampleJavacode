package interfacecre;

public class Mainclas{
    public static void main(String[] args) {
    Huskey h=new Huskey();
    h.getTaillength();
        System.out.println("length :"+h.getTaillength());
    h.run();
    h.run(10);
    Bear b=new Bear();
    b.eatCerivore();
    b.eatHerbivore();
    b.eatOmnivore();
    Rabbit r=new Rabbit();
    r.eatplant();
    r.printdetails();
    Cat c=new Cat();
    int x=c.getSpeed();
        System.out.println("spped :"+x);
    }
}
