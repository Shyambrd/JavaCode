package JavaPrograms;

public class SuffixAdder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//In this program we will count the characters in String and if it has length less than 10 
		// then we will add # at the end.
		
		String s1 ="Hello";
		String s2 = "WorldIsGood";
		String s3 = "Hi";
		
		System.out.println("Before adding suffix Strings are : \n 1) S1 : "+s1 +"\n S2 : "+s2 +"\n S3 : " +s3 +"\n");
		
		System.out.println("After adding suffix : ");
		String s4 = addSuffix(s1);
		System.out.println(s4);
		
		String s5 = addSuffix(s2);
		System.out.println(s5);
		
		String s6 = addSuffix(s3);
		System.out.println(s6);
	}

	private static String  addSuffix(String s1) {
		// TODO Auto-generated method stub
		
		if (s1.length()<10)
		{
			int a = 10-s1.length();
			
			for (int i=0;i<a;i++)
			{
				s1= s1+"#";
			}
			
		}
		return s1;
		
	}

}
