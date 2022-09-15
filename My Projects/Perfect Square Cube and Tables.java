
package practice;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("1. Find Perfect Square");
        System.out.println("2. Find Perfect Cube");
        System.out.println("3. Find Tables");
        
          int choice = input.nextInt();
       
          if (choice == 1){
                System.out.println("Enter Number To Find Perfect Square:"); 
                int square_number = input.nextInt();
                int square_result = square_number * square_number;
                System.out.println("The Perfect Square of " + square_number + " is " + square_result);  
          }
          
          else if (choice == 2){
               System.out.println("Enter Number To Find Perfect Cube:"); 
                int cube_number = input.nextInt();
                int cube_result = cube_number * cube_number * cube_number;
                System.out.println("The Perfect Cube of " + cube_number + " is " + cube_result);  
          }
          
          else if (choice == 3){
               System.out.println("Enter Number of Table: ");
                int table_number = input.nextInt();
       
                System.out.println("Enter Ending Number: ");
                int end_number = input.nextInt();

                for(int a =1; a<=end_number; a++){
                int result = table_number * a;
                System.out.println(table_number + " * " +  a + " = " + result);
                }  
          }
          
          else {
                System.out.println("Invalid Value! Try Again");
          }
    }
}
        
     