package logicalProgrames;

public class ReverseNumber {

	public static void main(String[] args) 
	{
			int num=12345, sum=0, rem;
			
			while(num>0)
			{
				rem=num%10;
				sum=sum*10+rem;
				num=num/10;
			}
			
			System.out.println(sum);

	}

}
