import java.text.DecimalFormat;
import java.util.Scanner;

public class Accounts {

    private int CustomerNumber;
    private int PinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

    Scanner input;


    Scanner sc = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat(" '$'###, ##0.00 ");

    public int setCustomerNumber(int CustomerNumber){
        this.CustomerNumber = CustomerNumber;
        return CustomerNumber;
    }

    public int getCustomerNumber(){
        return CustomerNumber;
    }

    public  int setPinNumber(int PinNumber){
        this.PinNumber= PinNumber;
        return PinNumber;
    }
    public int getPinNumber(){
        return PinNumber;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }
    public double calCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }

    public double calSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
        return checkingBalance;
    }

    public double calCheckingDeposit(double amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }

    public double calSavingDeposit(double amount){
        savingBalance = (savingBalance + amount);
        return checkingBalance;
    }

    public void getCheckingWithdrawInput(){
        input = new Scanner(System.in);

        System.out.println("Checking Account Balance : " +moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to Withdraw from Checking Account :" );

        double amount = input.nextDouble();

        if ((checkingBalance - amount)>= 0){
            calCheckingWithdraw(amount);
            System.out.println("New Checking Amount Balance : " +moneyFormat.format(checkingBalance));
        }else {
            System.out.println("Balance Can not be Negative." + "\n");
        }
    }

    public void getCheckingDepositInput(){
        input = new Scanner(System.in);

        System.out.println("Checking Account Balance : " +moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to Deposit from Checking Account :" );
        double amount = input.nextDouble();

        if ( amount>= 0){
            calCheckingDeposit(amount);
            System.out.println("New Checking Amount Balance : " +moneyFormat.format(checkingBalance));
        }else {
            System.out.println("Balance Can not be Negative." + "\n");
        }
    }

    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance : " +moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from Saving Account :" );
        double amount = input.nextDouble();

        if ((savingBalance - amount)>= 0){
            calSavingWithdraw(amount);
            System.out.println("New Saving Amount Balance : " +moneyFormat.format(savingBalance));
        }else {
            System.out.println("Balance Can not be Negative." + "\n");
        }
    }

    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance : " +moneyFormat.format(savingBalance));
        System.out.println("Amount you want to Deposit from Saving Account :" );
        double amount = input.nextDouble();

        if (amount>= 0){
            calSavingDeposit(amount);
            System.out.println("New Saving Amount Balance : " +moneyFormat.format(savingBalance));
        }else {
            System.out.println("Balance Can not be Negative." + "\n");
        }
    }

}