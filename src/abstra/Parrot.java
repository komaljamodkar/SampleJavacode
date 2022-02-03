package abstra;
// if 2 abstract class a1 and a2 in a2 no nned to implement but in another a3 class need to implenet all abs method
public class Parrot extends Bird{
    String name;
    @Override
    public void run() {

    }

    @Override
    public void setname(String name) {
        this.name=name;

    }
    public void getName(){
        System.out.println("name :"+name);
    }
}
