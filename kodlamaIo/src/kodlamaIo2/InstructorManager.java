package kodlamaIo2;

public class InstructorManager extends UserManager{
	public void addLesson(Instructor instructor) {
		System.out.println(instructor.getCourse() + " Kursuna ders eklendi");
	}
	public void addHomework(Instructor instructor) {
		System.out.println(instructor.getCourse() + " Kursuna ödev eklendi");
	}
	public void showMyCv(Instructor instructor) {
		System.out.println(instructor.getCv());
	}
	
}
