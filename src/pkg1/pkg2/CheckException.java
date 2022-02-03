package pkg1.pkg2;

public class CheckException {
    public static void main(String[] args) {
    //mymethod();
        mymethod1();
    }
    //unchecked exception handle at compile time so it showing error
    public static void mymethod() throws Exception {
        throw new Exception("failed to load");
    }
//runtime exception unchecked , shows error exceptio at runtime
    public static void mymethod1() throws RuntimeException {
        throw new NullPointerException("failed to load");
    }
}
