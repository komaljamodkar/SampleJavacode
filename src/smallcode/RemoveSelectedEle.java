package smallcode;

import java.util.*;

public class RemoveSelectedEle {
public static void removeduplicate(List<String> ls){
    //remove duplicates
    Set<String> ls1=new HashSet<>(); // create a set to remove duplicate from list add
    ls1.addAll(ls);
    System.out.println("set list :"+ls1);
    //ls();
    //ls.removeIf(l->); // single param 1
    //ls.removeIf(l->l.);
    ls1.removeIf((l->l.charAt(0)=='m'));
    System.out.println("removed  element starts with m- list :"+ls1);

    }

    public static void removeduplicate1(List<String> ls){
        List<String> ls1=new ArrayList<>();// add elements in list
        //remove duplicates
        for(String l:ls){
            if(!(ls1.contains(l))){
                ls1.add(l);
            }
        }
        System.out.println("removed duplicate element list :"+ls1);

        List<String> ls3=new ArrayList<>();
        for(String l: ls1){
            if(!(l.charAt(0)=='m')){
                ls3.add(l);
            }
        }
        System.out.println("remove element starts with m- list :"+ls3);
    }

    public static void removeduplicate2(List<String> ls){
        List<String> ls1=new ArrayList<>();// add elements in list with duplicate remove
        //remove duplicates
        for(String l:ls){
            if(!(ls1.contains(l))){
                ls1.add(l);
            }
        }
        System.out.println("removed duplicate element list :"+ls1);

        //List<String> ls3=new ArrayList<>();
        ls.clear(); // clear 1st list add in same

        for(String l: ls1){
            if(!(l.charAt(0)=='m')){
                ls.add(l);
            }
        }
        System.out.println("remove element starts with m- list :"+ls);
    }
    public static void main(String[] args) {
        List<String> ls=new ArrayList<>();
        ls.add("apple");
        ls.add("mango");
        ls.add("pinapple");
        ls.add("appleA");
        ls.add("apple");
        ls.add("mango");
        ls.add("appleb");

        removeduplicate(ls);
        removeduplicate1(ls);
        removeduplicate2(ls);
    }
}
