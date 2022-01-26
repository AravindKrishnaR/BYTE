public class Donor extends Person {
	private String bloodBankName;
	private String donorType;
	private String donationDate;

	Donor(String name, String dateOfBirth, String gender,
			String mobileNumber, String bloodGroup, String bloodBankName, String donorType, String donationDate) {
		super(name, dateOfBirth, gender, mobileNumber, bloodGroup);
		this.bloodBankName = bloodBankName;
		this.donorType = donorType;
		this.donationDate = donationDate;
	}

	public String getBloodBankName() {
		return bloodBankName;
	}

	public void setBloodBankName(String bloodBankName) {
		this.bloodBankName = bloodBankName;
	}

	public String getDonorType() {
		return donorType;
	}

	public void setDonorType(String donorType) {
		this.donorType = donorType;
	}

	public String getDonationDate() {
		return donationDate;
	}

	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}

	public void displayDonationDetails() {
		System.out.println("Donation Details : " + "\nName : " + this.getName() + "\nDate Of Birth : "
				+ this.getDateOfBirth() + "\nGender : " + this.getGender() + "\nMobile Number : " + this.getMobileNumber()
				+ "\nBlood Group : " + this.getBloodGroup() + "\nBlood Bank Name : " + this.getBloodBankName()
				+ "\nDonor Type : " + this.getDonorType() + "\nDonation Date : " + this.getDonationDate());
	}
}
