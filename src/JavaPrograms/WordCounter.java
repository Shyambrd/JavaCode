package JavaPrograms;

import java.util.ArrayList;

public class WordCounter {

	static ArrayList smallWords = new ArrayList();
	static ArrayList BigWords = new ArrayList();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList a = new ArrayList();
		a.add("Classes");
		a.add("Object");
		a.add("Abstraction");
		a.add("Inheritance");
		a.add("Polymorphism");
		a.add("Encapsulation");
		
		//System.out.println(a);
		
		countWords(a);
		
		
	}

	private static void countWords(ArrayList a) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i<a.size();i++)
		{
			//System.out.println(a.get(i));
			String temp = (String) a.get(i);
			int count = temp.length();
			
			//System.out.println(" Word : "+ temp + "  character count : "+ count );
			if (count <10)
			{
				smallWords.add(temp + " CharCount:" + count);
			}
			else 
			{
				BigWords.add(temp + " CharCount:" + count);
			}
		}
		displayWords();
		
	}

	private static void displayWords() {
		// TODO Auto-generated method stub
		System.out.println("Below are the small Words : \n");
		
		for (int j =0 ; j < smallWords.size();j++)
		{
			System.out.println( smallWords.get(j)  );
		}
		System.out.println(" \nBelow are the Big Words : \n");
		for (int j =0 ; j < BigWords .size();j++)
		{
			System.out.println( BigWords.get(j)  );
		}
		
	}

}
