package JavaPrograms;

public class StringSplitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// This program will split the string into set of 4 char 
		
		String s1= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("String before splitting : \n" + s1);
		System.out.println("\nString after splitting in set of 4 :");
		splitString(s1);
		
				
	}

	private static void splitString(String s1) {
		// TODO Auto-generated method stub
		int a = s1.length();
		int i=0;
		
		  for (i=0;i<=a;i=i+1)
		  {
			 try {
			  if (i%4 ==0)
			  // prints the 4 characters
				  System.out.println(s1.substring(i, i+4));
			 }
			 catch (StringIndexOutOfBoundsException e)
			 {
				// when sys throws IndexOutOfBound prints all the remaining chars 
				 System.out.println(s1.substring(i,a));
			 }
		  
		  }
	
	}

}
