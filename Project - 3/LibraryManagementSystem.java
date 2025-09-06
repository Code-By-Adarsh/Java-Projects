import java.util.*;

class Library{
    private int MemberID;
    private String MemberName;
    private String Book;
    private HashMap<Integer,String> Members = new HashMap<>();
    private HashMap<Integer,String> OpenBook = new HashMap<>();
    private HashMap<String,String> Contributors = new HashMap<>();
    Random rand = new Random();
    
    public void BeMember(String MemberName){
        int MemberId;
        do {
            MemberId = rand.nextInt(1,101);
        }while (Members.containsKey(MemberId));
        this.MemberID = MemberId;
        this.MemberName = MemberName;
        Members.put(MemberId,MemberName);
        System.out.printf("🎉 Congratulation! %s became a Smart Library Member with MemberId: %d.%n", MemberName, MemberId);
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
    }
}