import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the name : ");
		String name = in.nextLine();

		System.out.println("Enter Date of Birth : ");
		String dateOfBirth = in.nextLine();

		System.out.println("Enter Gender : ");
		String gender = in.nextLine();

		System.out.println("Enter Mobile Number : ");
		String mobileNumber = in.nextLine();

		System.out.println("Enter Blood Group : ");
		String bloodGroup = in.nextLine();

		System.out.println("Enter Blood Bank Name : ");
		String bloodBankName = in.nextLine();

		System.out.println("Enter Donor Type : ");
		String donorType = in.nextLine();

		System.out.println("Enter Donation Date : ");
		String donationDate = in.nextLine();

		in.close();

		Donor donor = new Donor(name, dateOfBirth, gender, mobileNumber, bloodGroup, bloodBankName, donorType,
				donationDate);
		
		donor.displayDonationDetails();
	}

}
