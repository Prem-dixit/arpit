package prem.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.Transient;

@Entity(name = "pree")
public class prem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "e_Name")
	String name;
	String course;
	int fees;
//	@Transient
	private String country;
	
	
	public prem() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public prem( String name, String course, int fees,String country) {
		super();
		//this.id = id;
		this.name = name;
		this.course = course;
		this.fees = fees;
		this.country="country";
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
		return "prem [  name=" + name + ", course=" + course + ", fees=" + fees +",country="+country  + "]";
	}
	
	
	

}
