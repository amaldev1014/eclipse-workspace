package cliniquemanagement;

public class Doctor {

	private String name;
    private int id;
    private String specialization;
    private String Availability;
	public String getName() {
		return name;
	}
	/*public Doctor(String name, int id, String specialization, String availability) {
		super();
		this.name = name;
		this.id = id;
		this.specialization = specialization;
		Availability = availability;
	}*/
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getAvailability() {
		return Availability;
	}
	public void setAvailability(String availability) {
		Availability = availability;
	}
}
