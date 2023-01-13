package JavaPrograms;

public class Number_Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 47;
		System.out.println("Enter digit to Covert :"+n);
		convertDigit(n);
		
	}

	private static void convertDigit(int n) {
		// TODO Auto-generated method stub
		int n1=n;
		
		//System.out.println("Value of n1 :"+n1);
		//  Temp variable to calculate modulas
		int n2 = n;
		// Temp variable to get the remainder
		//System.out.println("Value of n2 :"+n2);
		
		int b=n1%10;  // 16%10 == 6
		// modulas gets the remainder
		//System.out.println("Value of b :"+b);
		int a = n2/10; // 16/10 == 1
		//System.out.println("Value of a :"+a);
		// this calculate the remaining digits 
		
		String[] singles = new String[] {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
		String[] doubles = new String[] {"","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","SixTeen","Seventeen","Eighteen","Nineteen"};
		String[] tens = new String [] {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninty"};
		//String arrays for storing words for digits
		if (a==1)
		{
			System.out.println("Digit to  Word is : "+   doubles[b+1]);
		}
		else if (b==0)
		{
			System.out.println("Digit to  Word is : "+tens[a]);
		}
		else 
		{
			System.out.println("Digit to  Word is : "+tens[a] + " "+singles[b]);
		}
	}

}
