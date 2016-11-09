package grade_manager;

import java.util.ArrayList;
import java.util.HashMap;

public class Subject {
	
	public String subjectName;
	public String professor;
	public ArrayList<Student> studentList= new ArrayList<Student>();
	
	public void addStudent(Student student){
		studentList.add(student);
		System.out.println(subjectName+"과목 "+student.getName()+"학생이 추가되었습니다.");
	}
	
	public void removeStudent(Student student){
		studentList.remove(student);
		System.out.println(subjectName+"과목 "+ student.getName()+"학생이 삭제되었습니다.");
	}
	
}
