package inhercon;
public class Polymorphims {
    public static void main(String[] args) {
        Huskey h=new Huskey();
        h.setAge(5);
       Dog d=h;
       d.run();

        Anilmal cat=new Cat();
        Cat maycat=(Cat)cat;
        System.out.println(((Cat)cat).getspeed(5));
        
    }
}
