// This is the text editor interface. 
// Anything you type or change here will be seen by the other person in real time.
package com.emsara.java_basics;

import java.util.ArrayList;
import java.util.HashMap;
public class StringRepo {
    
    ArrayList <String> stringArray = new ArrayList<String>();
    HashMap <String, Integer> stringMap = new HashMap<String, Integer>();
    
    public void addString(String string) {
        stringArray.add(string);
        stringMap.put(string, new Integer(stringArray.size() -1));
    }
    
    public void removeString(String string) {
    	int lastElementPos = stringArray.size()-1; // Get position of the last element
        int strArrayIndexToRemove = stringMap.get(string); // Get the position of the element to be removed 
        stringArray.set(strArrayIndexToRemove, stringArray.get(lastElementPos)); // Swap the element with last one so array, need not rearrange 
        stringArray.get(lastElementPos); // remove the last element.
        stringMap.remove(stringMap.get(string)); // remove the element from HashMap
        
               
    }
    
    public String getRandomString() {
        int randomIndex = (int) ((Math.random() * 10 * stringArray.size() ) -1) ; // Elements to start from 0..
        return stringArray.get(randomIndex);
    }
}