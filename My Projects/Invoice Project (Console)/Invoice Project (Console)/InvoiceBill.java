package Invoice;
import java.time.LocalDate;

public class InvoiceBill extends SupplierRegistration {
    LocalDate date = LocalDate.now();

        int invoiceID = 0;
        int autoId;
        int invoiceNumber;
        int quantity;
        int rate;
        int discount;
        int totalAmount;


    public void invoiceBill(){
        System.out.println("---------------------------------------------");
        System.out.println("\t\t\t" + "Invoice Bill");
        System.out.println("---------------------------------------------");

//        System.out.println("Invoice ID:");
//        invoiceID = input.nextInt();
        autoId = ++invoiceID;

        System.out.println("Invoice No:");
        invoiceNumber = input.nextInt();

        System.out.println("Quantity:");
        quantity = input.nextInt();

        System.out.println("Rate:");
        rate = input.nextInt();

        System.out.println("Discount:");
        discount = input.nextInt();

        totalAmount = rate - discount;

    }
    public void invoiceBill2(){
        System.out.println("-------------------------------------------------------");
        System.out.println("\t\t\t\t\t" + "Invoice Bill");
        System.out.println("-------------------------------------------------------");

        System.out.println("Invoice ID: "  + "\t" + autoId);
        System.out.println("Invoice No: "  + "\t" + invoiceNumber);
        System.out.println("Date: "  + "\t\t\t" + date);
        System.out.println("Customer Code: "  + "\t" + customerCode);
        System.out.println("Customer Name: "  + "\t" + customerFirstName + customerLastName);
        System.out.println("Product Code: "  + "\t" + productCode);
        System.out.println("Product Name: "  + "\t" + productName);
        System.out.println("Quantity: "  + "\t\t" + quantity);
        System.out.println("Rate: " + "\t\t\t" + rate);
        System.out.println("Discount: "  + "\t\t" + discount);
        System.out.println("Total Amount: "  + "\t" + totalAmount);

        System.out.println("-------------------------------------------------------");
        System.out.println("\t" + "Invoice Bill Is Successfully Added.");
        System.out.println("-------------------------------------------------------");

        System.out.println("Enter 0 For Back Or Enter Any Digit For Add New.");
    }
}
