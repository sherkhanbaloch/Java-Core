
package TailorManagementSystem;

import java.util.Scanner;

public class TailorManagementSystem {
    public static void main (String [ ] args) {
        try{
        Scanner input = new Scanner(System.in);
        
        CustomerInvoice obj = new CustomerInvoice();
        
        int choice;
        
        obj.dashboard();
        do {
            System.out.print("Enter Choice: ");
            choice = input.nextInt();
            
            switch(choice){
                case 1:
                    obj.customerRegistration();
                    obj.customerRegistrationWriter();
                    obj.customerWriter();                    
                    while(choice != 0){
                        System.out.print("Enter Choice: ");
                        choice = input.nextInt();
                        if (choice == 0) {
                                    obj.dashboard();
                                } else if (choice >= 1 && choice <= 9) {
                                    obj.customerRegistration();
                                    obj.customerRegistrationWriter();
                                    obj.customerWriter();

                                } else {
                                    System.out.println("Invalid Choice! Try Again.");
                                }
                            }
                            break;
                  
                    case 2:
                        obj.customerMeasurement();
                        obj.customerMeasurementWriter();
                        obj.measureWriter();
                            while (choice != 0) {
                                System.out.print("Enter Choice: ");
                                choice = input.nextInt();
                                if (choice == 0) {
                                    obj.dashboard();
                                } else if (choice >= 1 && choice <= 9) {
                                   obj.customerMeasurement();
                                   obj.customerMeasurementWriter();
                                   obj.measureWriter();
                                } else {
                                    System.out.println("Invalid Choice! Try Again.");
                                }
                            }
                            break;
                    case 3:
                        obj.customerInvoice();
                        while (choice != 0) {
                                System.out.print("Enter Choice: ");
                                choice = input.nextInt();
                                if (choice == 0) {
                                    obj.dashboard();
                                } else if (choice >= 1 && choice <= 9) {
                                   obj.customerInvoice();
                                } else {
                                    System.out.println("Invalid Choice! Try Again.");
                                }
                            }
                        break;
                        
                    case 4:
                        return;
                        
                    default:
                        System.out.println("Invalid Choice! Try Again.");
                        
                    }  // End Switch

        } while (choice != 4);
 
        } catch (Exception e){
            System.out.println(e);
        } // End Try & Catch
        
    }    
}
