package interfacecre;

public class Huskey extends Dog implements Hastail,Canrun{
    @Override
    public int getTaillength() {
        return 45;
    }

    @Override
    public void run() {
        System.out.println("huskey is running");
    }

    @Override
    public void run(int speed) {
        System.out.println("huskey is running with speed : "+speed);
    }
}
