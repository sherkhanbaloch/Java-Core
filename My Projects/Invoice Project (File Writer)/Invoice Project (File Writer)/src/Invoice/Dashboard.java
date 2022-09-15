package Invoice;

public class Dashboard extends UserLogin {
    public void dashboard(){
        System.out.println("---------------------------------------------");
        System.out.println("\t\t\t" + "Simple General Store");
        System.out.println("---------------------------------------------");
        System.out.println("01. Customer Registration");
        System.out.println("02. Product Registration");
        System.out.println("03. Supplier Registration");
        System.out.println("04. Invoice");
        System.out.println("05. Available Stock");
        System.out.println("06. Change Password");
        System.out.println("07. Quit");
    }
}
