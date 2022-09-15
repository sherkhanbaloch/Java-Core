package Invoice;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;

public class InvoiceBill extends SupplierRegistration {
    LocalDate date = LocalDate.now();
    LocalTime time = LocalTime.now();

        int invoiceID = 0;
        int autoInvoiceId;
        int invoiceNumber;
        int quantity;
        int rate;
        int discount;
        int totalAmount;


    public void invoiceBill() {
        try {

        System.out.println("---------------------------------------------");
        System.out.println("\t\t\t" + "Invoice Bill");
        System.out.println("---------------------------------------------");

        autoInvoiceId = ++invoiceID;

        System.out.println("Invoice No: " + autoInvoiceId);

        File file = new File("D:\\Invoice Project (File Writer)\\Invoice Bill\\" + autoInvoiceId + ".txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("---------------------------------------------");
        bw.newLine();
        bw.write("\t" + "Invoice Bill");
        bw.newLine();
        bw.write("---------------------------------------------");
        bw.newLine();
        bw.write("Invoice ID: " + "\t" + autoInvoiceId);
        bw.newLine();
        bw.write("Date: " + "\t\t" + date);
        bw.newLine();
        bw.write("Time: " + time);
        bw.newLine();

        // Read Customer Registration File
        System.out.println("Enter Customer ID:");
        String cusID = input.nextLine();

        File invoiceReadCustomer = new File("D:\\Invoice Project (File Writer)\\Customer Registration\\Customer\\" + cusID + ".txt");
        FileReader fr = new FileReader(invoiceReadCustomer);
        BufferedReader br = new BufferedReader(fr);

        String customerReader;
        while ((customerReader = br.readLine()) != null){
                System.out.println(customerReader);
                bw.write(customerReader);
                bw.newLine();
        }

        // Read Product Registration File
        System.out.println("Enter Product ID:");
        String proID = input.nextLine();

        File invoiceReadProduct = new File("D:\\Invoice Project (File Writer)\\Product Registration\\Product\\" + proID + ".txt");
        FileReader frr = new FileReader(invoiceReadProduct);
        BufferedReader brr = new BufferedReader(frr);

        String productReader;
        while ((productReader = brr.readLine()) != null){
            System.out.println(productReader);
            bw.write(productReader);
            bw.newLine();
        }

        System.out.println("Quantity:");
        quantity = input.nextInt();

        System.out.println("Rate:");
        rate = input.nextInt();

        int total = rate * quantity;

        System.out.println("Discount:");
        discount = input.nextInt();

        totalAmount = total - discount;

        bw.write("Quantity: " + "\t" + quantity);
        bw.newLine();
        bw.write("Rate: " + "\t\t" + rate);
        bw.newLine();
        bw.write("Discount: " + "\t" + discount);
        bw.newLine();
        bw.write("---------------------------------------------");
        bw.newLine();
        bw.write("Total Amount: " + "\t" + totalAmount);
        bw.newLine();
        bw.write("---------------------------------------------");
        bw.close();

        System.out.println("-------------------------------------------------------");
        System.out.println("\t" + "Invoice Bill" + "\"" + autoInvoiceId + "\"" + "Is Successfully Added.");
        System.out.println("-------------------------------------------------------");

        System.out.println("Enter 0 For Back Or Enter Any Digit For Add New.");
        } catch (Exception e){
            System.out.println(e);
        } // End Try & Catch
    }
    public void quantity(){
        try {

            File file = new File("D:\\Invoice Project (File Writer)\\Available Stock\\Quantity\\" + autoInvoiceId + ".txt");
            FileWriter fww = new FileWriter(file);
            BufferedWriter bww = new BufferedWriter(fww);
            bww.write("Quantity: " + "\t" + quantity);
            bww.close();

        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}

