package Invoice;
import java.io.*;

public class SupplierRegistration extends ProductRegistration {
    int supplierId = 0;
    int autoSupplierId;
    String supplierFirstName;
    String supplierLastName;
    String supplierGender;
    String supplierEmail;
    boolean emailResult = false;
    String companyName;
    String supplierAddress;
    String supplierContact;

    public void supplierRegistration(){
        System.out.println("---------------------------------------------");
        System.out.println("\t\t\t\t" + "Supplier Registration");
        System.out.println("---------------------------------------------");

        autoSupplierId = ++supplierId;

        System.out.println("Supplier ID: " + autoSupplierId);

        System.out.println("First Name:");
        supplierFirstName = input.nextLine();

        System.out.println("Last Name:");
        supplierLastName = input.nextLine();

        System.out.println("Gender:");
        supplierGender = input.nextLine();

        do {
            System.out.println("Email: ");
            supplierEmail = input.nextLine();

            if (supplierEmail.contains("@") && supplierEmail.contains(".com")) {
                emailResult = true;
                break;
            }
            else {
                System.out.println("Invalid Email! Try Again");
            }
        }while (emailResult != true);

        System.out.println("Company Name:");
        companyName = input.nextLine();

        System.out.println("Address:");
        supplierAddress = input.nextLine();

        System.out.println("Contact:");
        supplierContact = input.nextLine();

    }
    public void supplierRegistrationWriter(){
    try {

    File file = new File("D:\\Invoice Project (File Writer)\\Supplier Registration\\" + autoSupplierId  + ".txt");
    FileWriter fw = new FileWriter(file);
    BufferedWriter bw = new BufferedWriter(fw);

    bw.write("---------------------------------------------");
    bw.newLine();
    bw.write("\t" + "Supplier Registration");
    bw.newLine();
    bw.write("---------------------------------------------");
    bw.newLine();
    bw.write("Supplier ID: " + "\t" + supplierId);
    bw.newLine();
    bw.write("First Name: " + "\t" + supplierFirstName);
    bw.newLine();
    bw.write("Last Name: " + "\t" + supplierLastName);
    bw.newLine();
    bw.write("Gender: " + "\t" + supplierGender);
    bw.newLine();
    bw.write("Email: " + "\t\t" + supplierEmail);
    bw.newLine();
    bw.write("Company Name: " + "\t" + companyName);
    bw.newLine();
    bw.write("Address: " + "\t" + supplierAddress);
    bw.newLine();
    bw.write("Contact: " + "\t" + supplierContact);
    bw.newLine();
    bw.write("---------------------------------------------");
    bw.close();

    System.out.println("-------------------------------------------------------");
    System.out.println("\t" + "Supplier" + " \"" + supplierFirstName.toUpperCase() + " " + supplierLastName.toUpperCase() + "\" " + "Is Successfully Added.");
    System.out.println("-------------------------------------------------------");

    System.out.println("Enter 0 For Back Or Enter Any Digit For Add New.");
    }
    catch (Exception e){
        System.out.println(e);
    }

    }
}
