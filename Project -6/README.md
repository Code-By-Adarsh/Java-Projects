# 🧮 Advanced Calculator (Java)

Welcome to the **Advanced Calculator** 🚀  
This project is a **Java-based CLI calculator** that allows users to perform **Addition, Subtraction, Multiplication, and Division** with a simple menu-driven system.

---

## ✨ Features

✔️ **Addition** – Enter multiple numbers until `"Quit"` to get their sum  
✔️ **Subtraction** – Perform subtraction between two numbers  
✔️ **Multiplication** – Multiply two numbers  
✔️ **Division** – Divide two numbers safely (handles division by zero)  
✔️ **Exit Option** – Exit gracefully from the program  

---

## 🛠️ Tech Stack

- **Language:** Java ☕  
- **Concepts Used:**  
  - OOP (Class & Objects)  
  - ArrayList for dynamic number storage  
  - Exception handling (`NumberFormatException`)  
  - Loops and conditional statements  
  - CLI-based menu system  

---

## 📂 Project Structure

Calculator.java
│
├── class calc
│ ├── sum() → Add multiple numbers
│ ├── sub(int a, int b) → Subtract numbers
│ ├── mul(int a, int b) → Multiply numbers
│ └── div(int a, int b) → Divide numbers
│
└── public class Calculator
└── main() → Menu-driven calculator operations

yaml
Copy code

---

## ▶️ How to Run

1. Clone or download this repository  
2. Compile the Java file:  
   ```bash
   javac Calculator.java
Run the program:

bash
Copy code
java Calculator
📖 Sample Menu
markdown
Copy code
---Welcome to the Advanced Calculator---
---Menu---
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit
🔑 Example Usage
➕ Addition
pgsql
Copy code
Enter numbers to add and for Quit(type-'Quit'):
5
10
15
Quit
The sum of given number is : 30
➖ Subtraction
yaml
Copy code
Enter first number: 20
Enter second number: 5
The subtraction of 20 and 5 is : 15
✖ Multiplication
yaml
Copy code
Enter first number: 4
Enter second number: 7
The multiplication of 4 and 7 is : 28
➗ Division
yaml
Copy code
Enter first number: 12
Enter second number: 4
The value of 12/4 is : 3
👨‍💻 Author
Adarsh Jayprakash Mishra
📌 B.Sc. Computer Science Student
📌 Loves building Java CLI projects for learning & practice

🚀 Future Enhancements
Add Power & Modulus operations

Implement Square root & Factorial

Create a Scientific Calculator version

Store history of calculations