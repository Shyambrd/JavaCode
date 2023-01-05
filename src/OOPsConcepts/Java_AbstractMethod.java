package OOPsConcepts;

 // This will help me understand abstract method
// Abstract method is used to create something that exists in thought but not in reality

abstract class Base {
	public Base() {
		
		System.out.println("This is an non abstract class constructor");
	}
	public void show() {
		System.out.println("This base class method");
	}
	
	// This method can be implemented anywhere except here
	abstract public void display(); 
		

}

class Child extends Base {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is implementation of abstract class");
	}
	
}
public class Java_AbstractMethod {

	public static void main(String[] args) {
		
		Child cc = new Child();
		cc.display();
		
		// Base p = new Base(); --- throws error
		
		// we cannot create object of base class as this is abstract class
	}
}
