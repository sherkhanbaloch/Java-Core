package Invoice;

import java.io.*;

public class ProductRegistration extends CustomerRegistration {
    int productId = 0;
    int autoProductId;
    String productName;
    String purchasedFrom;
    String purchasedDate;
    int purchasedStock;
    int purchasedRate;
    int netRate;

    public void productRegistration(){
        System.out.println("---------------------------------------------");
        System.out.println("\t\t\t" + "Product Registration");
        System.out.println("---------------------------------------------");

        autoProductId = ++productId;
        System.out.println("Product ID: " + autoProductId);

        System.out.println("Product Name:");
        productName = input.nextLine();

        System.out.println("Purchased From:");
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

    public void productRegistrationWriter() {
        try {

            File file = new File("D:\\Invoice Project (File Writer)\\Product Registration\\" +autoProductId + ".txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("---------------------------------------------");
            bw.newLine();
            bw.write("\t" + "Product Registration");
            bw.newLine();
            bw.write("---------------------------------------------");
            bw.newLine();
            bw.write("Product ID: " + "\t\t" + productId);
            bw.newLine();
            bw.write("Product Name: " + "\t\t" + productName);
            bw.newLine();
            bw.write("Purchased From: " + "\t" + purchasedFrom);
            bw.newLine();
            bw.write("Purchased Date: " + "\t" + purchasedDate);
            bw.newLine();
            bw.write("Purchased Stock: " + "\t" + purchasedStock);
            bw.newLine();
            bw.write("Purchased Rate: " + "\t" + purchasedRate);
            bw.newLine();
            bw.write("Net Rate: " + "\t\t" + netRate);
            bw.newLine();
            bw.write("---------------------------------------------");
            bw.close();

            System.out.println("-------------------------------------------------------");
            System.out.println("\t" + "Product" + " \"" + productName.toUpperCase() + "\" " + "Is Successfully Added.");
            System.out.println("-------------------------------------------------------");

            System.out.println("Enter 0 For Back Or Enter Any Digit For Add New.");

        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    public void productWriter(){
        try {

            File file = new File("D:\\Invoice Project (File Writer)\\Product Registration\\Product\\" + autoProductId + ".txt");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write("Product ID: " + "\t\t" + productId);
            bw.newLine();
            bw.write("Product Name: " + "\t\t" + productName);
            bw.newLine();
            bw.write("Purchased Stock: " + "\t" + purchasedStock);
            bw.newLine();
            bw.write("Net Rate: " + "\t\t" + netRate);
            bw.newLine();
            bw.close();


        }catch (Exception e){
            System.out.println(e);
        }
    }

}
