package Arrayexampples;

import java.util.HashMap;
import java.util.Map;

public class Countoccurance {
    public static void main(String[] args) {
    String str="hello";
        coutOccurance(str);
    }
    public static void coutOccurance(String str){
        HashMap<Character,Integer> chcount=new HashMap<>();
        char[]words=str.toCharArray();
        for(char ch:words) {
            if (chcount.containsKey(ch)) {
                chcount.put(ch, chcount.get(ch) + 1);
            } else {
                chcount.put(ch, 1);
            }
        }
            for(Map.Entry entry:chcount.entrySet()){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }

    }
}
