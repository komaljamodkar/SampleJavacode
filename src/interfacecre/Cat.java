package interfacecre;
//Run extends walk
public class Cat implements Run{
    @Override
    public int getSpeed() {
       // return Run.super.getSpeed();
        return 15;
    }
}
