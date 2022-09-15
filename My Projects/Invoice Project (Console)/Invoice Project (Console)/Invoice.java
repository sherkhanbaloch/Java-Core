package Invoice;
import java.util.Scanner;

public class Invoice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        InvoiceBill obj = new InvoiceBill();

        int choice;
        obj.dashboard();

        do{
            System.out.print("Enter Choice: ");
            choice = input.nextInt();

            switch(choice){
                case 1:
                    obj.customerRegistration();
                    obj.customerRegistration2();

                    
                    while(choice != 0){
                    System.out.print("Enter Choice: ");
                    choice = input.nextInt();
                    if (choice == 0){
                        obj.dashboard();
                    }
                    else if (choice >=1 && choice <= 9){
                            obj.customerRegistration();
                            obj.customerRegistration2();
                      }
                    }
                     break;

                case 2:
                    obj.productRegistration();
                    obj.productRegistration2();
                    
                    while(choice != 0){
                    System.out.print("Enter Choice: ");
                    choice = input.nextInt();
                    if (choice == 0){
                        obj.dashboard();
                    }
                    else if (choice >=1 && choice <= 9){
                        obj.productRegistration();
                        obj.productRegistration2();
                        }
                    }
                    break;

                case 3:
                    obj.supplierRegistration();
                    obj.supplierRegistration2();
                    
                    while(choice != 0){
                    System.out.print("Enter Choice: ");
                    choice = input.nextInt();
                    if (choice == 0){
                        obj.dashboard();
                    }
                    else if (choice >=1 && choice <= 9){
                        obj.supplierRegistration();
                        obj.supplierRegistration2();
                    }
                    }
                    break;

                case 4:
                    obj.invoiceBill();
                    obj.invoiceBill2();
                    
                    while(choice!= 0){
                    System.out.print("Enter Choice: ");
                    choice = input.nextInt();
                    if (choice == 0){
                        obj.dashboard();
                    }
                    else if (choice >= 1 && choice <= 9){
                        obj.invoiceBill();
                        obj.invoiceBill2();
                    }
                    }
                    break;

                case 5:
                    return;

                default:
                    System.out.println("Invalid Choice! Try Again.");

            }

        }while(choice != 5);

    }
}
