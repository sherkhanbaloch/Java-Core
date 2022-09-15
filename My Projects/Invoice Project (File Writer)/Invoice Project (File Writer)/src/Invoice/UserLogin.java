package Invoice;
import java.io.*;
import java.util.Scanner;

public class UserLogin {
    Scanner input = new Scanner(System.in);

    String userName;
    String password;
    String line;
    String check;


    public void userLogin(){
        try {

            System.out.println("---------------------------------------------");
            System.out.println("\t\t\t" + "User Login");
            System.out.println("---------------------------------------------");

            System.out.println("Enter User Name: ");
            userName = input.nextLine();

            System.out.println("Enter Password");
            password = input.nextLine();


            check = userName;

            File file = new File("D:\\Invoice Project (File Writer)\\UserPassword\\" + check + ".txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            int chek = 0;


            while ((line = br.readLine()) != null) {
                if (line.contains(userName)){


                }
              else{
                  chek = 1;
                    System.out.println("-------------Change The Password--------------------");
                }
//                System.out.println(line);
              if (chek==1){
                  userChangePassword();

              }
            }


        } catch (Exception e){
            System.out.println(e);
        }


    }
    public void userChangePassword(){
        try {

            System.out.println("Enter New User Name: ");
            userName = input.nextLine();

            File f1 = new File("D:\\Invoice Project (File Writer)\\UserPassword\\" + userName + ".txt");
            FileWriter fw = new FileWriter(f1);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(userName);
            bw.newLine();

            System.out.println("Enter New Password");
            bw.write(input.nextLine());
            bw.close();







        } // end try
        catch (Exception e){
            System.out.println(e);
        }








    }
}
