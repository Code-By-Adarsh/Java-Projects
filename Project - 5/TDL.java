import java.util.*;

class TODO{
    private ArrayList<String> Task = new ArrayList<>();
    private ArrayList<String> CompletedTask = new ArrayList<>();

    //helper method
    /*
    private String foundTaskIgnoreCase(String task){
        for (String a:Task){
            if (a.equalsIgnoreCase(task)){
                return a;
            }
        }
        return null;
    }
     */

    //for add task
    public void addTask(String task){
        boolean exist = false;
        for (String a:Task){
            if (a.equalsIgnoreCase(task)){
                exist = true;
                break;
            }
        }
        if (!exist){
            Task.add(task);
            System.out.printf("Your task %s successfully added.\n",task);
        }else {
            System.out.printf("Your task %s already present.\n",task);
        }
    }

    //mark task as complete
    public void completedTask(String task){
        boolean exist = false;
        for (String a:Task){
            if (a.equalsIgnoreCase(task)){
                exist = true;
                task = a;
                break;
            }
        }
        if (exist){
            Task.remove(task);
            CompletedTask.add(task);
            System.out.printf("Your task %s successfully marked as completed.\n",task);
        }else {
            System.out.printf("Your task %s cannot be marked as completed as not found.\n",task);
        }
    }

    //to remove task
    public void removeTask(String task){
        boolean exist = false;
        for (String a:Task){
            if (a.equalsIgnoreCase(task)){
                exist = true;
                task = a;
                break;
            }
        }
        if (exist){
            Task.remove(task);
            System.out.printf("Your task %s successfully removed.\n",task);
        }else {
            System.out.printf("Your task %s cannot be removed as not found.\n",task);
        }
    }

    //to display Task list
    public void displayTask(){
        if (!Task.isEmpty()){
            System.out.println("Sr.No.   Task");
            int i=1;
            for (String a:Task){
                System.out.println(" "+i+".     "+a);
                i++;
            }
        }else {
            System.out.println("No any task found.");
        }
    }

    //to display Completed Task list
    public void displayCompletedTask(){
        if (!CompletedTask.isEmpty()){
            System.out.println("Sr.No.   Task");
            int i=1;
            for (String a:CompletedTask){
                System.out.println(" "+i+".     "+a);
                i++;
            }
        }else {
            System.out.println("No any task found.");
        }
    }
}
public class TDL {
    private static void printLine(){
        System.out.println("--------------------------------------");
    }
    public static void main(String[] args) {
        TODO t = new TODO();
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Welcome to the Smart To-Do List-----");
        while (true){
            System.out.println("\n---Menu---\n1.Add Task\n2.To Mark Task as Completed\n3.Remove Task\n4.To Display Task\n5.To Display Completed Task\n6.Exit");
            printLine();
            try{
                System.out.print("\nEnter your Choice: ");
                int user = sc.nextInt();
                sc.nextLine();
                if (user == 1){
                    System.out.print("Enter your Task: ");
                    String task = sc.nextLine();
                    t.addTask(task);
                    printLine();
                } else if (user == 2) {
                    System.out.print("Enter your Task: ");
                    String task = sc.nextLine();
                    t.completedTask(task);
                    printLine();
                } else if (user == 3) {
                    System.out.print("Enter your Task: ");
                    String task = sc.nextLine();
                    t.removeTask(task);
                    printLine();
                }else if (user == 4){
                    t.displayTask();
                    printLine();
                }else if (user == 5){
                    t.displayCompletedTask();
                    printLine();
                } else if (user == 6) {
                    System.out.println("Thanks for using Smart To-Do List. Goodbye!");
                    System.out.println("Exiting To-Do List Program (estimated time:5sec) ...............");
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    printLine();
                    break;
                }else {
                    System.out.println("Invalid choice.Please choose between(1-6).");
                    printLine();
                }
            }catch (InputMismatchException  e){
                System.out.println("Some error occurred.Please choose between(1-6).");
                System.out.println(e);
                sc.nextLine();
                printLine();
            }
        }
    }
}