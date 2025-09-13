import java.util.*;

class Process{
    Scanner sc = new Scanner(System.in);
    private HashMap<String, Double> subjectMarks = new HashMap<>();

    //Class-1
    public void class1(String studentName){
        subjectMarks.clear();
        String [] subject = {"English","Hindi","Math","EVS"};
        for (int i=0;i<subject.length;i++){
            System.out.printf("Enter marks of %s: ",subject[i]);
            subjectMarks.put(subject[i],sc.nextDouble());
        }
        double totalMarks = 0;
        for (Map.Entry<String,Double> e:subjectMarks.entrySet()){
            totalMarks += e.getValue();
        }
        double result = (totalMarks/(subject.length*100))*100;
        if (result<=33){
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Failed\nPerformance:- Poor\n",studentName,totalMarks,result);
        } else if (result <= 60 && result > 33) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Good\n",studentName,totalMarks,result);
        } else if (result > 60 && result <=80) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Very Good\n",studentName,totalMarks,result);
        }else {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Excellent\n",studentName,totalMarks,result);
        }
    }


    //Class-2
    public void class2(String studentName){
        subjectMarks.clear();
        String [] subject = {"English","Hindi","Math","EVS","PT"};
        for (int i=0;i<subject.length;i++){
            System.out.printf("Enter marks of %s: ",subject[i]);
            subjectMarks.put(subject[i],sc.nextDouble());
        }
        double totalMarks = 0;
        for (Map.Entry<String,Double> e:subjectMarks.entrySet()){
            totalMarks += e.getValue();
        }
        double result = (totalMarks/(subject.length*100))*100;
        if (result<=33){
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Failed\nPerformance:- Poor\n",studentName,totalMarks,result);
        } else if (result <= 60 && result > 33) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Good\n",studentName,totalMarks,result);
        } else if (result > 60 && result <=80) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Very Good\n",studentName,totalMarks,result);
        }else {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Excellent\n",studentName,totalMarks,result);
        }
    }

    //Class-3
    public void class3(String studentName){
        subjectMarks.clear();
        String [] subject = {"English","Hindi","Math","EVS","PT"};
        for (int i=0;i<subject.length;i++){
            System.out.printf("Enter marks of %s: ",subject[i]);
            subjectMarks.put(subject[i],sc.nextDouble());
        }
        double totalMarks = 0;
        for (Map.Entry<String,Double> e:subjectMarks.entrySet()){
            totalMarks += e.getValue();
        }
        double result = (totalMarks/(subject.length*100))*100;
        if (result<=33){
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Failed\nPerformance:- Poor\n",studentName,totalMarks,result);
        } else if (result <= 60 && result > 33) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Good\n",studentName,totalMarks,result);
        } else if (result > 60 && result <=80) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Very Good\n",studentName,totalMarks,result);
        }else {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Excellent\n",studentName,totalMarks,result);
        }
    }

    //Class-4
    public void class4(String studentName){
        subjectMarks.clear();
        String [] subject = {"English","Hindi","Math","EVS","PT"};
        for (int i=0;i<subject.length;i++){
            System.out.printf("Enter marks of %s: ",subject[i]);
            subjectMarks.put(subject[i],sc.nextDouble());
        }
        double totalMarks = 0;
        for (Map.Entry<String,Double> e:subjectMarks.entrySet()){
            totalMarks += e.getValue();
        }
        double result = (totalMarks/(subject.length*100))*100;
        if (result<=33){
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Failed\nPerformance:- Poor\n",studentName,totalMarks,result);
        } else if (result <= 60 && result > 33) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Good\n",studentName,totalMarks,result);
        } else if (result > 60 && result <=80) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Very Good\n",studentName,totalMarks,result);
        }else {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Excellent\n",studentName,totalMarks,result);
        }
    }

    //Class-5
    public void class5(String studentName){
        subjectMarks.clear();
        String [] subject = {"English","Hindi","Math","EVS","PT","Computer Basic"};
        for (int i=0;i<subject.length;i++){
            System.out.printf("Enter marks of %s: ",subject[i]);
            subjectMarks.put(subject[i],sc.nextDouble());
        }
        double totalMarks = 0;
        for (Map.Entry<String,Double> e:subjectMarks.entrySet()){
            totalMarks += e.getValue();
        }
        double result = (totalMarks/(subject.length*100))*100;
        if (result<=33){
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Failed\nPerformance:- Poor\n",studentName,totalMarks,result);
        } else if (result <= 60 && result > 33) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Good\n",studentName,totalMarks,result);
        } else if (result > 60 && result <=80) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Very Good\n",studentName,totalMarks,result);
        }else {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Excellent\n",studentName,totalMarks,result);
        }
    }

    //Class-6
    public void class6(String studentName){
        subjectMarks.clear();
        String [] subject = {"English","Hindi","Math","PT","Computer Basic","History"};
        for (int i=0;i<subject.length;i++){
            System.out.printf("Enter marks of %s: ",subject[i]);
            subjectMarks.put(subject[i],sc.nextDouble());
        }
        double totalMarks = 0;
        for (Map.Entry<String,Double> e:subjectMarks.entrySet()){
            totalMarks += e.getValue();
        }
        double result = (totalMarks/(subject.length*100))*100;
        if (result<=33){
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Failed\nPerformance:- Poor\n",studentName,totalMarks,result);
        } else if (result <= 60 && result > 33) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Good\n",studentName,totalMarks,result);
        } else if (result > 60 && result <=80) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Very Good\n",studentName,totalMarks,result);
        }else {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Excellent\n",studentName,totalMarks,result);
        }
    }

    //Class-7
    public void class7(String studentName){
        subjectMarks.clear();
        String [] subject = {"English","Hindi","Math","PT","History","Geography"};
        for (int i=0;i<subject.length;i++){
            System.out.printf("Enter marks of %s: ",subject[i]);
            subjectMarks.put(subject[i],sc.nextDouble());
        }
        double totalMarks = 0;
        for (Map.Entry<String,Double> e:subjectMarks.entrySet()){
            totalMarks += e.getValue();
        }
        double result = (totalMarks/(subject.length*100))*100;
        if (result<=33){
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Failed\nPerformance:- Poor\n",studentName,totalMarks,result);
        } else if (result <= 60 && result > 33) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Good\n",studentName,totalMarks,result);
        } else if (result > 60 && result <=80) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Very Good\n",studentName,totalMarks,result);
        }else {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Excellent\n",studentName,totalMarks,result);
        }
    }

    //Class-8
    public void class8(String studentName){
        subjectMarks.clear();
        String [] subject = {"English","Hindi","Math","Sport","History","Geography"};
        for (int i=0;i<subject.length;i++){
            System.out.printf("Enter marks of %s: ",subject[i]);
            subjectMarks.put(subject[i],sc.nextDouble());
        }
        double totalMarks = 0;
        for (Map.Entry<String,Double> e:subjectMarks.entrySet()){
            totalMarks += e.getValue();
        }
        double result = (totalMarks/(subject.length*100))*100;
        if (result<=33){
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Failed\nPerformance:- Poor\n",studentName,totalMarks,result);
        } else if (result <= 60 && result > 33) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Good\n",studentName,totalMarks,result);
        } else if (result > 60 && result <=80) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Very Good\n",studentName,totalMarks,result);
        }else {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Excellent\n",studentName,totalMarks,result);
        }
    }

    //Class-9
    public void class9(String studentName){
        subjectMarks.clear();
        String [] subject = {"English","Hindi","Math","Sport","History","Geography","Political Science"};
        for (int i=0;i<subject.length;i++){
            System.out.printf("Enter marks of %s: ",subject[i]);
            subjectMarks.put(subject[i],sc.nextDouble());
        }
        double totalMarks = 0;
        for (Map.Entry<String,Double> e:subjectMarks.entrySet()){
            totalMarks += e.getValue();
        }
        double result = (totalMarks/(subject.length*100))*100;
        if (result<=33){
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Failed\nPerformance:- Poor\n",studentName,totalMarks,result);
        } else if (result <= 60 && result > 33) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Good\n",studentName,totalMarks,result);
        } else if (result > 60 && result <=80) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Very Good\n",studentName,totalMarks,result);
        }else {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Excellent\n",studentName,totalMarks,result);
        }
    }

    //Class-10
    public void class10(String studentName){
        subjectMarks.clear();
        String [] subject = {"English","Hindi","Math","Sport","History","Geography","Political Science"};
        for (int i=0;i<subject.length;i++){
            System.out.printf("Enter marks of %s: ",subject[i]);
            subjectMarks.put(subject[i],sc.nextDouble());
        }
        double totalMarks = 0;
        for (Map.Entry<String,Double> e:subjectMarks.entrySet()){
            totalMarks += e.getValue();
        }
        double result = (totalMarks/(subject.length*100))*100;
        if (result<=33){
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Failed\nPerformance:- Poor\n",studentName,totalMarks,result);
        } else if (result <= 60 && result > 33) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Good\n",studentName,totalMarks,result);
        } else if (result > 60 && result <=80) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Very Good\n",studentName,totalMarks,result);
        }else {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Excellent\n",studentName,totalMarks,result);
        }
    }

}


