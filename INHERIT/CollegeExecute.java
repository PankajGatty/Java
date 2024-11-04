public class CollegeExecute{

	public static void main(String[] args) {

		HeadOfDepartment hod1 = new HeadOfDepartment("Saraswathi", 35, 65000.00f, "MCA");
		HeadOfDepartment hod2 = new HeadOfDepartment("Rashmi", 65, 65000.00f, "MBA");

		HeadOfDepartment[] hod = {hod1, hod2};

		Principal princi1 = new Principal("Prakash", 69, 1000000.00f, 5);

		Professors professor1 = new Professors("Swasthika", 27, 40000.00f, "IOT");
		Professors professor2 = new Professors("Thehnik Bathery", 30, 45000.00f, "Big Data");
		Professors professor3 = new Professors("Saraswathi", 35, 65000.00f, "Java");
		Professors professor4 = new Professors("Levi Ruben", 28, 35000.00f, "JavaScript");

		Professors[] professor = {professor1, professor2, professor3, professor4};


		Students student1 = new Students("Pankaj", 24, "MCA");
		Students student2 = new Students("Lana", 22, "MBA");
		Students student3 = new Students("Sanjay", 24, "MCA");
		Students student4 = new Students("Harshitha", 21, "MBA");
		Students student5 = new Students("Harshith", 24, "MCA");
		Students[] student = {student1,student2, student3, student4, student5};



		ShreeDeviCollege sdit = new ShreeDeviCollege(hod, princi1, student, professor,4,12);
		sdit.printDetails();



		// ALOYSIUS COLLEGE

		HeadOfDepartment hod3 = new HeadOfDepartment("Arun", 55, 65000.00f, "MCA");
		HeadOfDepartment hod4 = new HeadOfDepartment("David", 45, 65000.00f, "MBA");

		HeadOfDepartment[] s_hod = {hod3, hod4};

		Principal princi2 = new Principal("Martin", 60, 1000000.00f, 2);

		Professors professor5 = new Professors("Archana", 38, 40000.00f, "JAVA");
		Professors professor6 = new Professors("Yathish", 39, 45000.00f, "C++");
		Professors professor7 = new Professors("Hemalatha", 49, 42000.00f, "RDBMS");
		Professors professor8 = new Professors("Sarojini", 59, 65000.00f, "C");

		Professors[] s_professor = {professor5, professor6, professor7, professor8};


		Students student0 = new Students("Akash", 25, "MCA");
		Students student6 = new Students("Gautham", 25, "MBA");
		Students student7 = new Students("Shravan", 25, "MCA");
		Students student8 = new Students("Nagesh", 25, "MBA");
		Students student9 = new Students("Amrith", 25, "MCA");
		Students[] s_student = {student0,student6, student7, student8, student9};



		Aloysius aloy = new Aloysius(s_hod, princi2, s_student, s_professor,15);
		aloy.printDetails();

	}
}