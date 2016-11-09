package grade_manager;

public class Student {
	
	private int studentId;
	private String name;
	private String major;
	
	public Student(int studentId, String name, String major) {
		this.studentId = studentId;
		this.name = name;
		this.major = major;
	}
	
	public Student(String name, int studentId, String major) {
		this.studentId = studentId;
		this.name = name;
		this.major = major;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (studentId != other.studentId)
			return false;
		return true;
	}
	
	
	
	
	

}
