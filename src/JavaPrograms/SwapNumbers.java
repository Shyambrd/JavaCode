package JavaPrograms;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Here we will swap two numbers without using third number
		
		int x= 25;
		int y = 28;
		System.out.println("The numbers before swap are X : " + x +" and Y : " +y);
	
		swapNums(x,y);

		System.out.println("The numbers after swap are X : " + x +" and Y : " +y);
		System.out.println(" You must be wondering how these values of x and y are same again"
				+ "\n This is beacuse x and y are premitive data types and they are stored in stack (another part of memory)"
				+ "\n When we make changes in swapNums() , the changes are done in to the references which we passed in the method not the actual variable.");
	}

	public static void swapNums(int x, int y) {
		// TODO Auto-generated method stub
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("The numbers after swap are X : " + x +" and Y : " +y);
		
	}

}
