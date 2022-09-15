
package TailorManagementSystem;

import java.util.Scanner;
import java.io.*;

public class CustomerRegistration extends Dashboard {
    
    Scanner input = new Scanner(System.in);
    
    int customerID = 0;
    int autoCustomerID;
    String customerFirstName;
    String customerLastName;
    String customerCNIC;
    String customerGender;
    String customerEmail;
    boolean emailResult = false;
    String customerContact;
    String customerAddress;
  
    public void customerRegistration(){
        
        System.out.println("\t" + "---------------------------------------------");
        System.out.println("\t\t" + "Customer Registration");
        System.out.println("\t" + "---------------------------------------------");

        autoCustomerID = ++customerID;
        
        System.out.println("Customer ID: " + autoCustomerID);

        System.out.print("First Name: ");
        customerFirstName = input.nextLine();
        
        System.out.print("Last Name: ");
        customerLastName = input.nextLine();
        
        System.out.print("CNIC No: ");
        customerCNIC = input.nextLine();
        
        System.out.print("Gender: ");
        customerGender = input.nextLine();
        
        do{
        System.out.print("E-mail: ");
        customerEmail = input.nextLine();
        
        if (customerEmail.contains("@") && customerEmail.endsWith(".com")){
            emailResult = true;
            break;
            }
        else{
            System.out.println("Invalid Email Try Again.");
            }
        } while(emailResult != true);
        
        System.out.print("Contact: ");
        customerContact = input.nextLine();
        
        System.out.print("Address: ");
        customerAddress = input.nextLine();
    }
    
    public void customerRegistrationWriter(){
        try{
        File file = new File("D:\\Tailor Management System\\Customer Registration\\" + customerID + ".txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
        
        bw.write("---------------------------------------------");
        bw.newLine();
     
        bw.write("\t"+"Customer Registration"+"-----"+i);
        bw.newLine();
        bw.write("---------------------------------------------");
        bw.newLine();
        
        
        bw.write( "Customer ID: "+ "\t"+ customerID);
        bw.newLine();
        bw.write("Name: " + "\t\t"+ customerFirstName + " " + customerLastName);
        bw.newLine();
        bw.write("CNIC No: " + "\t"+ customerCNIC);
        bw.newLine();
        bw.write("Gender: " + "\t"+ customerGender);
        bw.newLine();
        bw.write("E-mail: " + "\t"+ customerEmail);
        bw.newLine();
        bw.write("Contact: " + "\t"+ customerContact);
        bw.newLine();
        bw.write("Address: " + "\t"+ customerAddress);
        bw.newLine();
        bw.write("---------------------------------------------");
        bw.close();
        
            System.out.println("Customer" + " \"" + customerFirstName.toUpperCase() + " " + customerLastName.toUpperCase() + "\" " + "is succesfully added.");
            System.out.println("Press 0 For Back or Press Any Digit For Add New.");
        
        } catch (Exception e){
            System.out.println(e);
        } // End Try & Catch
        
    }
    
    public void customerWriter(){
        try{
            File file2 = new File("D:\\Tailor Management System\\Customer Registration\\Customer\\" + customerID + ".txt");
            FileWriter fw = new FileWriter(file2);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write("---------------------------------------------");
            bw.newLine();
            bw.write("Customer ID: " + "\t" +  autoCustomerID);
            bw.newLine();
            bw.write("Name: " + "\t\t"+ customerFirstName + " " + customerLastName);
            bw.newLine();
            bw.write("Gender: " +"\t" + customerGender);
            bw.newLine();
            bw.write("Address: " + "\t"+ customerAddress);
            bw.close();
            
        }catch(Exception e){
            System.out.println(e);
        } // End Try & Catch
        
    }
    
}
