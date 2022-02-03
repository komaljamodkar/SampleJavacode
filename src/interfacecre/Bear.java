package interfacecre;

public class Bear extends Dog implements Omivore,Herbivore{
    @Override
    public void run(int speed) {

    }

    @Override
    public int getTaillength() {
        return 0;
    }

    @Override
    public void run() {

    }



    @Override
    public void eatCerivore() {
        System.out.println("eat carnovire");
    }

    @Override
    public void eatHerbivore() {
        System.out.println("eat herbivire");
    }

    @Override
    public void eatOmnivore() {
        System.out.println("eat omnivire");
    }

    @Override
    public void eatfood() {

    }
}
