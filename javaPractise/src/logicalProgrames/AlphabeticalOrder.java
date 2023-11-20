package logicalProgrames;

import java.util.Arrays;

public class AlphabeticalOrder {

	public static void main(String[] args) 
	{
		String str="bcda";
		char[] ch=str.toCharArray();
		char temp;
		
		for(int i=0; i<str.length(); i++)
		{
			for(int j=i+1; j<str.length(); j++)
			{
				if(ch[i]>ch[j])
				{
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		
		System.out.println(ch);
		
		String strs="java";
		char[] chc=strs.toCharArray();
		
		Arrays.sort(chc);
		
		System.out.println(chc);

	}
}