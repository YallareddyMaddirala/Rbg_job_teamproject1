package logicalProgrames;

public class FristNonRepeateedCharc {

	public static void main(String[] args) 
	{
		String str="abcabcder";

		for(int i=0; i<str.length(); i++)
		{
			boolean unquie=true;
			for(int j=0; j<str.length(); j++)
			{
				if(i!=j && str.charAt(i)==str.charAt(j))
				{
					unquie=false;
				}
			}

			if(unquie)
			{
				System.out.println(str.charAt(i));
      break;
				
			}
		}

	}

}
