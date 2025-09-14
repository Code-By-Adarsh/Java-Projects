import java.util.*;

class Process {
    Scanner sc = new Scanner(System.in);
    private HashMap<String, Double> subjectMarks = new HashMap<>();

    //Class-1 and 2
    public void class1and2(String studentName) {
        subjectMarks.clear();
        String[] subject = {"English", "Hindi", "Math", "EVS", "Drawing", "Computer", "GK"};
        for (int i = 0; i < subject.length; i++) {
            System.out.printf("Enter marks of %s: ", subject[i]);
            subjectMarks.put(subject[i], sc.nextDouble());
        }
        double totalMarks = 0;
        for (Map.Entry<String, Double> e : subjectMarks.entrySet()) {
            totalMarks += e.getValue();
        }
        double result = (totalMarks / (subject.length * 100)) * 100;
        if (result <= 33) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Failed\nPerformance:- Poor\n", studentName, totalMarks, result);
        } else if (result <= 60 && result > 33) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Good\n", studentName, totalMarks, result);
        } else if (result > 60 && result <= 80) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Very Good\n", studentName, totalMarks, result);
        } else {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Excellent\n", studentName, totalMarks, result);
        }
    }

    //Class-3 to 5
    public void class3to5(String studentName) {
        subjectMarks.clear();
        String[] subject = {"English", "Hindi", "Math", "EVS", "Computer Science", "GK", "Art", "Sanskrit"};
        for (int i = 0; i < subject.length; i++) {
            System.out.printf("Enter marks of %s: ", subject[i]);
            subjectMarks.put(subject[i], sc.nextDouble());
        }
        double totalMarks = 0;
        for (Map.Entry<String, Double> e : subjectMarks.entrySet()) {
            totalMarks += e.getValue();
        }
        double result = (totalMarks / (subject.length * 100)) * 100;
        if (result <= 33) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Failed\nPerformance:- Poor\n", studentName, totalMarks, result);
        } else if (result <= 60 && result > 33) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Good\n", studentName, totalMarks, result);
        } else if (result > 60 && result <= 80) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Very Good\n", studentName, totalMarks, result);
        } else {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Excellent\n", studentName, totalMarks, result);
        }
    }

    //Class-6 to 8
    public void class6to8(String studentName) {
        subjectMarks.clear();
        String[] subject = {"English", "Hindi", "Math", "Science", "Social Science", "Sanskrit", "IT", "GK", "Art"};
        for (int i = 0; i < subject.length; i++) {
            System.out.printf("Enter marks of %s: ", subject[i]);
            subjectMarks.put(subject[i], sc.nextDouble());
        }
        double totalMarks = 0;
        for (Map.Entry<String, Double> e : subjectMarks.entrySet()) {
            totalMarks += e.getValue();
        }
        double result = (totalMarks / (subject.length * 100)) * 100;
        if (result <= 33) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Failed\nPerformance:- Poor\n", studentName, totalMarks, result);
        } else if (result <= 60 && result > 33) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Good\n", studentName, totalMarks, result);
        } else if (result > 60 && result <= 80) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Very Good\n", studentName, totalMarks, result);
        } else {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Excellent\n", studentName, totalMarks, result);
        }
    }

    //Class-9 and 10
    public void class9and10(String studentName) {
        subjectMarks.clear();
        String[] subject = {"English", "Hindi", "Math", "Science-I", "Science-II", "History and Political Science", "Geography", "IT", "Sanskrit", "Art"};
        for (int i = 0; i < subject.length; i++) {
            System.out.printf("Enter marks of %s: ", subject[i]);
            subjectMarks.put(subject[i], sc.nextDouble());
        }
        double totalMarks = 0;
        for (Map.Entry<String, Double> e : subjectMarks.entrySet()) {
            totalMarks += e.getValue();
        }
        double result = (totalMarks / (subject.length * 100)) * 100;
        if (result <= 33) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Failed\nPerformance:- Poor\n", studentName, totalMarks, result);
        } else if (result <= 60 && result > 33) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Good\n", studentName, totalMarks, result);
        } else if (result > 60 && result <= 80) {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Very Good\n", studentName, totalMarks, result);
        } else {
            System.out.printf("%s got total marks:%.2f \nPercentage:- %.2f\nResult:- Pass\nPerformance:- Excellent\n", studentName, totalMarks, result);
        }
    }
}
public class StudentGradingSystem {
    public static void main(String[] args) {
        Process p = new Process();
        System.out.println("\n\n                                        ----------Welcome to the Official Narayani Challenger Convent School Grading System----------");
        System.out.println("\nNote :- Our school is now providing the best AI included grading system tools to our student by which they easily predict their grades and percentage before result.");
        while (true){
            System.out.println("-----Menu-----\n1.Class 1-2\n2.Class 3-5\n3.Class 6-8\n4.Class 9-10\n5.Exit");
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter your choice: ");
            int user = sc.nextInt();
            sc.nextLine();
            if (user==1){
                System.out.print("Enter your Name: ");
                String name = sc.nextLine();
                p.class1and2(name);
                System.out.println("-----------------------------------------------------------");
            } else if (user==2) {
                System.out.print("Enter your Name: ");
                String name = sc.nextLine();
                p.class3to5(name);
                System.out.println("-----------------------------------------------------------");
            } else if (user==3) {
                System.out.print("Enter your Name: ");
                String name = sc.nextLine();
                p.class6to8(name);
                System.out.println("-----------------------------------------------------------");
            } else if (user==4) {
                System.out.print("Enter your Name: ");
                String name = sc.nextLine();
                p.class9and10(name);
                System.out.println("-----------------------------------------------------------");
            }else if (user==5){
                System.out.println("Thanks for using Smart Student Grading System.Goodbye!");
                System.out.println("Exiting......");
                break;
            }else {
                System.out.println("Invalid choice.Please choose between(1-5).");
            }
        }

    }
}