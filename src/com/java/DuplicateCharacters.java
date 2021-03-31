package com.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
//https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/

public class DuplicateCharacters {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(s);
		createMap(s);
	}
	static void createMap(String s)
	{
		Map<Character,Integer> find=new HashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(find.containsKey(s.charAt(i)))
			{
				find.put( s.charAt(i) , find.get(s.charAt(i))+1);
			}
			else
			{
				find.put(s.charAt(i),1);
			}
		}
		System.out.println(find);
		for (Map.Entry<Character,Integer> entry:find.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey() + " value " + entry.getValue());
			}
		}
		
	}
	
}
