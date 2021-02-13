import java.util.*;
class AddressBookMain {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to the Address Book Management System using Java Stream ");
		AddressBook addressBook = new AddressBook();
		System.out.println("Enter the contact details:");
		String firstName = sc.next();
		String lastName = sc.next();
		String address = sc.next();
		String city = sc.next();
		String state = sc.next();
		String email = sc.next();
		String phoneNumber = sc.next();
		String zip = sc.next();
		ContactDetails cd = new ContactDetails(firstName, lastName, address, city, state, email, phoneNumber, zip);

		ArrayList<ContactDetails> contactList = addressBook.contactList(cd);
		for(ContactDetails contact:contactList){
			System.out.println(contact.getFirstName()+" "+contact.getLastName()+" "+contact.getAddress()+" "+contact.getCity()+
					" "+contact.getState()+" "+contact.getEmail()+" "+contact.getPhoneNumber()+" "+contact.getZip());
		}


	}
	private static AddressBook addressBook = new AddressBook();

	public static void main(String[] args) {
		System.out.println("Welcome to the Address Book Management System using Java Stream");
		AddressBookMain addBookMain = new AddressBookMain();
		boolean flag = true;

		while(flag) {

			System.out.println("1.Add Contact");
			System.out.println("2.Edit Contact");
			System.out.println("3.Exit");
			System.out.println("Enter Choice: ");

			int option = sc.nextInt();

			switch (option)
			{
			case 1:
				addressBook.addContactDetails();
				break;

			case 2:
				System.out.println("Enter the Person First name to edit details: ");
				String person_name = sc.next();

				boolean b = addressBook.editContactDetails(person_name);
				if (b == true) {
					System.out.println("Details Updated");
				} else {
					System.out.println("Contact Not Found");
				}
				break;

			case 3:
				flag =false;
				break;

			}
		}

	}
}
