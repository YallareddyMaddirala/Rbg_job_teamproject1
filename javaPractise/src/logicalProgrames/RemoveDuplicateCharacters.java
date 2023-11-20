package logicalProgrames;

import java.util.*;

public class RemoveDuplicateCharacters {

	public static void main(String[] args)
	{
		String str="programing";
		StringBuilder sb=new StringBuilder();
		Set<Character> set=new LinkedHashSet();
		
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
