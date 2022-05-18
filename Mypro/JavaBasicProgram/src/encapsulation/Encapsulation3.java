package encapsulation;
class kunal{
	private int age=16;
	private double salary=140.10;
	public int getage() {
		return age;
	}
	public double getsalary() {
		return salary;
	}
	public void setage(int z) {
		age = z;
	}
	
	public void setsalary(double t) {
		salary = t;
	}
}

public class Encapsulation3 {

	public static void main(String[] args) {
		kunal ref=new kunal ();
		System.out.println("getter method age: "+ref.getage());
        System.out.println("getter method salary: "+ref.getsalary());
        System.out.println("...................................");
        ref.setage(40);
        ref.setsalary(500.50);
        System.out.println("getter method age: "+ref.getage());
        System.out.println("getter method salary: "+ref.getsalary());
        //initial value
        System.out.println("...................................");
        kunal ref1=new kunal ();
        System.out.println("getter method age: "+ref1.getage());
        System.out.println("getter method salary: "+ref1.getsalary());
        
        
	}

}
/*1.Getter method help to access private variable outside the class
 * 2.declared with public
 * 3.return type of getter method should be same as private variable
 * 4.it should be return private variable 
 * 
 * 1.Setter method helps to modify or updated private variable outside the class
 * 2.declared with public.
 * 3.return type of setter method should be void.
 * 4.parameter datatype should be same as private variable 
 */

