package Invoice;

import java.io.*;

public class AvailableStock extends InvoiceBill {
    String line;
    int stockId = 0;
    int autoStockId;

    int available;

    public void availableStock() {
        try {
        available = purchasedStock - quantity;
        autoStockId = ++stockId;

        File file = new File("D:\\Invoice Project (File Writer)\\Available Stock\\" + autoStockId + ".txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);

        bw.write("---------------------------------------------");
        bw.newLine();
        bw.write("\t" + "Available Stock");
        bw.newLine();
        bw.write("---------------------------------------------");
        bw.newLine();

        // Reading Product
        System.out.println("Enter Product ID:");
        String check = input.nextLine();

        File availableReadProduct = new File("D:\\Invoice Project (File Writer)\\Product Registration\\Product\\" + check + ".txt");
        FileReader fr = new FileReader(availableReadProduct);
        BufferedReader br = new BufferedReader(fr);

        String productReader;
            while ((productReader = br.readLine()) != null){
                System.out.println(productReader);
                bw.write(productReader);
                bw.newLine();
            }

        File availableReadQuantity = new File("D:\\Invoice Project (File Writer)\\Available Stock\\Quantity\\" + check + ".txt");
        FileReader frr = new FileReader(availableReadQuantity);
        BufferedReader brr = new BufferedReader(frr);

        String quantityReader;
            while ((quantityReader = brr.readLine()) != null){
                System.out.println(quantityReader);
                bw.write(quantityReader);
                bw.newLine();
            }

            bw.write("Available Stock: " + available);
            bw.close();
        System.out.println("-------------------------------------------------------");
        System.out.println("Enter 0 For Back Or Enter Any Digit For View Another.");
        }
        catch (Exception e){
            System.out.println(e);
        }



    }
}