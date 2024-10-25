public class School{
	static String schoolName;
	static String schoolAddress;
	static int totalStudents;
	String studentName;
	Grade classGrade;
	int rollNumber;
	String teacherName;

	static{
		schoolName="Shree Devi";
		schoolAddress="Bajpe";
		totalStudents=500;
	}
	public School(String studentName,Grade classGrade,int rollNumber,String teacherName){
		this.studentName=studentName;
		this.classGrade=classGrade;
		this.rollNumber=rollNumber;
		this.teacherName=teacherName;
	}

	public void display(){
		System.out.println("School Name:"+schoolName);
		System.out.println("School Address:"+schoolAddress);
		System.out.println("Total Student:"+totalStudents);
		System.out.println("Student Name:"+studentName);
		System.out.println("Class Grade:"+classGrade);
		System.out.println("Roll Number:"+rollNumber);
		System.out.println("Teacher Name:"+teacherName);
	}
}