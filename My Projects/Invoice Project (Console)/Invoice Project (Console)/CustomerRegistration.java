package Invoice;
import java.util.Scanner;

public class CustomerRegistration extends Dashboard {
    Scanner input = new Scanner(System.in);

    int customerId;
    int customerCode;
    String customerFirstName;
    String customerLastName;
    String customerGender;
    String customerEmail;
    boolean emailResult = false;
    String customerAddress;
    long customerContact;

    public void customerRegistration(){
        System.out.println("---------------------------------------------");
        System.out.println("\t\t\t" + "Customer Registration");
        System.out.println("---------------------------------------------");

        System.out.println("Customer ID: ");
        customerId = input.nextInt();

        System.out.println("Customer Code: ");
        customerCode = input.nextInt();

        System.out.println("First Name: ");
        input.nextLine();
        customerFirstName = input.nextLine();

        System.out.println("Last Name: ");
        customerLastName = input.nextLine();

        System.out.println("Gender: ");
        customerGender = input.next();
        input.nextLine();

        do {
            System.out.println("Email: ");
            customerEmail = input.nextLine();

            if (customerEmail.contains("@") && customerEmail.contains(".com")) {
                emailResult = true;
                break;
            }
            else {
                System.out.println("Invalid Email! Try Again");
            }
        }while (emailResult != true);

        System.out.println("Address: ");
        customerAddress = input.nextLine();

        System.out.println("Contact: ");
        customerContact = input.nextLong();
    }
    public void customerRegistration2(){
        System.out.println("-------------------------------------------------------");
        System.out.println("\t\t\t\t" + "Customer Registration");
        System.out.println("-------------------------------------------------------");
        System.out.println("ID: " + "\t\t\t" + customerId);
        System.out.println("Customer Code: " + "\t" + customerCode);
        System.out.println("First Name: " + "\t" + customerFirstName);
        System.out.println("Last Name: " + "\t\t" + customerLastName);
        System.out.println("Gender: " + "\t\t" + customerGender);
        System.out.println("Email: " + "\t\t\t" + customerEmail);
        System.out.println("Address: " + "\t\t" + customerAddress);
        System.out.println("Contact: " + "\t\t" + customerContact);
        System.out.println("-------------------------------------------------------");
        System.out.println("\t" + "Customer" + " \"" + customerFirstName.toUpperCase() + " " + customerLastName.toUpperCase() + "\" " + "Is Successfully Added.");
        System.out.println("-------------------------------------------------------");
        System.out.println("Enter 0 For Back Or Enter Any Digit For Add New.");
    }
}
