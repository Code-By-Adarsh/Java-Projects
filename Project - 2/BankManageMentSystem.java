import java.util.*;

class Bank{
    private String HolderName;
    private double Balance;
    private boolean accountCreated = false;
    private ArrayList<String> Accounts = new ArrayList<>();

    public void createAccount(String HolderName,double Balance){
        if (!Accounts.contains(HolderName)){
            this.HolderName = HolderName;
            this.Balance = Balance;
            accountCreated = true;
            Accounts.add(HolderName);
            System.out.printf("Account successfully created on Name : %s with initial amount %.2f.",HolderName,Balance);
        }else {
            System.out.printf("Account with Name %s is already present.Please try another Name.",HolderName);
        }

    }

    public void deposit(double Amount){
        if (!accountCreated) {
            System.out.println("❌ Please create an account first!");
            return;
        }
        if (Amount > 0){
            Balance += Amount;
            System.out.printf("Amount $%.2f successfully deposited.",Amount);
            System.out.println(" ");
        }else {
            System.out.println("Invalid Amount! Cannot be deposited.");
            System.out.println(" ");
        }
    }

    public void withdraw(double Amount){
        if (!accountCreated) {
            System.out.println("❌ Please create an account first!");
            return;
        }
        if (Amount > Balance){
            System.out.println("Amount cannot be withdraw as balance is less.");
            System.out.println(" ");
        }else {
            Balance -= Amount;
            System.out.printf("Amount $%.2f successfully withdraw.",Amount);
            System.out.println(" ");
        }
    }

    public void display(){
        if (!accountCreated) {
            System.out.println("❌ No account found! Please create an account first.");
            return;
        }
        System.out.println("-----Account Details-----");
        System.out.println("Name : "+HolderName);
        System.out.println("Balance : $"+Balance);
    }

    public void deleteAccount(String HolderName){
        if (Accounts.contains(HolderName)){
            Accounts.remove(HolderName);
            System.out.printf("%s Account successfully removed from bank database.",HolderName);
        }else {
            System.out.println("%s Account not found in bank database.");
        }

    }

    public void bankDatabase(){
        System.out.println("Bank Database : "+Accounts);
    }
}
public class BankManageMentSystem {
    public static void main(String[] args) {
        Bank b = new Bank();
        Scanner sc = new Scanner(System.in);
        System.out.println("---Welcome to the Smart Bank---");
        while (true){
            System.out.println(" ");
            System.out.println("-----Menu-----\n1.Create Account\n2.Deposit Amount\n3.Withdraw Amount\n4.Account Detail\n5.Delete Account\n6.Bank Database\n7.Exit");
            System.out.println(" ");
            System.out.print("Enter your choice: ");
            int user = sc.nextInt();
            sc.nextLine();
            if (user==1){
                System.out.print("Enter Holder Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Initial Amount: ");
                double Amount = sc.nextInt();
                System.out.println(" ");
                b.createAccount(name,Amount);
            } else if (user==2) {
                System.out.print("Enter amount to deposit: ");
                double Amount = sc.nextInt();
                System.out.println(" ");
                b.deposit(Amount);
            } else if (user==3) {
                System.out.print("Enter amount to withdraw: ");
                double Amount = sc.nextInt();
                System.out.println(" ");
                b.withdraw(Amount);
            }else if (user==4){
                b.display();
            } else if (user==5) {
                System.out.print("Enter Holder Name: ");
                String HolderName = sc.nextLine();
                b.deleteAccount(HolderName);
            } else if (user==6) {
                b.bankDatabase();
            } else if (user==7) {
                System.out.println("Thanks for using Smart Bank.");
                System.out.println("Bank Program Exiting......");
                break;
            } else {
                System.out.println("Invalid Choice! Please try between(1-7).");
            }
        }
    }
}