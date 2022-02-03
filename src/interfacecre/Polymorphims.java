package interfacecre;

public class Polymorphims {
    public static void main(String[] args) {
        Huskey h=new Huskey();
        h.getTaillength();
       Dog d=h;
       d.run();
       Hastail ht=h;
        System.out.println(h.getTaillength());

    }
}
