package Invoice;
import java.io.*;

public class CustomerRegistration extends Dashboard {

    int customerId = 0;
    int autoCustomerID;
    String customerFirstName;
    String customerLastName;
    String customerGender;
    String customerEmail;
    boolean emailResult = false;
    String customerAddress;
    String customerContact;

    public void customerRegistration(){
        System.out.println("---------------------------------------------");
        System.out.println("\t\t\t" + "Customer Registration");
        System.out.println("---------------------------------------------");

        autoCustomerID = ++customerId;

        System.out.println("Customer ID: " +autoCustomerID);

        System.out.println("First Name: ");
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
        customerContact = input.nextLine();
    }
    public void customerRegistrationWriter() {
        try {

            File file = new File("D:\\Invoice Project (File Writer)\\Customer Registration\\" + autoCustomerID + ".txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("---------------------------------------------");
            bw.newLine();
            bw.write("\t" + "Customer Registration");
            bw.newLine();
            bw.write("---------------------------------------------");
            bw.newLine();
            bw.write("ID: " + "\t\t" + customerId);
            bw.newLine();
            bw.write("First Name: " + "\t" + customerFirstName);
            bw.newLine();
            bw.write("Last Name: " + "\t" + customerLastName);
            bw.newLine();
            bw.write("Gender: " + "\t" + customerGender);
            bw.newLine();
            bw.write("Email: " + "\t\t" + customerEmail);
            bw.newLine();
            bw.write("Address: " + "\t" + customerAddress);
            bw.newLine();
            bw.write("Contact: " + "\t" + customerContact);
            bw.newLine();
            bw.write("---------------------------------------------");
            bw.close();

            System.out.println("-------------------------------------------------------");
            System.out.println("\t" + "Customer" + " \"" + customerFirstName.toUpperCase() + " " + customerLastName.toUpperCase() + "\" " + "Is Successfully Added.");
            System.out.println("-------------------------------------------------------");

            System.out.println("Enter 0 For Back Or Enter Any Digit For Add New.");
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    public void customerWriter(){
        try {

            File file = new File("D:\\Invoice Project (File Writer)\\Customer Registration\\Customer\\" + autoCustomerID + ".txt");
            FileWriter fww = new FileWriter(file);
            BufferedWriter bww = new BufferedWriter(fww);

            bww.write("ID: " + "\t\t" + customerId);
            bww.newLine();
            bww.write("Customer Name: " + "\t" + customerFirstName + " " + customerLastName);
            bww.close();


        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
