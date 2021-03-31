

/*
https://leetcode.com/problems/group-anagrams/ 
Date -30/03/2021
Made by Satyam and Poorvi*/

package com.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;
public class GroupAnagrams {
	 
	    public List<List<String>> groupAnagrams(String[] strs) {
	        HashMap<String,List<String>> find=new HashMap<>();
	        List<List<String>> output=new ArrayList<>();
	        for (String s : strs)
	        {
	            char tempArray[] = s.toCharArray();
	            Arrays.sort(tempArray);
	            String sortedString=new String(tempArray);
	            
	            List<String> eilot=new ArrayList<>();
	            eilot.add(s);
	            
	            if(!find.containsKey(sortedString))
				{
					find.put(sortedString,eilot);
				}
				else
				{
	                List<String> eliot1=find.get(sortedString);
	                eliot1.add(s);
					find.put(sortedString,eliot1);
				}
	        }
	        for(Map.Entry<String,List<String>> entry:find.entrySet())
	        {
	            output.add(entry.getValue());
	        }
	        return output;
	    }
	}

