package logicalProgrames;

import java.util.*;

public class FindOccuranceInteger {

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,1,2,3,4,5};
		Map<Integer, Integer> map=new HashMap();
		
		for(int v: arr)
		{
			if(map.containsKey(v))
			{
				map.put(v, map.get(v)+1);
			}
			else
			{
				map.put(v, 1);
			}
		}
    System.out.println(map);
	}

}
