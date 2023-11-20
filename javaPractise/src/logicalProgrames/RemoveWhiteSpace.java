package logicalProgrames;

public class RemoveWhiteSpace {

	public static void main(String[] args) 
	{
		String str=" j a va s ta r ";
		
//		String removeSace =str.trim();
//		System.out.println(removeSace); space remove only After & Before String Only
		
		String allSpace=str.replaceAll("\\s", "");
		System.out.println(allSpace);
		
		

	}

}
