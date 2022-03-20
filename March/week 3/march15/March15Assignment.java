package march15Assignment;

class Employee{
	int id;
	String name;
	String department;
	public static String worklocation="Bangalore";// setting worklocation as bangalore using ststic keyword.....
	
	public int getId() {//getters and setters for each attribute.....
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
	public Employee(int id, String name, String department) {//constructor.....
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}
	public String toString() {//to string method for calling...
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + " worklocation="+worklocation+"]";
	}
	
	
}

public class March15Assignment {

	public static void main(String[] args) {
		Employee e1=new Employee(2404,"Priyanshu","Java developer");
		System.out.println(e1+"\n");
		Employee e2=new Employee(4024,"Bipasha","Accounts");
		System.out.println(e2+"\n");
		Employee e3=new Employee(2526,"Muskan","German Expert");
		System.out.println(e3+"\n");

		

	}

}
