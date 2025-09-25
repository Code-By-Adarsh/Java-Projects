package com.company;
import java.util.*;

public class NGG {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("🎮 --------------- Welcome to the Smart Number Guessing Game ------------------- 🎮");

        while (true){
            System.out.println("\n📜 --- Rules:");
            System.out.println("1️⃣ You have to choose two numbers.");
            System.out.println("2️⃣ On every wrong guess you will get a hint.");
            System.out.println("3️⃣ Answer will be generated from your numbers.");
            System.out.println("4️⃣ Attempts will be counted.");
            System.out.println("5️⃣ For quit at any stage just type 👉 Quit");
            System.out.println("6️⃣ Please enter valid input (no error handling).");
            System.out.println("----------------------------------------------------");

            System.out.print("🔢 Enter Starting Number: ");
            int a = sc.nextInt();
            System.out.print("🔢 Enter Ending Number: ");
            int b = sc.nextInt();

            int answer = rand.nextInt(a,b);
            int count = 1;

            while (true){
                System.out.println("\n----------------------------------------------------");
                System.out.print("🤔 Enter your guess: ");
                String input = sc.next();

                if (input.equalsIgnoreCase("quit")){
                    System.out.println("👋 Thanks for playing, Goodbye!");
                    return;
                }

                int user = Integer.parseInt(input);
                if (user >= a && user <= b){
                    if (user > answer){
                        System.out.println("❌ Oh oh! Wrong guess");
                        System.out.println("🔽 Hint: Your guess is greater than the answer.");
                    } else if (user < answer) {
                        System.out.println("❌ Oh oh! Wrong guess");
                        System.out.println("🔼 Hint: Your guess is less than the answer.");
                    } else {
                        System.out.println("🎉 Congrats! You win 🏆");
                        System.out.printf("📊 Attempts: %d\n", count);
                        break;
                    }
                } else {
                    System.out.printf("⚠️ Please enter your guess between (%d,%d).\n", a, b);
                }
                count++;
            }

            System.out.print("\n🔄 Do you want to play again? (yes/no): ");
            String ask = sc.next();
            if (!ask.equalsIgnoreCase("yes")){
                System.out.println("🙏 Thanks for playing, Goodbye!");
                System.out.println("👀 See you again!");
                break;
            }
        }
        sc.close();
    }
}
