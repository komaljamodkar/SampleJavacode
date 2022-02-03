package interfacecre;

public interface Herbivore {
    public void eatHerbivore();
    public void eatfood();
    //public void eat(){} error
   // default void eatplat(); error should have a body
    default void eatplant(){
        System.out.println("eatplant");
    }
}
