# 🎮 Smart Number Guessing Game

Welcome to the **Smart Number Guessing Game**! A simple, fun, and interactive console-based game written in Java where the player tries to guess a randomly generated number.  

---

## 📜 Features

- Choose your **own number range**.
- Get **hints** if your guess is too high or too low.
- Track your **number of attempts**.
- **Quit anytime** by typing `Quit`.
- Play multiple rounds with the **"Play Again" option**.
- **Interactive experience with emojis** 🎉, making it fun to play.

---

## 🕹️ How to Play

1. Run the program.
2. Enter the **starting number** of your range.
3. Enter the **ending number** of your range.
4. Try to **guess the number** generated randomly by the program.
5. After each guess:
   - If the guess is too high → 🔽 Hint will tell you.
   - If the guess is too low → 🔼 Hint will tell you.
6. **Win the game** by guessing the correct number. 🏆
7. After winning or quitting, you can **choose to play again** or exit. 👋

---

## ⚙️ Game Rules

1️⃣ You must choose **two numbers** as the starting and ending points of the range.  
2️⃣ On every wrong guess, a **hint** will be provided.  
3️⃣ The answer is **randomly generated** within your chosen range.  
4️⃣ **Attempts** will be counted and displayed when you win.  
5️⃣ To **quit at any stage**, type `Quit`.  
6️⃣ **Valid input only** – entering anything other than numbers or "Quit" will cause the program to crash.  

---

## 💻 Requirements

- Java 17 or above (Java 24 recommended)
- Any IDE (IntelliJ IDEA, Eclipse, VS Code, etc.) or **command line Java compiler**
- Basic knowledge of running Java programs

---

## ⚡ Example Output

🎮 --------------- Welcome to the Smart Number Guessing Game ------------------- 🎮

📜 --- Rules:<br>
1️⃣ You have to choose two numbers.<br>
2️⃣ On every wrong guess you will get a hint.<br>
3️⃣ Answer will be generated from your numbers.<br>
4️⃣ Attempts will be counted.<br>
5️⃣ For quit at any stage just type 👉 Quit<br>
🔢 Enter Starting Number: 1<br>
🔢 Enter Ending Number: 50<br>

🤔 Enter your guess: 25<br>
❌ Oh oh! Wrong guess<br>
🔼 Hint: Your guess is less than the answer.

🤔 Enter your guess: 40<br>
❌ Oh oh! Wrong guess<br>
🔽 Hint: Your guess is greater than the answer.

🤔 Enter your guess: 37<br>
🎉 Congrats! You win 🏆<br>
📊 Attempts: 3

🔄 Do you want to play again? (yes/no): no<br>
🙏 Thanks for playing, Goodbye!<br>
👀 See you again!

---

## 📌 Notes

- The game **does not handle invalid inputs** (like letters or special characters except "Quit").
- The **random number generation** is inclusive of the starting and ending numbers.
- The game is **console-based** and works on any platform that supports Java.  

---

## 🔗 Author

**Adarsh Jayprakash Mishra**  
Passoniate QA Automation Tester

---

Enjoy the game and challenge your friends! 🎮🏆
