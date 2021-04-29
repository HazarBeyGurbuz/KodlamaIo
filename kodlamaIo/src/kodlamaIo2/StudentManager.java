package kodlamaIo2;

public class StudentManager extends UserManager {
	public void watchLesson(Student student) {
		System.out.println(student.getCourse() + " Kursunun dersi izleniyor");
	}
	public void sendHomework(Student student) {
		System.out.println(student.getCourse() + " Kursunun ödevi gönderildi");
	}
	public void showMyInstructor(Student student) {
		System.out.println(student.getMyInstructor());
	}
}
