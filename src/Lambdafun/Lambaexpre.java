package Lambdafun;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Animal{
    private String type;
    private boolean canJump;
    private boolean canSwim;

    public Animal(String type, boolean canJump, boolean canSwim){
        this.type=type;
        this.canSwim=canSwim;
        this.canJump=canJump;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public boolean canJump() {
        return canJump;
    }
    public String getType(){
        return type;
    }
}
//create interface
interface CheckAnimal{
    boolean check(Animal animal);
}

interface AnotherCheck{
    boolean check(Animal first,Animal second);
}
//implement this inface create a new class
class CheckCanJump implements CheckAnimal{

    @Override
    public boolean check(Animal animal) {
        return animal.canJump();
    }
}
public class Lambaexpre {
    //(Animal animal)->{return a.canJump();}
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("dog", true, true));
        animals.add(new Animal("cat", true, false));
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("rabbit", true, false));
       // print(animals, new CheckCanJump());
        print(animals,animal -> animal.canSwim());
        print(animals,animal -> !animal.canSwim());
        print(animals,(Animal animal)->{
            return animal.canSwim();
        });
        print(animals,(Animal animal)->{
           // Animal animal=new Animal("cat",true,false);
            System.out.println("checking animal :"+animal.getType());
            return animal.canJump();
        });
        Animal dog=animals.get(0);
        Animal cat=animals.get(1);
        Animal fish=animals.get(2);
        print(dog,cat,(f,s)->f.canJump() && s.canSwim());
        print(dog,fish,(first,second)->first.canJump() && second.canSwim());
       // print(animals,(Animal animal)->{animal.canJump()});
        //animal -param ()->return

        //use filter to remove
        List<String> ls=new ArrayList<>();
        ls.add("apple");
        ls.add("mango");
        ls.add("pinapple");
        ls.add("appleA");
        ls.add("appleb");
       // ls.removeIf(l ->(l.charAt(0)=='a'));
        ls.removeIf((String str)-> {
        return str.charAt(0)=='p';
        });
        System.out.println("list after filter :"+ls);
    }
    /*private static void print(List<Animal> animals,CheckAnimal filter){
    for(Animal animal:animals){
        if(filter.check(animal)){
            System.out.println(animal.getType());
        }
    }
        System.out.println();
    }*/
    //predicate interface differnet types of objects
    private static void print(List<Animal> animals, Predicate<Animal> filter){ //Predicate<String> then need String param
        for(Animal animal:animals){
            if(filter.test(animal)){
                System.out.println(animal.getType());
            }
        }
        System.out.println();
    }


    //1st n 2nd param next interface
    private static void print(Animal first,Animal second,AnotherCheck check){
        System.out.println(check.check(first, second));
    }
}
