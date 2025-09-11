import java.util.ArrayList;
import java.util.Scanner;

class calc{
    public ArrayList<Integer> number = new ArrayList<>();

    public void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to add and for Quit(type-'Quit'): ");
        while (true){
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("Quit")){
                break;
            }
            try {
                int num = Integer.parseInt(input);
                number.add(num);
            }catch (NumberFormatException e){
                System.out.println("Invalid input! Please enter a number or Quit.");
            }
        }
        int result = 0;
        for (int n:number){
            result += n;
        }
        System.out.println("The sum of given number is : "+result);
    }

    public void sub(int a,int b){
        System.out.printf("The subtraction of %d and %d is : %d",a,b,a-b);
    }

    public void mul(int a,int b){
        System.out.printf("The multiplication of %d and %d is : %d",a,b,a*b);
    }

    public void div(int a,int b){
        if (b==0){
            System.out.println("Division is not possible if second number is 0.");
        }else {
            System.out.printf("The value of %d/%d is : %d",a,b,a/b);
        }
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calc c = new calc();
        System.out.println("---Welcome to the Advanced Calculator---");
        System.out.println("---Menu---\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
        while (true){
            System.out.println(" ");
            System.out.print("Enter your task: ");
            int user = sc.nextInt();
            if (user==1){
                c.sum();
            } else if (user == 2) {
                System.out.print("Enter first number: ");
                int a1 = sc.nextInt();
                System.out.print("Enter second number: ");
                int b1 = sc.nextInt();
                c.sub(a1, b1);
            }else if (user == 3){
                System.out.print("Enter first number: ");
                int a1 = sc.nextInt();
                System.out.print("Enter second number: ");
                int b1 = sc.nextInt();
                c.mul(a1, b1);
            }else if (user==4){
                System.out.print("Enter first number: ");
                int a1 = sc.nextInt();
                System.out.print("Enter second number: ");
                int b1 = sc.nextInt();
                c.div(a1, b1);
            } else if (user==5) {
                System.out.println("Exiting...Thank you for using this program.");
                break;
            }else {
                System.out.println("Invalid task! Please choose number(!-5).");
            }
        }

    }
}