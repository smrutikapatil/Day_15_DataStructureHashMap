package com.hashtable;

import org.junit.Assert;
import org.junit.Test;

public class MyHashMapTest {
	@Test
	public void givenASentenceWhenWorldAreAddedToListShouldReturnWordFrequency() {
        String sentence = "To be or not to be" ;
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();
        String[] words = sentence.toLowerCase().split( " ");
        for (String word : words) {
            Integer value =  myHashMap.get(word);
            if(value == null) {
                value =1;
            }
            else {
                value = value + 1;
            }
            myHashMap.add(word, value);
        }
        int frequency = myHashMap.get("to");
        System.out.println(myHashMap);
          System.out.println("Frequency of to is: "+frequency);
      }
}