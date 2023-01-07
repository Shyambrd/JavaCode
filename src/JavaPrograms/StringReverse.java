package JavaPrograms;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// get the input string
		
		String str = "Shyam Biradar";
		System.out.println("Original String is : ");
		System.out.println(str);
		
		String rev = revString (str);
		
		System.out.println("Reversed String is :");
		System.out.println(rev);
	}

	public static String revString(String s) {
		// TODO Auto-generated method stub
		if (s == null || s.isEmpty())
		{
			// if string is empty returns from method
			return s;
		}
		String rev = "";
		for (int i=s.length()-1;i>=0 ; i--)
		{
			// takes first character from string and keeps on adding at the END 
			rev = rev + s.charAt(i);
		}
		return rev;
		
	}

}
