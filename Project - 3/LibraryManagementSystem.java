import java.util.*;

class Library{
    private ArrayList<String> Books = new ArrayList<>();
    private HashMap<Integer,String> Members = new HashMap<>();
    private HashMap<Integer,String> IssueBookDetail = new HashMap<>();
    private HashMap<Integer,String> ReturnBookDetail = new HashMap<>();
    private HashMap<String,String> Contributors = new HashMap<>();
    Random rand = new Random();

    public Library(){
        String [] Book = {"Naruto", "One Piece", "Bleach", "Dragon Ball", "Attack on Titan", "Fullmetal Alchemist", "Death Note", "Tokyo Ghoul", "My Hero Academia", "Demon Slayer", "Jujutsu Kaisen", "Black Clover", "Fairy Tail", "Hunter x Hunter", "Chainsaw Man", "One Punch Man", "Boruto", "Blue Exorcist", "Dr. Stone", "Sword Art Online"};
        for (int i=0;i<Book.length;i++){
            Books.add(Book[i]);
        }
    }

    public void BeMember(String MemberName){
        int MemberId;
        do {
            MemberId = rand.nextInt(1,101);
        }while (Members.containsKey(MemberId));
        Members.put(MemberId,MemberName);
        System.out.printf("🎉 Congratulation! %s become a Smart Library Member with MemberId: %d.%n", MemberName, MemberId);
    }

    public void AddBook(int MemberID,String BookName){
        if (!Members.containsKey(MemberID)){
            System.out.println("Sorry! We cannot accept Book from non-member of Smart Library.");
            System.out.println("Please be first Member.");
            return;
        }
        if (!Books.contains(BookName)){
            Books.add(BookName);
            Contributors.put(Members.get(MemberID),BookName);
            System.out.printf("Congratulation! Your offer for Book %s accepted.\n",BookName);
        }else {
            System.out.printf("Book %s already available.",BookName);
        }

    }

    public void IssueBook(int MemberId,String BookName){
        if (!Members.containsKey(MemberId)) {
            System.out.println("You are not Smart Library Member.Please be first Smart Library Member.");
            return;
        }
        if (Books.contains(BookName)) {
            if (!IssueBookDetail.containsKey(MemberId)){
                Books.remove(BookName);
                IssueBookDetail.put(MemberId,BookName);
                System.out.printf("Book %s successfully issued to ID: %d.",BookName,MemberId);
            }else {
                System.out.printf("Book %s cannot issued to Id: %d as Book %s already issued.\n",BookName,MemberId,IssueBookDetail.get(MemberId));
            }
        }else {
            System.out.printf("Sorry! %s book currently not available.\n",BookName);
        }
    }

    public void ReturnBook(int MemberId,String BookName){
        if (!Members.containsKey(MemberId)) {
            System.out.println("You are not Smart Library Member.Please be first Smart Library Member.");
            return;
        }
        if (!Books.contains(BookName)){
            if (BookName.equals(IssueBookDetail.get(MemberId))){
                Books.add(BookName);
                IssueBookDetail.remove(MemberId);
                ReturnBookDetail.put(MemberId,BookName);
                System.out.printf("Book %s successfully returned from ID: %d.",BookName,MemberId);
            }else {
                System.out.printf("Book %s cannot returned from ID: %d as not issued.",BookName,MemberId);
            }
        }else {
            System.out.printf("Book %s cannot returned as it not issued to anyone.",BookName);
        }
    }

    public void DisplayBooks(int MemberId){
        if (Members.containsKey(MemberId)){
            for (int i=0;i<Books.size();i++){
                System.out.println((i+1)+". "+Books.get(i));
            }
        }else {
            System.out.println("You are not Smart Library Member.Please be first Member.");
        }

    }

