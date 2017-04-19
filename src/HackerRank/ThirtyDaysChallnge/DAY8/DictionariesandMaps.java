package HackerRank.ThirtyDaysChallnge.DAY8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by deepali on 30-09-2016.
 */
public class DictionariesandMaps {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> dictionary = new HashMap<String, Integer>();

        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            dictionary.put(name,phone);
        }
     /*   for(String key :  dictionary.keySet()){
            System.out.println(key + " " + dictionary.get(key));
        }*/
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(dictionary.containsKey(s)){
                System.out.println(s+"="+dictionary.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
