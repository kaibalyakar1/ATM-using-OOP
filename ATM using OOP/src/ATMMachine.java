import java.util.Scanner;

class ATM{
    float Balance;
    int PIN = 6789;

void checkPin() {
    System.out.println("Enter Your PIN : ");
    Scanner sc = new Scanner(System.in);
    int enteredPIN = sc.nextInt();

    if(enteredPIN == PIN){
        menu();
    }else{
        System.out.println("Invalid PIN");
        checkPin();
    }

}

void menu(){
    System.out.println("Enter Your Choice");
    System.out.println("1. Check Balance");
    System.out.println("2. Withdraw Money");
    System.out.println("3. Deposit Money");
    System.out.println("4. EXIT");

    Scanner sc = new Scanner(System.in);
    int opt = sc.nextInt();

    if(opt == 1){
        checkBalance();
    }else if(opt == 2){
        withdrawMoney();
    }else if(opt == 3){
        depositMoney();
    }else if(opt == 4){
        return;
    }else{
        System.out.println("Invalid input");
    }
}

public void checkBalance(){
    System.out.println("Your account balance is : "+Balance);
    menu();
}

public void withdrawMoney(){
    System.out.println("Enter the amount :");
    Scanner sc = new Scanner(System.in);
    float withdrawAmount = sc.nextFloat();

    if(withdrawAmount<= Balance){
        Balance = Balance-withdrawAmount;
        System.out.println("Rs"+ withdrawAmount+" deducted & Available balance "+Balance);


    }else{
        System.out.println("Insufficient Funds");
    }
    menu();
}

public void depositMoney(){
    System.out.println("Enter the amount : ");
    Scanner sc = new Scanner(System.in);
    float amount = sc.nextFloat();
    Balance = Balance+ amount;
    System.out.println(amount+" added to your account & Available balance "+Balance);
    menu();
}

}

public class ATMMachine {


    public static void main(String[] args) {
ATM obj = new ATM();
obj.checkPin();
    }
}
