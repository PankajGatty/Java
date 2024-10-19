public class student{
	public static void main(String[] args){
		int studentRollno;
		String studentName;
		int subjectMarks1;
		int subjectMarks2;
		int subjectMarks3;

		//object create
		student students=new student();
		student student1=new student();
		student student2=new student();
		student student3=new student();

		studentRollnos(1);
		names("Allen Barry");
		kannada(99);
		english(55);

		

	}
	

	//4 methods
	public static void studentRollnos(int studentRollno){
		
		System.out.println("Student rollno:"+studentRollno);
	}
	public static void names(String studentName){
		
		System.out.println("Student name:"+studentName);
	}
	public static void kannada(int subjectMarks1){
		
		System.out.println("kannada:"+subjectMarks1);
	}
	public static void english(int subjectMarks2){
		
		System.out.println("english:"+subjectMarks2);
	}

	
}