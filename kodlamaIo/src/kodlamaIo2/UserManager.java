package kodlamaIo2;

public class UserManager {
	public void login(User user) {
		System.out.println("Giri� yap�ld�");
	}
	public void showMyCourse(User user) {
		System.out.println(user.getCourse());
	}
	public void changePassword(User user) {
		System.out.println("�ifre: " + user.getPassword() + " olarak belirlendi");	
	}
}
