package capriotti.anthony.Phonebook;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by anthonycapriotti on 2/7/17.
 */
public class Phonebook {
    private TreeMap<String, String> phoneBook = new TreeMap<String, String>();

    public String lookUp(String name){
        return null;
    }

    public void add(String name, String number){
        phoneBook.put(name, number);
    }

    public void remove(String name){
        phoneBook.remove(name);
    }

    public String printListEntry(){
        for(Object Key : phoneBook.keySet()){
            String key = phoneBook.get(Key);
            String value = phoneBook.

        }

    }

    public String reverseLookUp(String number){
        return null;
    }


}
