package capriotti.anthony.Phonebook;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.Assert;


import java.util.TreeMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;


/**
 * Created by anthonycapriotti on 2/7/17.
 */
public class PhonebookTest {
    Phonebook phonebook;

    @Before
    public void setUp(){
        phonebook = new Phonebook();
        TreeMap<String, String> book = new TreeMap<String, String>();
        phonebook.add("Cap", "555-555-5555");
        phonebook.add("Lady", "302-666-7777");
    }

    @Test
    public void lookUpTest(){
        String expected = "Cap";
        String actual = phonebook.lookUp("Cap");
        assertEquals("I will return", expected, actual);

    }

    @Test
    public void addEntryTest(){
        phonebook.add("Dude", "333-333-3333");
        String expected = "Dude";
        String actual = phonebook.lookUp("Dude");
        assertEquals("Dude will return", expected, actual);
    }

    @Test
    public void removeEntryTest(){
        phonebook.add("Dude", "333-333-3333");
        phonebook.remove("Dude");
        String expected = null;
        String actual = phonebook.lookUp("Dude");
        assertEquals("Dude wont be there anymore", expected, actual);
    }

    @Test
    public void printListEntry(){
        phonebook.add("Dude", "333-333-3333");
        String expceted = "List will print";
        String actual = phonebook.printListEntry();
        assertEquals("List will return", expceted, actual);

    }

    @Test
    public void reverseLookUpTest(){

    }
}
