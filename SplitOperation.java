package Arrayexampples;

public class SplitOperation {
    public static void main(String[] args) {
        String text="Selenium Webdriver with 'PYTHON' from";
        String []words=text.split(" ");
        String pass=words[3].replace("'", " ").replace("'", " ").trim();
        System.out.println("pass :"+pass);

        String []words1=text.split("'");
        String pass1=words1[1].split("'")[0];
        System.out.println("pass 1:"+pass1);
    }
}
