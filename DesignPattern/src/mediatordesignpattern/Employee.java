package mediatordesignpattern;

public class Employee {

	private int id;
	public Employee(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}


	private String name;
	private String designation;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", id=" + id + "]";
	}
	
}
