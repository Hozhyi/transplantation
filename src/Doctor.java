import java.util.Scanner;


public class Doctor {

	public static void main(String[] args) {
	
		SignIn();	
	    Patient.Organs();

	}
	
	
	public static void SignIn()
	{
		int i;
		String user = "Boromir";
		String password = "111111";
		String UserName,UserPassword;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your login and password");
			do 
				{ 
					System.out.println("Login:");
					UserName = sc.nextLine();
					System.out.println("Password:");
					UserPassword = sc.nextLine();
					i=0;
					if ((UserName.equals(user)) && (UserPassword.equals(password)))
						{
							System.out.println("You  are logged in: " + user); i++;
						}
					else {
							System.out.println("Try again");
						}
				} while (i==0);
		
	}

}