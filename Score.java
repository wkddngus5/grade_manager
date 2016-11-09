package grade_manager;

import java.util.HashMap;

import grade_manager.strategy.MajorStrategy;
import grade_manager.strategy.RegularStrategy;
import grade_manager.strategy.StrategyOnlyForJung;

public class Score {
	
	public String subjectName;
	private HashMap<Integer, Integer> pointByStudentId = new HashMap<Integer, Integer>();
	
	public Score(String subjectName) {
		this.subjectName=subjectName;
	}

	public void addPoint(int studentId, int point){
		pointByStudentId.put(studentId, point);
		System.out.println(subjectName+"과목 "+studentId+"학번의 학생의 점수 "+point);
	}
	
	public void removePoint(int studentId){
		pointByStudentId.remove(studentId);
	}
	
	public int findPoint(int studentId){
		return pointByStudentId.get(studentId);
	}
	
	public String calcGrade(Student student){
		int studentPoint = findPoint(student.getStudentId());
		if(student.getName().equals("Yura     ")){
			StrategyOnlyForJung strategyOnlyForJung = new StrategyOnlyForJung();
			return strategyOnlyForJung.getGrade(studentPoint);
		}else if(student.getMajor().equals(subjectName)){
			MajorStrategy majorStrategy = new MajorStrategy();
			return majorStrategy.getGrade(studentPoint);
		}else{
			RegularStrategy regularStrategy = new RegularStrategy();
			return regularStrategy.getGrade(studentPoint);
		}
	}

}
