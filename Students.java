
public class Students {
	
	protected String name ;
	protected String email ;
	protected String phone ;
	protected String faculty ;
	protected Grade[]grade ;
	
	public Students() {
		super();
	}

	
	
	
	public Students(String name, String email, String phone, String faculty) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.faculty = faculty;
	}




	public Students(String name, String email, String phone, String faculty, Grade[] grade) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.faculty = faculty;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public Grade[] getGrade() {
		return grade;
	}

	public void setGrade(Grade[] grade) {
		this.grade = grade;
	}
	
	

}
