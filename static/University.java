public class University{

	static String universityName;
	static String location;
	static int totalStudent;
	String studentName;
	int studentId;
	String course;
	int year;

	static{
		universityName="St.Aloysius College";
		location="Mangalore";
		totalStudent=5000;
	}

	public University(String studentName,int studentId,String course,int year){
		this.studentName=studentName;
		this.studentId=studentId;
		this.course=course;
		this.year=year;

	}

	public void showUniversityDetails(){
		System.out.println("University Name:"+universityName);
		System.out.println("Location:"+location);
		System.out.println("Total Student:"+totalStudent);
		System.out.println("Student Name:"+studentName);
		System.out.println("Student ID:"+studentId);
		System.out.println("Course:"+course);
		System.out.println("Year:"+year);
	}

}