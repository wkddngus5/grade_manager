package grade_manager;

import java.util.ArrayList;

import grade_manager.strategy.MajorStrategy;
import grade_manager.strategy.RegularStrategy;

public class Report {
	
	public void printReport(School inputSchool){
		
		School school = inputSchool;
		ArrayList<Student> studentList = school.getStudentList();
		ArrayList<Score> scoreList = school.getScoreList();
		MajorStrategy majorStrategy = new MajorStrategy();
		RegularStrategy regularStrategy = new RegularStrategy();
		
		
		System.out.println("---------------------------------------------");
		System.out.println("	  EHWA UNIVERSITY 		");
		System.out.println(" 이름     |  학번   |   학과   |  수학 | 영어  |");
		System.out.println("---------------------------------------------");
		
		for(int i=0; i<studentList.size();i++){
			Student student = studentList.get(i);
			System.out.print(student.getName()+"| ");
			System.out.print(student.getStudentId()+" | ");
			System.out.print(student.getMajor()+" |  ");
			for(int j=0; j<scoreList.size();j++){
				System.out.print(scoreList.get(j).calcGrade(student)+"  |   ");
			}
			System.out.println("");
		}
		
		
	}

}
