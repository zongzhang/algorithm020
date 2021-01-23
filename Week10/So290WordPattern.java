import java.util.HashMap;
import java.util.Map;

/**
 * @since 1.0
 */
public class So290WordPattern {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        if (pattern.length() != arr.length) {
            return false;
        }
        for(int i = 0; i < pattern.length(); i++){
            if(!map.containsKey(pattern.charAt(i))){
                if(map.containsValue(arr[i]))
                    return false;
                map.put(pattern.charAt(i), arr[i]);
            }
            else{
                if(!map.get(pattern.charAt(i)).equals(arr[i]))
                    return false;
            }
        }
        return true;
    }
}
