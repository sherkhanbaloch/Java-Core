package ZongHelpLine;
import java.util.Scanner;

public class ZongHelpLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SMSBundles obj = new SMSBundles();

        int choice;
        obj.dashboard();
        do {
            System.out.print("Enter Choice: ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                    obj.topBundles();
                    System.out.print("Enter Choice: ");
                    choice = input.nextInt();
                    if (choice == 0){
                        obj.dashboard();
                    }
                    else if (choice == 1){
                        obj.superWeeklyPremium();
                        System.out.print("Enter Choice: ");
                        choice = input.nextInt();
                        if (choice == 1){
                            obj.swpInformation();
                        }
                    }
                    else if (choice == 2){
                        obj.megaData();
                        System.out.print("Enter Choice: ");
                        choice = input.nextInt();
                        if (choice == 1){
                            obj.mdInformation();
                        }
                    }
                    break;
                case 2:
                    obj.internetBundles();
                    System.out.print("Enter Choice: ");
                    choice = input.nextInt();
                    if (choice == 0){
                        obj.dashboard();
                    }
                    break;

                case 11:
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }


        }while (choice != 11);

    }
}
