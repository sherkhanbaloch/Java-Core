package Invoice;

public class SupplierRegistration extends ProductRegistration {
    int supplierId;
    String supplierFirstName;
    String supplierLastName;
    String supplierGender;
    String supplierEmail;
    String companyName;
    String supplierAddress;
    String supplierContact;

    public void supplierRegistration(){
        System.out.println("---------------------------------------------");
        System.out.println("\t\t\t\t" + "Supplier Registration");
        System.out.println("---------------------------------------------");

        System.out.println("Supplier ID:");
        supplierId = input.nextInt();

        System.out.println("First Name:");
        input.nextLine();
        supplierFirstName = input.nextLine();

        System.out.println("Last Name:");
        supplierLastName = input.nextLine();

        System.out.println("Gender:");
        supplierGender = input.nextLine();

//        System.out.println("Email:");
//        supplierEmail = input.nextLine();

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
    public void supplierRegistration2(){
        System.out.println("-------------------------------------------------------");
        System.out.println("\t\t\t\t" + "Supplier Registration");
        System.out.println("-------------------------------------------------------");

        System.out.println("Supplier ID: "  + "\t" + supplierId);

        System.out.println("First Name: "  + "\t" + supplierFirstName);

        System.out.println("Last Name: "  + "\t\t" + supplierLastName);

        System.out.println("Gender: "  + "\t\t" + supplierGender);

        System.out.println("Email: "  + "\t\t\t" + supplierEmail);

        System.out.println("Company Name: "  + "\t" + companyName);

        System.out.println("Address: "  + "\t\t" + supplierAddress);

        System.out.println("Contact: "  + "\t\t" + supplierContact);

        System.out.println("-------------------------------------------------------");
        System.out.println("\t" + "Supplier" + " \"" + supplierFirstName.toUpperCase() + " " + supplierLastName.toUpperCase() + "\" " + "Is Successfully Added.");
        System.out.println("-------------------------------------------------------");

        System.out.println("Enter 0 For Back Or Enter Any Digit For Add New.");

    }
}
