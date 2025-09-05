import java.util.*;

class Bank{
    private String HolderName;
    private double Balance;
    private boolean accountCreated = false;
    private HashMap<String, Double> Accounts = new HashMap<>();

    public void createAccount(String HolderName,double Balance){
        if (!Accounts.containsKey(HolderName)){
            this.HolderName = HolderName;
            this.Balance = Balance;
            accountCreated = true;
            Accounts.put(HolderName,Balance);
            System.out.printf("Account successfully created on Name : %s with initial amount %.2f.",HolderName,Balance);
        }else {
            System.out.printf("Account with Name %s is already present.Please try another Name.",HolderName);
        }
    }

    public void deposit(String HolderName, double Amount){
        if (!Accounts.containsKey(HolderName)) {
            System.out.println("❌ Please create an account first!");
            return;
        }
        if (Amount > 0){
            double Balance = Accounts.get(HolderName) + Amount;
            Accounts.put(HolderName,Balance);
            System.out.printf("Amount $%.2f successfully deposited.",Amount);
            System.out.println(" ");
        }else {
            System.out.println("Invalid Amount! Cannot be deposited.");
            System.out.println(" ");
        }
    }

    public void withdraw(String HolderName, double Amount){
        if (!Accounts.containsKey(HolderName)) {
            System.out.println("❌ Please create an account first!");
            return;
        }
        if (Amount > Accounts.get(HolderName)){
            System.out.println("Amount cannot be withdraw as balance is less.");
            System.out.println(" ");
        }else {
            double Balance = Accounts.get(HolderName)-Amount;
            Accounts.put(HolderName,Balance);
            System.out.printf("Amount $%.2f successfully withdrawn.",Amount);
            System.out.println(" ");
        }
    }

    public void display(){
        if (!accountCreated) {
            System.out.println("❌ No account found! Please create an account first.");
            return;
        }
        System.out.println("-----Account Details-----");
        System.out.println("Account     Balance");
        for (Map.Entry<String,Double> e:Accounts.entrySet()){
            System.out.println(e.getKey()+"     "+e.getValue());
        }
    }

    public void deleteAccount(String HolderName){
        if (Accounts.containsKey(HolderName)){
            Accounts.remove(HolderName);
            System.out.printf("%s Account successfully removed from bank database.",HolderName);
        }else {
            System.out.printf("%s Account not found in bank database.",HolderName);
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
        System.out.println("\u001B[32m---Welcome to Smart Bank---\u001B[0m");
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
                System.out.print("Enter Holder Name: ");
                String HolderName = sc.nextLine();
                System.out.print("Enter amount to deposit: ");
                double Amount = sc.nextInt();
                System.out.println(" ");
                b.deposit(HolderName,Amount);
            } else if (user==3) {
                System.out.print("Enter Holder Name: ");
                String HolderName = sc.nextLine();
                System.out.print("Enter amount to withdraw: ");
                double Amount = sc.nextInt();
                System.out.println(" ");
                b.withdraw(HolderName,Amount);
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