package prem.entity;

public class prem {
	int id;
	String name;
	String course;
	int fees;
	
	
	public prem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public prem( String name, String course, int fees) {
		super();
		//this.id = id;
		this.name = name;
		this.course = course;
		this.fees = fees;
	}
	
	
	public int getId() {
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
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "prem [  name=" + name + ", course=" + course + ", fees=" + fees + "]";
	}
	
	
	

}
