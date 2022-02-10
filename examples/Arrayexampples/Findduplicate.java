package Arrayexampples;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Findduplicate {
    public static void main(String[] args) {
        int arr[]={2,4,6,1,8,1,2,3,4,4,3,3,1,2};
        findduplicate(arr);
        findduplicate1(arr);
    }

    public static void findduplicate(int arr[]){
        List<Integer> ls=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                ls.add(arr[i]);
            }
        }
        System.out.println("list :"+ls);
    }
    public static void findduplicate1(int arr[]){
        //convert array to list
        List<Integer> ls=new ArrayList<>(arr.length);
        for(int i:arr){
            ls.add(Integer.valueOf(i));
           }
        //or
        List<Integer> ls1=Arrays.stream(arr).boxed().collect(Collectors.toList());
        //or
        List<Integer> ls2= IntStream.of(arr).boxed().collect(Collectors.toList());
        HashMap<Integer,Integer> chcount=new HashMap<>();

        for(int i:ls) {
            if (chcount.containsKey(i)) {
                chcount.put(i, chcount.get(i) + 1);
            } else {
                chcount.put(i, 1);
            }
        }
        for(Map.Entry entry:chcount.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }

    }
}