    public void DisplayContributorsDetails(int MemberId){
        if (Members.containsKey(MemberId)){
            if (!Contributors.isEmpty()){
                System.out.println("-----Contributors Details-----");
                System.out.println("Contributors"+"     "+"Book");
                for (Map.Entry<String,String> e:Contributors.entrySet()){
                    System.out.println(e.getKey()+"     "+e.getValue());
                }
            }else {
                System.out.println("Nothing to show.No any contribution details is present.");
            }
        }else {
            System.out.println("You are not Smart Library Member.Please be first Member.");
        }
    }

    public void DisplayIssueDetails(int MemberId){
        if (Members.containsKey(MemberId)){
            if (!IssueBookDetail.isEmpty()){
                System.out.println("-----Issued Details-----");
                System.out.println("Member"+"     "+"Book");
                for (Map.Entry<Integer,String> e:IssueBookDetail.entrySet()){
                    System.out.println(e.getKey()+"     "+e.getValue());
                }
            }else {
                System.out.println("Nothing to show.No any Book issued details is present.");
            }
        }else {
            System.out.println("You are not Smart Library Member.Please be first Member.");
        }
    }

    public void DisplayReturnDetails(int MemberId){
        if (Members.containsKey(MemberId)) {
            if (!ReturnBookDetail.isEmpty()){
                System.out.println("-----Return Details-----");
                System.out.println("Member"+"     "+"Book");
                for (Map.Entry<Integer,String> e:ReturnBookDetail.entrySet()){
                    System.out.println(e.getKey()+"     "+e.getValue());
                }
            }else {
                System.out.println("Nothing to show.No any Book return details is present.");
            }
        }else {
            System.out.println("You are not Smart Library Member.Please be first Member.");
        }
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library l = new Library();
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Welcome to Smart Library----------");
        while (true){
            System.out.println("\n======= 📚 SMART LIBRARY MENU =======");
            System.out.println("1️⃣  Member Registration");
            System.out.println("2️⃣  Contribute Book to Library");
            System.out.println("3️⃣  Issue Book");
            System.out.println("4️⃣  Return Book");
            System.out.println("5️⃣  Display Available Books");
            System.out.println("6️⃣  Display Contributors Details");
            System.out.println("7️⃣  Display Issued Details");
            System.out.println("8️⃣  Display Return Details");
            System.out.println("9️⃣  Exit");
            System.out.print("👉 Enter your choice: ");
            int user = sc.nextInt();
            sc.nextLine();
            if (user==1){
                System.out.print("Enter your Name: ");
                String name = sc.nextLine();
                l.BeMember(name);
            }else if (user==2){
                System.out.print("Enter your ID: ");
                int ID = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Book Name: ");
                String Bookname = sc.nextLine();
                l.AddBook(ID,Bookname);
            } else if (user==3) {
                System.out.print("Enter your ID: ");
                int ID = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Book Name: ");
                String Bookname = sc.nextLine();
                l.IssueBook(ID,Bookname);
            } else if (user==4) {
                System.out.print("Enter your ID: ");
                int ID = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Book Name: ");
                String Bookname = sc.nextLine();
                l.ReturnBook(ID,Bookname);
            } else if (user==5) {
                System.out.print("Enter your ID: ");
                int ID = sc.nextInt();
                l.DisplayBooks(ID);
            } else if (user==6) {
                System.out.print("Enter your ID: ");
                int ID = sc.nextInt();
                l.DisplayContributorsDetails(ID);
            } else if (user==7) {
                System.out.print("Enter your ID: ");
                int ID = sc.nextInt();
                l.DisplayIssueDetails(ID);
            }else if (user==8){
                System.out.print("Enter your ID: ");
                int ID = sc.nextInt();
                l.DisplayReturnDetails(ID);
            }else if (user==9){
                System.out.println("Thanks for using Smart Library. Goodbye.");
                System.out.println("Exiting............");
                break;
            }else {
                System.out.println("Invalid choice.Please choose between (1-9).");
            }
        }
    }
}