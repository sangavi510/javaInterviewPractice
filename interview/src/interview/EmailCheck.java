package interview;

public class EmailCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email = "sangavi510gmail.com";
		    String emailRegex = "^[\\w.%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
		  System.out.println(email.matches(emailRegex));
		}

	}


