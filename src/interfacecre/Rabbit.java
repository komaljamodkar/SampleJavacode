package interfacecre;

public class Rabbit extends Bear implements Herbivore,Omivore,Hop{
    @Override
    public void run(int speed) {

    }

    @Override
    public void printdetails() {
        System.out.println("hop height of rabbit :"+Hop.gethopHeigh());
    }

    @Override
    public void eatCerivore() {

    }

    @Override
    public void eatHerbivore() {

    }

    @Override
    public void eatOmnivore() {

    }

    @Override
    public void eatfood() {
        System.out.println("eat food method from 2 interface");
    }
}
