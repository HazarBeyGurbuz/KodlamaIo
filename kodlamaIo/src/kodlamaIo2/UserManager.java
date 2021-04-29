package kodlamaIo2;

public class UserManager {
	public void login(User user) {
		System.out.println("Giriþ yapýldý");
	}
	public void showMyCourse(User user) {
		System.out.println(user.getCourse());
	}
	public void changePassword(User user) {
		System.out.println("Þifre: " + user.getPassword() + " olarak belirlendi");	
	}
}
