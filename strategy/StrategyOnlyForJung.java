package grade_manager.strategy;

public class StrategyOnlyForJung {

	public String getGrade(int point) {
		String grade;
		if (point >= 90) {
			grade = "S";
		} else if (point >= 60 && point < 90) {
			grade = "A";
		} else {
			grade = "B";
		}

		return grade;
	}
}