public class StudentGradingSystem {
    public static void main(String[] args) {
        Process p = new Process();
        System.out.println("\n\n                                        ----------Welcome to the Official Narayani Challenger Convent School Grading System----------");
        System.out.println("\nNote :- Our school is now providing the best AI included grading system tools to our student by which they easily predict their grades and percentage before result.");
        while (true){
            System.out.println("-----Menu-----\n1. Class-1\n2. Class-2\n3. Class-3\n4. Class-4\n5. Class-5\n6. Class-6\n7. Class-7\n8. Class-8\n9. Class-9\n10. Class-10\n11. Exit");
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter your choice: ");
            int user = sc.nextInt();
            sc.nextLine();
            if (user==1){
                System.out.print("Enter your Name: ");
                String name = sc.nextLine();
                p.class1(name);
                System.out.println("-----------------------------------------------------------");
            } else if (user==2) {
                System.out.print("Enter your Name: ");
                String name = sc.nextLine();
                p.class2(name);
                System.out.println("-----------------------------------------------------------");
            } else if (user==3) {
                System.out.print("Enter your Name: ");
                String name = sc.nextLine();
                p.class3(name);
                System.out.println("-----------------------------------------------------------");
            } else if (user==4) {
                System.out.print("Enter your Name: ");
                String name = sc.nextLine();
                p.class4(name);
                System.out.println("-----------------------------------------------------------");
            }else if (user==5){
                System.out.print("Enter your Name: ");
                String name = sc.nextLine();
                p.class5(name);
                System.out.println("-----------------------------------------------------------");
            }else if (user==6){
                System.out.print("Enter your Name: ");
                String name = sc.nextLine();
                p.class6(name);
                System.out.println("-----------------------------------------------------------");
            }else if (user==7){
                System.out.print("Enter your Name: ");
                String name = sc.nextLine();
                p.class7(name);
                System.out.println("-----------------------------------------------------------");
            }else if (user==8){
                System.out.print("Enter your Name: ");
                String name = sc.nextLine();
                p.class8(name);
                System.out.println("-----------------------------------------------------------");
            }else if (user==9){
                System.out.print("Enter your Name: ");
                String name = sc.nextLine();
                p.class9(name);
                System.out.println("-----------------------------------------------------------");
            }else if (user==10){
                System.out.print("Enter your Name: ");
                String name = sc.nextLine();
                p.class10(name);
                System.out.println("-----------------------------------------------------------");
            } else if (user==11) {
                System.out.println("Thanks for using Program.Goodbye!");
                System.out.println("Exiting..............");
                break;
            }else {
                System.out.println("Invalid choice.Please choose between(1-11).");
            }
        }

    }
}