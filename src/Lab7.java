import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);

//Get name.
		String userName = getUserName(scnr, "Enter a valid Name: ");
		System.out.println("Your name is " + userName + ".\n");

//Get email address.
		String eMail = getEmail(scnr, "Enter a valid email: ");
		System.out.println("Email is valid!: " + eMail + ".\n");

//Getphone number.
		String phoneNum = getPhone(scnr, "Enter a valid phone number: ");
		System.out.println("Your phone number is " + phoneNum + ".\n");

//Get date.
		String date = getDate(scnr, "Enter a valid date (dd/mm/yyyy): ");
		System.out.println("The date you have entered is " + date + ".\n");

	}

// Name validation.

	public static String getUserName(Scanner scnr, String prompt) {

		System.out.print(prompt);
		boolean isValid = false;
		String userName;

		do {
			userName = scnr.nextLine();

			if (userName.matches("[A-Z][a-z]{1,30}")) {
				isValid = true;
			} else {
				System.out.println("Sorry, name is not valid! \n");
				isValid = false;
				System.out.println(prompt);
			}

		} while (!isValid);

		return userName;
	}

//Email validation

	public static String getEmail(Scanner scnr, String prompt) {

		System.out.print(prompt);
		boolean isValid = false;
		String eMail;

		do {
			eMail = scnr.nextLine();

			if (eMail.matches("[a-zA-Z0-9]{5,30}@[a-zA-Z0-9]{5,10}.[a-zA-Z]{2,}")) {
				isValid = true;

			} else {
				System.out.println("Sorry, email is not valid! \n");
				isValid = false;
				System.out.println(prompt);
			}

		} while (!isValid);

		return eMail;
	}

// Phone number validation

	public static String getPhone(Scanner scnr, String prompt) {

		System.out.print(prompt);
		boolean isValid = false;
		String phoneNum;

		do {
			phoneNum = scnr.nextLine();

			if (phoneNum.matches("[0-9]{3}-[0-9]{3}-[0-9]{4}")) {
				isValid = true;

			} else {
				System.out.println("Sorry, phone is not valid! \n");
				isValid = false;
				System.out.println(prompt);
			}

		} while (!isValid);

		return phoneNum;

	}

//Date validation.

	public static String getDate(Scanner scnr, String prompt) {

		System.out.print(prompt);
		boolean isValid = false;
		String date;

		do {
			date = scnr.nextLine();

			if (date.matches("(0[1-9]|1[012])/(0[1-9]|[12][0-9]|3[01])/(19|20)\\d\\d")) {
				isValid = true;

			} else {
				System.out.println("Sorry, date is not valid! \n");
				isValid = false;
				System.out.println(prompt);
			}

		} while (!isValid);

		return date;
	}
}
