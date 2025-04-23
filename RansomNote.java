import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    class Solution {

    public boolean canConstruct(String ransomNote, String magazine) {
        
        Map<Character, Integer> word = new HashMap<>(); 


        // add letters and the ints to the map 
        for (Character letter : magazine.toCharArray()) { 
            if (word.containsKey(letter)) { 
                word.put(letter, word.get(letter) + 1);
            } else { 
                word.put(letter, 1);
            }
        }

        // if magazines ltter is also in word remove one letter from the map
        for (Character letter : ransomNote.toCharArray()) { 
            if (word.containsKey(letter)) { 
                word.put(letter, word.get(letter) - 1);
                if (word.get(letter) < 0 ) { 
                    return false;
                }
            } else { 
                return false;
            }
        }

        return true;

    }
}
}
