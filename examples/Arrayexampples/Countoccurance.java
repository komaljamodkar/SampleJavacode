package Arrayexampples;

import java.util.HashMap;

public class Countoccurance {
    public static void main(String[] args) {

    }
    public static void coutOccurance(String str){
        HashMap<Character,Integer> chcount=new HashMap<>();
        char[]words=str.toCharArray();
        for(char ch:words){
            if(chcount.containsKey(ch)){
                chcount.put(ch,chcount.get(ch)+1);
            }
            else{
                chcount.put(ch,1);
            }
        }
    }
}
