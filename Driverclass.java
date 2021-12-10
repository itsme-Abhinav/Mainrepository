	
import java.util.Scanner;


import java.util.Random;



	 class Employee {
	

		String firstName;
		String lastName;
		String department;
		CredentialService CS = new CredentialService();
	

		char[] PassGenerated;
		String EmailGenerated;
		int Dept;
	

		public void showCredentials(String fn, String ln, int opt) {
			firstName = fn;
			lastName = ln;
			Dept = opt;
	

	

			switch(Dept){
			case 1 :{
				System.out.println("Dear "+fn+" your generated credentials are as follows");
				EmailGenerated = CS.GenerateEmailAddress(fn,ln,"tech");
				PassGenerated = CS.GeneratePassword(8);
				break;
	

			}
			case 2 :{
				System.out.println("Dear "+fn+" your generated credentials are as follows");
				EmailGenerated = CS.GenerateEmailAddress(fn,ln,"admin");
				PassGenerated = CS.GeneratePassword(8);	
				break;
			}
			case 3 :{
				System.out.println("Dear "+fn+" your generated credentials are as follows");
				EmailGenerated = CS.GenerateEmailAddress(fn,ln,"hr");
				PassGenerated = CS.GeneratePassword(8);	
				break;
			}
			case 4 :{
				System.out.println("Dear "+fn+" your generated credentials are as follows");
				EmailGenerated = CS.GenerateEmailAddress(fn,ln,"legal");
				PassGenerated = CS.GeneratePassword(8);	
				break;
			}
			default :{
				System.out.println("Dear "+fn);
				System.out.println("Not Valid Department Selected hence no Credentials Generated");
	

			}
			}
		}
	}

public class Driverclass {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	

			Employee Emp = new Employee();
			Scanner SC = new Scanner(System.in);
			String FirstName;
			String LastName;
	

			System.out.println("Welcome to the Employee email Creation Utility");
			System.out.println();
			System.out.println("Enter your First Name");
			FirstName = SC.nextLine();
			System.out.println("Enter your Last Name");
			LastName = SC.nextLine();
	

			int option;
			System.out.println();
			System.out.println("-----------------------------------------------");
			System.out.println("Please enter department from the following");
			System.out.println("1. Tech");
			System.out.println("2. Admin");
			System.out.println("3. HR");
			System.out.println("4. Legal");
			System.out.println("-----------------------------------------------");
			option = SC.nextInt();
	

			Emp.showCredentials(FirstName, LastName, option);
	

			SC.close();
	

		}
	}


	

	class CredentialService {
	

		public  char[] GeneratePassword(int length) {
	

		      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		      String specialCharacters = "!@#$";
		      String numbers = "1234567890";
		      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		      Random random = new Random();
		      char[] password = new char[length];
	

		      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
		      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
		      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		      password[3] = numbers.charAt(random.nextInt(numbers.length()));
		   
		      for(int i = 4; i< length ; i++) {
		         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		      }
		      String PWD = String.valueOf(password);
		      System.out.println("Password  --> "+ PWD);
		      return password;
		}
	

		public String GenerateEmailAddress(String fn, String ln,String department) {
	

			String Email = fn.toLowerCase()+ln.toLowerCase()+"@"+department+".abc.com";
			System.out.println("Email  --> "+Email);
			return Email;
	

		}
	

	}

