package Invoice;

public class ProductRegistration extends CustomerRegistration {
    int productId;
    int productCode;
    String productName;
    int productNumber;
    String purchasedFrom;
    String purchasedDate;
    int purchasedStock;
    int purchasedRate;
    int netRate;

    public void productRegistration(){
        System.out.println("---------------------------------------------");
        System.out.println("\t\t\t" + "Product Registration");
        System.out.println("---------------------------------------------");

        System.out.println("Product ID:");
        productId = input.nextInt();

        System.out.println("Product Code:");
        productCode = input.nextInt();

        System.out.println("Product Name:");
        input.nextLine();
        productName = input.nextLine();

        System.out.println("Product Number:");
        productNumber = input.nextInt();

        System.out.println("Purchased From:");
        input.nextLine();
        purchasedFrom = input.nextLine();

        System.out.println("Purchased Date:");
        purchasedDate = input.nextLine();

        System.out.println("Purchased Stock:");
        purchasedStock = input.nextInt();

        System.out.println("Purchased Rate:");
        purchasedRate = input.nextInt();

        System.out.println("Net Rate:");
        netRate = input.nextInt();
    }

    public void productRegistration2(){
        System.out.println("-------------------------------------------------------");
        System.out.println("\t\t\t\t" + "Product Registration");
        System.out.println("-------------------------------------------------------");
        System.out.println("Product ID: " + "\t\t" + productId);
        System.out.println("Product Code: "  + "\t\t" + productCode);
        System.out.println("Product Name: "  + "\t\t" + productName);
        System.out.println("Model Number: "  + "\t\t" + productNumber);
        System.out.println("Purchased From: "  + "\t" + purchasedFrom);
        System.out.println("Purchased Date: "  + "\t" + purchasedDate);
        System.out.println("Purchased Stock: "  + "\t" + purchasedStock);
        System.out.println("Purchased Rate: "  + "\t" + purchasedRate);
        System.out.println("Net Rate: "  + "\t\t\t" + netRate);

        System.out.println("-------------------------------------------------------");
        System.out.println("\t" + "Product" + " \"" + productName.toUpperCase() + "\" " + "Is Successfully Added.");
        System.out.println("-------------------------------------------------------");

        System.out.println("Enter 0 For Back Or Enter Any Digit For Add New.");
    }
}
