package logicalProgrames;

public class StringRevsrse 
	{

	public static void main(String[] args) 
	{
		String str="code is very Easy";
		
		System.out.println(reversWords(str));
		

	}
	public static String reversWords(String str)
	{
		String[] words=str.split(" ");
		String result=" ";
		for(int i=words.length-1; i>=0;i--)
		{
			if(i==0)
			{
				result=result+words[i];	
			}
			else
			{
				result=result+words[i]+" ";
			}
		}
		return result;	
	}
}
