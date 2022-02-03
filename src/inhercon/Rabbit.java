package inhercon;

//super keyword call parent class method super.setAge(); ,super.run(); in method and constrcutor
//super()-start call 1st stat in constructor call parent cunstructor

//this- pointing to current instance variable if same name in method/constructor
//this()-1st line in constructor call
//in constructor chaining points to inner constructor 1stcall in 1st line
//pass the param with this (,) to another param consctuctor , not to call in methods
public class Rabbit extends Anilmal{
    int x;
    String name;
    public Rabbit(int x,int y){
        this(4);//points to below cons
    }
    @Override
    public String setName(String name) {
        return this.name=name;
    }
    Rabbit(int x){
        this.x=x;
    }

    @Override
    protected void printname() {
        System.out.println("print name :"+name);
    }

    @Override
    public void printdetails() {
        super.printdetails();
    }
    public void printdetails(int age) {
        System.out.println("prnit age rabbit:"+age);
    }

    public void run1(int x){
        this.x=x;
        super.eat();
    }
    public Rabbit(){
        //super; not compile
    //super(3);
        super();
    super.setAge(1);
    this.setAge(3);
    }
    public Rabbit(int age,int x,int y){
      //  this(age);// recursive call if only 1 param
  // super();
   // this(); //super() and this() not to in same constructor
        super(5);
    setAge(2);

    }
    public void print(int val){
        System.out.println("print value rfom rabbit class :"+val);
    }
}
