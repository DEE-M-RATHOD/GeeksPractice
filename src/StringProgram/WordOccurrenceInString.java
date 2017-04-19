package StringProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by deepali on 15-04-2016.
 */
public class WordOccurrenceInString {
    public static void main(String[] args) {
        String str = "";
        str = new Scanner(System.in).nextLine();

        String[] words = str.toLowerCase().split("\\s+");
        Map<String, Integer> wordCount = new HashMap<String, Integer>();
        for(String word : words){
            Integer count = wordCount.get(word);
            if(count == null){
                count = 0;
            }
            wordCount.put(word,count+1);

        }
        System.out.println(wordCount);

    }
}
