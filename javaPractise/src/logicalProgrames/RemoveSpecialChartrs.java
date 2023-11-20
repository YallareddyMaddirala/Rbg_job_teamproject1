package logicalProgrames;

public class RemoveSpecialChartrs {

	public static void main(String[] args) 
	{
		String str="$ja!va&ST%AR*333";
		
		String plainstr = str.replaceAll("[^a-z]", "");
		//only print small letters
		System.out.println(plainstr);
		
		String plainstr1 = str.replaceAll("[^A-Z]", "");
		//print only capital letters
		System.out.println(plainstr1);
		
		String plainstr2 = str.replaceAll("[^0-9]", "");
		//print only Numbers
		System.out.println(plainstr2);

		
		String plainstr3 = str.replaceAll("[^a-z A-Z 0-9]", "");
		//remove Special  characters 
		System.out.println(plainstr3);
	}

}
