import java.util.Scanner;
import java.util.ArrayList;

class Account {
    double balance;
    ArrayList<String> history;
 public  Account(String ownerName,double balance){
     //this.ownerName=ownerName;
     this.balance=balance;
     this.history= new ArrayList<>();
     history.add("Account Created with balance:" +balance);
 }
 public  void deposit(double amount) {
     balance += amount;
     history.add(String.format("Deposited: \"%.2f\" Balance: \"%.2f\"", amount, balance));
 }
     public  void withdraw(double amount){
     //check if amount>balance
    if(amount>balance){

        System.out.println("Insufficient funds");

    }else{
        balance=balance-amount;
        history.add(String.format("Withdrew: \"%.2f\" Balance: \"%.2f\"", amount, balance));
    }


}
public void showHistory(){
     //loop through history and print
    for(String hist:history){
        System.out.println(hist);
    }
}
}
 public  class bankSystem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Account myAccount= new Account("john",100);

        while (true){
            System.out.println("\n ---Atm Menu---");
            System.out.println("1.Check balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Transaction History");
            System.out.println("5.Exit");
            System.out.print("Choose");

            int choice=scanner.nextInt();
            if(choice==1){
                System.out.println("Balance: " +myAccount.balance);
            } else if (choice==2) {
                System.out.println("Enter amount to deposit:");
                double amt=scanner.nextDouble();
                myAccount.deposit(amt);
            } else if (choice==3) {
                System.out.println("Enter amount to withdraw");
                double amt=scanner.nextDouble();
                myAccount.withdraw(amt);
            } else if (choice==4) {
                System.out.println("Transaction History");
                    myAccount.showHistory();
            } else if (choice==5) {
                System.out.println("Bye");
                break;
            }else {
                System.out.println("invalid choice!");
            }

        }
        scanner.close();
    }
}