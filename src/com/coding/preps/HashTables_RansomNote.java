package com.coding.preps;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class HashTables_RansomNote {

  
    public static void main(String[] args) throws IOException {
    	
    	String[] magazine = {"give","me", "one", "grand", "today", "night"};
    	String[] note = {"give", "me", "one", "grand", "today"};
    	
    	HashMap<String, Integer> MagazineMap = new HashMap<String, Integer>();
        HashMap<String, Integer> NoteMap = new HashMap<String, Integer>();
        String output = "No";
        for(int i=0; i<magazine.length; i++)
        {
        	int count =0;
        	if(MagazineMap.containsKey(magazine[i]))
        	{
        		count = MagazineMap.get(magazine[i]);
        	}
        
             MagazineMap.put(magazine[i], count+1);
        }

        for(int i=0; i< note.length; i++)
        {
        	int count =0;
        	if(NoteMap.containsKey(note[i]))
        	{
             count = NoteMap.get(note[i]);
        }
            NoteMap.put(note[i], count+1);
        }

        for(int i =0;i<NoteMap.size(); i++)
        {
            if(MagazineMap.containsKey(note[i]) && NoteMap.get(note[i]) <= MagazineMap.get(note[i]))
            {
                output = "Yes";
            }
            else
            {
                output = "No";
                break;
            }
        }

        System.out.print(output);


    }	
    
}
