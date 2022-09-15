
package TailorManagementSystem;
import java.io.*;

public class CustomerMeasurement extends CustomerRegistration {
    
        int measurementID = 0;
        int autoMeasurementID;
        int kameezLength;
        int arm;
        int teero;
        int collor;
        int chest;
        int width;
        int daman;
        int cuff;
        int plate;
        int shalwarLength;
        int pacho;
        
    public void customerMeasurement(){
        
        System.out.println("\t" + "---------------------------------------------");
        System.out.println("\t\t" + "Customer Measurement");
        System.out.println("\t" + "---------------------------------------------");

         autoMeasurementID = ++measurementID;
         System.out.println("Measurement ID: " + autoMeasurementID);
         
        System.out.print("Kameez Length: ");
        kameezLength = input.nextInt();
        
        System.out.print("Arm: ");
        arm = input.nextInt();
        
        System.out.print("Teero: ");
        teero = input.nextInt();
        
        System.out.print("Collor: ");
        collor = input.nextInt();
        
        System.out.print("Chest: ");
        chest = input.nextInt();
        
        System.out.print("Width: ");
        width = input.nextInt();
        
        System.out.print("Daman: ");
        daman = input.nextInt();
        
        System.out.print("Cuff: ");
        cuff = input.nextInt();
        
        System.out.print("Plate: ");
        plate = input.nextInt();
        
        System.out.print("Shalwar Length: ");
        shalwarLength = input.nextInt();
        
        System.out.print("Pacho: ");
        pacho = input.nextInt();
        
    }
    
    public void customerMeasurementWriter(){
        try{
        File file = new File("D:\\Tailor Management System\\Customer Measurement\\" + autoMeasurementID + ".txt");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        
        bw.write("---------------------------------------------");
        bw.newLine();
        bw.write("\t"+"Customer Measurement");
        bw.newLine();
        bw.write("---------------------------------------------");
        bw.newLine();
        bw.write( "Customer ID: "+ "\t"+ customerID);
        bw.newLine();
        bw.write("Kameez Length: " + "\t"+ kameezLength);
        bw.newLine();
        bw.write("Arm: " + "\t\t"+ arm);
        bw.newLine();
        bw.write("Teero: " + "\t\t"+ teero);
        bw.newLine();
        bw.write("Collor: " + "\t"+ collor);
        bw.newLine();
        bw.write("Chest: " + "\t\t"+ chest);
        bw.newLine();
        bw.write("Width: " + "\t\t"+ width);
        bw.newLine();
        bw.write("Daman: " + "\t\t"+ daman);
        bw.newLine();
        bw.write("Cuff: " + "\t\t"+ cuff);
        bw.newLine();
        bw.write("Plate: " + "\t\t"+ plate);
        bw.newLine();
        bw.write("Shalwar Length: " + shalwarLength);
        bw.newLine();
        bw.write("Pacho: " + "\t\t"+ pacho);
        bw.close();
        
            System.out.println("Measurement ID " + "\"" + autoMeasurementID + "\"" + " is succesfully added.");
            System.out.println("Press 0 For Back or Press Any Digit For Add New.");
        
        } catch (Exception e){
            System.out.println(e);
        } // End Try & Catch
        
    }
    
    public void measureWriter(){
        try{
            File file2 = new File("D:\\Tailor Management System\\Customer Measurement\\Measurement\\" + autoMeasurementID + ".txt");
            FileWriter fw = new FileWriter(file2);
            BufferedWriter bw = new BufferedWriter(fw);
            
        bw.write("---------------------------------------------");
        bw.newLine();
        bw.write("Measurement ID: " + autoMeasurementID);
        bw.newLine();
        bw.write("Kameez Length: " + "\t"+ kameezLength);
        bw.newLine();
        bw.write("Arm: " + "\t\t"+ arm);
        bw.newLine();
        bw.write("Teero: " + "\t\t"+ teero);
        bw.newLine();
        bw.write("Collor: " + "\t"+ collor);
        bw.newLine();
        bw.write("Chest: " + "\t\t"+ chest);
        bw.newLine();
        bw.write("Width: " + "\t\t"+ width);
        bw.newLine();
        bw.write("Daman: " + "\t\t"+ daman);
        bw.newLine();
        bw.write("Cuff: " + "\t\t"+ cuff);
        bw.newLine();
        bw.write("Plate: " + "\t\t"+ plate);
        bw.newLine();
        bw.write("Shalwar Length: " + shalwarLength);
        bw.newLine();
        bw.write("Pacho: " + "\t\t"+ pacho);
        bw.close();
        
        }catch(Exception e){
            System.out.println(e);
        } // End Try & Catch
        
    }
    
   
}
