
package TailorManagementSystem;
import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class CustomerInvoice extends CustomerMeasurement {
        
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();
    
     int invoiceID = 0;
     int autoInvoiceId;
     String dressColour;
     int dressMeter;
     String deliveryDate;
     int balance;
     int credit;
     int debit;
     int discount;
     int totalAmount;
     
    public void customerInvoice(){
        try{
        
        System.out.println("\t" + "---------------------------------------------");
        System.out.println("\t\t\t" + "Invoice Bill");
        System.out.println("\t" + "---------------------------------------------");
        
        autoInvoiceId = ++invoiceID;

        System.out.println("Invoice No: " + autoInvoiceId);
        
        File invoiceWriteFile = new File("D:\\Tailor Management System\\Customer Invoice\\" + autoInvoiceId + ".txt");
        FileWriter fw = new FileWriter(invoiceWriteFile);
        BufferedWriter bw = new BufferedWriter(fw);
        
            bw.write("=============================================");
            bw.newLine();
            bw.write("\t"+ "Tailer Management System");
            bw.newLine();
            bw.write("=============================================");
            bw.newLine();
            bw.write("\t "+"***Customer Invoice***");
            bw.newLine();
            bw.write("*********************************************");
            bw.newLine();
            bw.write("Invoice ID: " + autoInvoiceId);
            bw.newLine();
            bw.write("Date: " + date);
            bw.write("\t");
            bw.write("Time: " + time);
            bw.newLine();
        
        System.out.print("Enter Customer ID: ");
        String cusID = input.nextLine();
        
        // Read Customer Registration File
        File invoiceReadCustomer = new File("D:\\Tailor Management System\\Customer Registration\\Customer\\" + cusID + ".txt");
        FileReader fr = new FileReader(invoiceReadCustomer);
        BufferedReader br = new BufferedReader(fr);

        String customerReader;
        while ((customerReader = br.readLine()) != null){
            System.out.println(customerReader);
            bw.write(customerReader);
            bw.newLine();
        }

        System.out.print("Enter Measurement ID: ");
        String measureID = input.nextLine();

        // Read Measurement Registration File
        File invoiceReadMeasure = new File("D:\\Tailor Management System\\Customer Measurement\\Measurement\\" + measureID + ".txt");
        FileReader frr = new FileReader( invoiceReadMeasure);
        BufferedReader brr = new BufferedReader(frr);

        String  measureReader;
        while ((measureReader = brr.readLine()) != null){
            System.out.println(measureReader);
            bw.write(measureReader);
            bw.newLine();
        }
        
            System.out.print("Dress Colour: ");
            dressColour = input.nextLine();
            
            System.out.print("Dress Meter: ");
            dressMeter = input.nextInt();
            
            System.out.print("Dress Delivery Date: ");
            input.nextLine();
            deliveryDate = input.nextLine();
        
            System.out.print("Balance: ");
            balance = input.nextInt();
            
            System.out.print("Debit: ");
            debit = input.nextInt();
            
            System.out.print("Credit: ");
            credit = input.nextInt();
            
            System.out.print("Discount: ");
            discount = input.nextInt();
            
            totalAmount = balance - discount;
            
            bw.write("---------------------------------------------");
            bw.newLine();
            bw.write("Dress Information:");
            bw.newLine();
            bw.write("Dress Colour: " + "\t" + dressColour);
            bw.newLine();
            bw.write("Dress Meter: " + "\t" + dressMeter);
            bw.newLine();
            bw.write("Delivery Date: " + "\t" + deliveryDate);
            bw.newLine();
            bw.write("---------------------------------------------");
            bw.newLine();
            bw.write("Balance: " + "\t"+ balance);
            bw.newLine();
            bw.write("Debit: " + "\t\t"+ debit);
            bw.newLine();
            bw.write("Credit: " + "\t"+ credit);
            bw.newLine();
            bw.write("Discount: " + "\t"+ discount);
            bw.newLine();
            bw.write("---------------------------------------------");
            bw.newLine();
            bw.write("Total Amount: " + "\t"+ totalAmount);
            bw.newLine();
            bw.write("*********************************************");
            bw.close();
            
            System.out.println("Invoice ID " + "\"" + autoInvoiceId + "\"" + " is succesfully added.");
            System.out.println("Press 0 for back or press any digit to view another.");
         
        } catch (Exception e){
            System.out.println(e);
        } // End Try & Catch
    }      
    
}
