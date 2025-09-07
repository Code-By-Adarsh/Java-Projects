import java.util.*;

class Library{
    private ArrayList<String> Books = new ArrayList<>();
    private HashMap<Integer,String> Members = new HashMap<>();
    private HashMap<Integer,String> IssueBookDetail = new HashMap<>();
    private HashMap<Integer,String> ReturnBookDetail = new HashMap<>();
    private HashMap<String,String> Contributors = new HashMap<>();
    Random rand = new Random();

    public Library(){
        String [] initialBook = {"Naruto", "One Piece", "Bleach", "Dragon Ball", "Attack on Titan", "Fullmetal Alchemist", "Death Note", "Tokyo Ghoul", "My Hero Academia", "Demon Slayer", "Jujutsu Kaisen", "Black Clover", "Fairy Tail", "Hunter x Hunter", "Chainsaw Man", "One Punch Man", "Boruto", "Blue Exorcist", "Dr. Stone", "Sword Art Online"};
        for (int i=0;i<initialBook.length;i++){
            Books.add(initialBook[i]);
        }
    }

    public void beMember(String MemberName){
        int MemberId;
        do {
            MemberId = rand.nextInt(1,101);
        }while (Members.containsKey(MemberId));
        Members.put(MemberId,MemberName);
        System.out.printf("🎉 Congratulation! %s become a Smart Library Member with ID: %d.\n", MemberName, MemberId);
    }

    public void addBook(int MemberID,String BookName){
        if (!Members.containsKey(MemberID)){
            System.out.println("Sorry! We cannot accept Book from non-member of Smart Library.");
            System.out.println("Please be first Member.");
            return;
        }
        boolean exist = false;
        for (String b:Books){
            if (b.equalsIgnoreCase(BookName)){
                exist = true;
                break;
            }
        }
        if (!exist){
            Books.add(BookName);
            Contributors.put(Members.get(MemberID),BookName);
            System.out.printf("Congratulation! Your offer for Book %s accepted.\n",BookName);
        }else {
            System.out.printf("Book %s already available.\n",BookName);
        }

    }

    public void issueBook(int MemberId,String BookName){
        if (!Members.containsKey(MemberId)) {
            System.out.println("You are not Smart Library Member.Please be first Smart Library Member.");
            return;
        }
        boolean exist = false;
        for (String b:Books){
            if (b.equalsIgnoreCase(BookName)){
                exist = true;
                break;
            }
        }
        if (exist) {
            if (!IssueBookDetail.containsKey(MemberId)){
                for (String b:Books){
                    if (b.equalsIgnoreCase(BookName)){
                        Books.remove(b);
                        IssueBookDetail.put(MemberId,b);
                        System.out.printf("Book %s successfully issued to ID: %d.\n",BookName,MemberId);
                        return;
                    }
                }
            }else {
                System.out.printf("Book %s cannot issued to Id: %d as Book %s already issued.\n",BookName,MemberId,IssueBookDetail.get(MemberId));
            }
        }else {
            System.out.printf("Sorry! %s book currently not available.\n",BookName);
        }
    }

    public void returnBook(int MemberId,String BookName){
        if (!Members.containsKey(MemberId)) {
            System.out.println("You are not Smart Library Member.Please be first Smart Library Member.");
            return;
        }
        if (IssueBookDetail.containsKey(MemberId)){
            if (BookName.equalsIgnoreCase(IssueBookDetail.get(MemberId))){
                Books.add(IssueBookDetail.get(MemberId));
                ReturnBookDetail.put(MemberId,IssueBookDetail.get(MemberId));
                IssueBookDetail.remove(MemberId);
                System.out.printf("Book %s successfully returned from ID: %d.\n",BookName,MemberId);
            }else {
                System.out.printf("Book %s cannot returned from ID: %d as not issued.\n",BookName,MemberId);
            }
        }else {
            System.out.printf("Book %s cannot returned as it not issued to ID: %d.\n",BookName,MemberId);
        }
    }

    public void displayBooks(int MemberId){
        if (Members.containsKey(MemberId)){
            for (int i=0;i<Books.size();i++){
                System.out.println((i+1)+". "+Books.get(i));
            }
        }else {
            System.out.println("You are not Smart Library Member.Please be first Member.");
        }

    }

    public void displayContributorsDetails(int MemberId){
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

    public void displayIssueDetails(int MemberId){
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

    public void displayReturnDetails(int MemberId){
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

    public void displayMemberDetails(int MemberId){
        if (Members.containsKey(MemberId)){
            System.out.println("-----Member Details-----");
            System.out.println("ID"+"     "+"Member");
            for (Map.Entry<Integer,String> e:Members.entrySet()){
                System.out.println(e.getKey()+"     "+e.getValue());
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
            System.out.println("1\uFE0F⃣ Member Registration");
            System.out.println("2\uFE0F⃣ Contribute Book to Library");
            System.out.println("3\uFE0F⃣ Issue Book");
            System.out.println("4\uFE0F⃣ Return Book");
            System.out.println("5\uFE0F⃣ Display Available Books");
            System.out.println("6\uFE0F⃣ Display Contributors Details");
            System.out.println("7\uFE0F⃣ Display Issued Details");
            System.out.println("8\uFE0F⃣ Display Return Details");
            System.out.println("9\uFE0F⃣ Display Member Details");
            System.out.println("\uD83D\uDD1F Exit");
            System.out.print("👉 Enter your choice: ");
            int user = sc.nextInt();
            sc.nextLine();
            if (user==1){
                System.out.print("Enter your Name: ");
                String name = sc.nextLine();
                l.beMember(name);
                System.out.println("---------------------------------------------------");
            }else if (user==2){
                System.out.print("Enter your ID: ");
                int ID = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Book Name: ");
                String Bookname = sc.nextLine();
                l.addBook(ID,Bookname);
                System.out.println("---------------------------------------------------");
            } else if (user==3) {
                System.out.print("Enter your ID: ");
                int ID = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Book Name: ");
                String Bookname = sc.nextLine();
                l.issueBook(ID,Bookname);
                System.out.println("---------------------------------------------------");
            } else if (user==4) {
                System.out.print("Enter your ID: ");
                int ID = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Book Name: ");
                String Bookname = sc.nextLine();
                l.returnBook(ID,Bookname);
                System.out.println("---------------------------------------------------");
            } else if (user==5) {
                System.out.print("Enter your ID: ");
                int ID = sc.nextInt();
                l.displayBooks(ID);
                System.out.println("---------------------------------------------------");
            } else if (user==6) {
                System.out.print("Enter your ID: ");
                int ID = sc.nextInt();
                l.displayContributorsDetails(ID);
                System.out.println("---------------------------------------------------");
            } else if (user==7) {
                System.out.print("Enter your ID: ");
                int ID = sc.nextInt();
                l.displayIssueDetails(ID);
                System.out.println("---------------------------------------------------");
            }else if (user==8){
                System.out.print("Enter your ID: ");
                int ID = sc.nextInt();
                l.displayReturnDetails(ID);
                System.out.println("---------------------------------------------------");
            }else if (user==9){
                System.out.print("Enter your ID: ");
                int ID = sc.nextInt();
                l.displayMemberDetails(ID);
                System.out.println("---------------------------------------------------");
            }
            else if (user==10){
                System.out.println("Thanks for using Smart Library. Goodbye.");
                System.out.println("Exiting............");
                System.out.println("---------------------------------------------------");
                break;
            }else {
                System.out.println("Invalid choice.Please choose between (1-10).");
                System.out.println("---------------------------------------------------");
            }
        }
    }
}