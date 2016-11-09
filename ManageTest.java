package grade_manager;

public class ManageTest {

	public static void main(String[] args) {
		School Ewha = School.getInstance();
		
		Score Math = new Score("Math   ");
		Ewha.addScore(Math);
		
		Score English = new Score("English");
		Ewha.addScore(English);
		
		Student Sooyun =new Student(141518, "Sooyun   ", " Math  ");
		Ewha.addStudent(Sooyun);
		
		Student Jooha = new Student(141255, "Jooha    ", "English");
		Ewha.addStudent(Jooha);
		
		Student Soogyeong = new Student(141590, "Soogyeong", " Math  ");
		Ewha.addStudent(Soogyeong);
		
		Student Minjung = new Student(141213, "Minjung  ", " Math  ");
		Ewha.addStudent(Minjung);
		
		Student Yura = new Student(141230, "Yura     ", "English");
		Ewha.addStudent(Yura);
		
		Math.addPoint(141518, 90);
		English.addPoint(141518, 100);
		
		Math.addPoint(141255, 85);
		English.addPoint(141255, 89);
		
		Math.addPoint(141590, 90);
		English.addPoint(141590, 89);
		
		Math.addPoint(141213, 95);
		English.addPoint(141213, 20);
		
		Math.addPoint(141230, 60);
		English.addPoint(141230, 30);
		
		Report report = new Report();
		report.printReport(Ewha);
	}

}
