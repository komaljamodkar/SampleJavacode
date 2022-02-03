package pkg1.pkg2;

public class Thiskeyword {
    private String fname;
    private String lname;
   public Thiskeyword(){
        this("abc","xyz");
        System.out.println("constructor 1");
    }
    public Thiskeyword(String fname,String last){
    this.fname=fname;
    lname=last;
        System.out.println("constructor 2");
    }
    public String print(){
       return fname+lname;
    }
    public static void main(String[] args) {
    Thiskeyword tk=new Thiskeyword();
        Thiskeyword tk1=new Thiskeyword("q","w");
    tk.print();
    tk1.print();
    }
}
