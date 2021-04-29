package kodlamaIo2;

public class Main {

	public static void main(String[] args) {
		Instructor engin = new Instructor();
		engin.id = 1;
		engin.setFirstName("Engin");
		engin.setLastName("Demiro�");
		engin.setCourse("Java + React," + " C# + Angular," + " Programlamaya giri�");
		engin.setCv("Savunma Sanayisi, Bankac�l�k sekt�rlerine kurumsal yaz�l�m geli�tirme s�re�leri konusunda dan��manl�k.");
		engin.setEmail("engindemirog@gmail.com");
		engin.setPassword("12345");
		
		Student hazar = new Student();
		hazar.id = 2;
		hazar.setFirstName("Hazar Bey");
		hazar.setLastName("G�rb�z");
		hazar.setCourse("Java + React");
		hazar.setEmail("hazarbeygurbuz@gmail.com");
		hazar.setPassword("6789");
		hazar.setMyInstructor("Engin Demiro�");
		
		UserManager userManager = new UserManager();
		userManager.login(engin);
		userManager.login(hazar);
		userManager.showMyCourse(engin);
		userManager.showMyCourse(hazar);
		userManager.changePassword(engin);
		userManager.changePassword(engin);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addHomework(engin);
		instructorManager.addLesson(engin);
		instructorManager.showMyCv(engin);
		
		StudentManager studentManager = new StudentManager();
		studentManager.sendHomework(hazar);
		studentManager.watchLesson(hazar);
		studentManager.showMyInstructor(hazar);
		
 		
		
		
		
		
		System.out.println();
	}

}
