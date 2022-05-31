package abstr;

abstract class Person{
	public abstract void info();
	void display() {
		System.out.println("person class base");
	}
	
}
class Employee extends Person{
	
    public void info()
    {
    	System.out.println("Abstract method is implemented");
    }
}



public class MainAbstract {

	public static void main(String[] args) {
		Employee emp =new Employee();
		emp.display();
		emp.info();
		

	}

}
