import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;
public class OptionMenu extends Accounts {
    Scanner MenuInput = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat(" '$' ### , ##0.00");
    HashMap<Integer, Integer> data  = new HashMap<Integer , Integer>();

    public void getLogin() throws IOException{
        int x = 1;
        do{
            try{
                data.put(952364,245871);
                data.put(985412,124596);
                data.put(958746,235484);

                System.out.println("Welcome to our ATM !");
                System.out.println("ENTER YOUR CUSTOMER NUMBER : ");
                setCustomerNumber(MenuInput.nextInt());

                System.out.print("ENTER YOUR PIN NUMBER : ");
                setPinNumber(MenuInput.nextInt());
            }catch (Exception e){
                System.out.println("/n " + "Invalid Character(s). only Numbers." + "\n");
                x = 2 ;
            }
            int cn = getCustomerNumber();
            int pn = getPinNumber();
            if (data.containsKey(cn) && data.get(cn) == pn){
                getAccountType();
            }else
                System.out.println("/n" + "Wrong Customer Number or Pin Number " + "\n" );
        }while ( x ==1);
    }

    public void getAccountType(){
        System.out.println("Select tha Account type you want to access :- ");
        System.out.println("type-1 Checking Account");
        System.out.println("type-2 Saving Account");
        System.out.println("type-3 Exit");

        int Selecion = MenuInput.nextInt();
        switch (Selecion){
            case 1:
                getChecking();
                break;
            case 2:
                getSaving();
                break;
            case 3:
                System.out.println("Thank you for using ATM !!! \n");
                break;
            default:
                System.out.println("/n" + "Invalid choice" + "\n");
        }
    }

    public void getChecking(){
        System.out.println("Checking Amount : ");
        System.out.println( "type-1 View Balance ");
        System.out.println("type-2 Withdraw Funds ");
        System.out.println("type-3 Deposit Funds");
        System.out.println("type-4 Exit ");
        System.out.print("Choice : ");

        int selection = MenuInput.nextInt();

        switch (selection){
            case 1:
                System.out.println("Checking Account Balance : " +moneyFormat.format(getCheckingBalance()));
                getAccountType();
                break;
            case 2:
                getCheckingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getCheckingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using ATM !!! \n");
                break;
            default:
                System.out.println("\nInvalid choice.\n");
                getChecking();
        }
    }

    public void getSaving(){
        System.out.println("Saving Amount : ");
        System.out.println( "type-1 View Balance ");
        System.out.println("type-2 Withdraw Funds ");
        System.out.println("type-3 Deposit Funds");
        System.out.println("type-4 Exit ");
        System.out.print("Choice : ");

        int selection = MenuInput.nextInt();

        switch (selection){
            case 1:
                System.out.println("Saving Account Balance : " +moneyFormat.format(getSavingBalance()));
                getAccountType();
                break;
            case 2:
                getSavingWithdrawInput();
                getAccountType();
                break;
            case 3:
                getSavingDepositInput();
                getAccountType();
                break;
            case 4:
                System.out.println("Thank you for using ATM !!! \n");
                break;
            default:
                System.out.println("\nInvalid choice.\n");
                getSaving();
        }
    }
}
