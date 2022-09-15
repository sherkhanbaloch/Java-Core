package Invoice;
import java.util.Scanner;

public class Invoice {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            AvailableStock obj = new AvailableStock();

            int choice;

//            obj.userLogin();
//            if (obj.userName.equals("admin") && obj.password.equals("password")) {

                obj.dashboard();
                do {
                    System.out.print("Enter Choice: ");
                    choice = input.nextInt();

                    switch (choice) {
                        case 1:
                            obj.customerRegistration();
                            obj.customerRegistrationWriter();
                            obj.customerWriter();
                            while (choice != 0) {
                                System.out.print("Enter Choice: ");
                                choice = input.nextInt();
                                if (choice == 0) {
                                    obj.dashboard();
                                } else if (choice >= 1 && choice <= 9) {
                                    obj.customerRegistration();
                                    obj.customerRegistrationWriter();
                                } else {
                                    System.out.println("Invalid Choice! Try Again");
                                }
                            }
                            break;
                        case 2:
                            obj.productRegistration();
                            obj.productRegistrationWriter();
                            obj.productWriter();
                            while (choice != 0) {
                                System.out.print("Enter Choice: ");
                                choice = input.nextInt();
                                if (choice == 0) {
                                    obj.dashboard();
                                } else if (choice >= 1 && choice <= 9) {
                                    obj.productRegistration();
                                    obj.productRegistrationWriter();
                                } else {
                                    System.out.println("Invalid Choice! Try Again");
                                }
                            }
                            break;
                        case 3:
                            obj.supplierRegistration();
                            obj.supplierRegistrationWriter();
                            while (choice != 0) {
                                System.out.print("Enter Choice: ");
                                choice = input.nextInt();
                                if (choice == 0) {
                                    obj.dashboard();
                                } else if (choice >= 1 && choice <= 9) {
                                    obj.supplierRegistration();
                                    obj.supplierRegistrationWriter();
                                } else {
                                    System.out.println("Invalid Choice! Try Again");
                                }
                            }
                            break;
                        case 4:
                            obj.invoiceBill();
                            while (choice != 0) {
                                System.out.print("Enter Choice: ");
                                choice = input.nextInt();
                                if (choice == 0) {
                                    obj.dashboard();
                                } else if (choice >= 1 && choice <= 9) {
                                    obj.invoiceBill();
                                } else {
                                    System.out.println("Invalid Choice! Try Again");
                                }
                            }
                            break;
                        case 5:
                            obj.availableStock();
                            while (choice != 0) {
                                System.out.print("Enter Choice: ");
                                choice = input.nextInt();
                                if (choice == 0) {
                                    obj.dashboard();
                                } else if (choice >= 1 && choice <= 9) {
                                    obj.availableStock();
                                } else {
                                    System.out.println("Invalid Choice! Try Again");
                                }
                            }
                            break;
                        case 6:
                            obj.userLogin();
                            obj.userChangePassword();
                            break;
                        case 7:
                            return;
                        default:
                            System.out.println("Invalid Choice! Try Again");
                    }
                } while (choice != 7);

//            } // Last If Bracket
//            else {
                System.out.println("User Name or Password are incorrect!");
//            } // else bracket

            } // try bracket
        catch (Exception e){
            System.out.println(e);

        }







    }

}
