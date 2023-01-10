package JavaPrograms;

public class StringAppender{
	
	public static void main(String[] args) {
		
		/* here we will join three strings
		ex if "ABC" , "PQR" and "XYZ" are there then we will create "APXBQYCRZ"
		
		*/
		
		String s1 ="SHYAM";
		String s2 ="MuraliDhar";
		String s3 ="Biradar";
		String S4= "";
		int maxLength= getMaxLength (s1,s2,s3);
		//AppendSuffixes(maxLength,s1,s2,s3);
			
		System.out.println("The strings are \n 1)  "+  s1 + " \n 2)  " +s2+" \n 3) " +s3);
		
		
		
		// For S1
				if ((maxLength - s1.length())>0 )
				{
					int p = maxLength - s1.length();
					int k = 0;
					while (k < p )
					{
						s1 = s1 + "*";
						k++;
					}
				}
				
				// For S2
				int q = maxLength - s2.length();
				if ((maxLength - s2.length())>0 )
				{
					
					int k = 0;
					while (k< q )
							{
								s2 = s2 + "*";
								k++;
							}
						}
				// For S3
				int r = maxLength - s3.length();
				if ((maxLength - s3.length())>0 )
				{
					
					int k = 0;
					while (k< r )
							{
								s3 = s3 + "*";
								k++;
							}
						}

				
		
				
				
				  for (int i= 0 ; i<maxLength;i++) {
				  
					  S4 = S4 +s1.charAt(i)+ s2.charAt(i)+s3.charAt(i);
				  
				  	} 
				  S4.replace("*", "");
				  
				  System.out.println("\n Appended String is :    " + S4.replace("*", ""));
				 	}

	private static void AppendSuffixes(int maxLength, String s1, String s2, String s3) {
		// TODO Auto-generated method stub
		
		// For S1
		if ((maxLength - s1.length())>0 )
		{
			int k = 0;
			while (k< (maxLength - s1.length()) )
			{
				s1 = s1 + " ";
				k++;
			}
		}
		
		// For S2
		if ((maxLength - s2.length())>0 )
		{
			int k = 0;
			while (k< (maxLength - s2.length()) )
					{
						s2 = s2 + " ";
						k++;
					}
				}
		// For S3
		if ((maxLength - s3.length())>0 )
		{
			int k = 0;
			while (k< (maxLength - s3.length()) )
					{
						s3 = s3 + " ";
						k++;
					}
				}
	}


	private static int getMaxLength(String s1, String s2, String s3) {
		// TODO Auto-generated method stub
		
		int a1 =s1.length();
		int a2 =s2.length();
		int a3 =s3.length();
		int max = 0;
		if (a1 >= a2 && a1 >= a3)
		{
			max = a1;
		}
		else if (a2>= a1 && a2>=a3)
		{
			max = a2;
		}
		else 
		{
			max = a3;
		}
		
		//System.out.println("Max Length is :" + max);
		return max;
	}
}