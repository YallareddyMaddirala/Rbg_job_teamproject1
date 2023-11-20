package logicalProgrames;

import java.util.*;

public class FindOccuranceCharacter {

	public static void main(String[] args) 
	{
		String str = "Helloooooooooooooooooooooooooooooooooooo";
		Map<Character,Integer> map = new HashMap();
		char[] c = str.toCharArray();
		
		for(char ch: c)
		{
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
			}
				else
				{
				
					map.put(ch,1);
				}
				
			}
		System.out.println(map);
		}
	}
		

