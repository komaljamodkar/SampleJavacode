package interfacecre;
//run walk interface for cat class
public interface Run extends Walk{
    default int getSpeed(){
        return 5;
    }
}
