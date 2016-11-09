package grade_manager;

import java.util.ArrayList;

import grade_manager.strategy.MajorStrategy;
import grade_manager.strategy.RegularStrategy;
import grade_manager.strategy.StrategyOnlyForJung;

public class School {
	
	public static School school;
	private ArrayList <Student> studentList = new ArrayList <Student>();
	private ArrayList <Score> scoreList = new ArrayList <Score>();
	public RegularStrategy regularStrategy = new RegularStrategy();
	public MajorStrategy majorStrategy = new MajorStrategy();
	public StrategyOnlyForJung strategyOnlyForJung = new StrategyOnlyForJung();
	
	public static School getInstance(){
		if(school == null){
			school = new School();
		}
		return school;
	}
	
	public void addStudent(Student student){
		studentList.add(student);
		System.out.println(student.getName()+"학생을 추가합니다.");
		if(student.getName().equals("Yura     ")){
			System.out.println("앗, 감사합니다!");
		}
	}
	
	public void addScore(Score score){
		scoreList.add(score);
		System.out.println(score.subjectName+"과목을 개설합니다.");
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
	
	
	
	
	
}
