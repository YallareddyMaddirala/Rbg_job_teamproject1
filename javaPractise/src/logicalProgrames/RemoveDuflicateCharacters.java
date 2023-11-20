package logicalProgrames;

import java.util.*;

public class RemoveDuflicateCharacters {

	public static void main(String[] args) 
	{
		String str="Programming";
		StringBuilder sb1=new StringBuilder();
		
		str.chars().distinct().forEach(c-> sb1.append((char)c));
		System.out.println(sb1);
		
		//Set<Character> set=new HashSet<Character>();
		//Doesn't fellow the insertion order
		
		Set<Character> set=new LinkedHashSet<Character>();
		// following the order
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0; i<str.length(); i++)
		{
			set.add(str.charAt(i));
		}
		
		for(Character ch: set)
		{
			sb.append(ch);
		}
      System.out.println(sb);
	}

}
