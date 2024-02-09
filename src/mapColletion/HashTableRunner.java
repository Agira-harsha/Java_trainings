package mapColletion;

import java.util.Hashtable;
import java.util.Map;

public class HashTableRunner {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1,"harsha");
        hashtable.put(2,"harsha");
        hashtable.put(3,"virat");
        for(Map.Entry<Integer,String> entry: hashtable.entrySet()){
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }
    }
}
