📚 Smart Library Management System

Welcome to Smart Library Management System 🚀
A Java-based console project that allows users to register as members, contribute books, issue/return books, and view complete library details with ease.

✨ Features

✅ Member Registration 👤

✅ Book Contribution 📖

✅ Issue & Return Books 🔄

✅ Display Available Books 📚

✅ Contributor Details 🙌

✅ Issued & Returned Book Records 🗂️

✅ Member Details 📝

✅ Random Book Suggestion 🎲

⚙️ Installation & Usage Guide
1️⃣ Clone this repository
git clone https://github.com/your-username/LibraryManagementSystem.git
cd LibraryManagementSystem

2️⃣ Compile the program
javac LibraryManagementSystem.java

3️⃣ Run the program
java LibraryManagementSystem

4️⃣ Interact with the menu
======= 📚 SMART LIBRARY MENU =======
1⃣ Member Registration
2⃣ Contribute Book
3⃣ Issue Book
4⃣ Return Book
5⃣ Display Books
6⃣ Display Contributors
7⃣ Display Issued Books
8⃣ Display Returned Books
9⃣ Display Members
🔟 Exit

🛠️ Methods Explained with Examples
1. beMember(String MemberName) 👤

👉 Registers a new member with a unique ID.

l.beMember("Adarsh");


✅ Output:

🎉 Congratulation! Adarsh become a Smart Library Member with ID: 45.

2. addBook(int MemberID, String BookName) 📖

👉 Adds a book to the library if the user is a member.

l.addBook(45, "The Alchemist");


✅ Output:

Congratulation! Your offer for Book The Alchemist accepted.

3. issueBook(int MemberId, String BookName) 📕➡️👤

👉 Issues a book to a member if available.

l.issueBook(45, "Naruto");


✅ Output:

Book Naruto successfully issued to ID: 45.

4. returnBook(int MemberId, String BookName) 👤➡️📕

👉 Returns a book and suggests a random book.

l.returnBook(45, "Naruto");


✅ Output:

Book Naruto successfully returned from ID: 45.
Try this 👉 : One Piece.

5. displayBooks(int MemberId) 📚

👉 Shows all available books.

l.displayBooks(45);


✅ Output:

1. Naruto
2. One Piece
3. Bleach
...

6. displayContributorsDetails(int MemberId) 🙌

👉 Displays members who contributed books.

l.displayContributorsDetails(45);


✅ Output:

-----Contributors Details-----
Contributors     Book
Adarsh           The Alchemist

7. displayIssueDetails(int MemberId) 🗂️

👉 Shows issued book records.

l.displayIssueDetails(45);


✅ Output:

-----Issued Details-----
Member     Book
45         Naruto

8. displayReturnDetails(int MemberId) 🔄

👉 Shows returned book records.

l.displayReturnDetails(45);


✅ Output:

-----Return Details-----
Member     Book
45         Naruto

9. displayMemberDetails(int MemberId) 📝

👉 Shows all registered members.

l.displayMemberDetails(45);


✅ Output:

-----Member Details-----
ID     Member
45     Adarsh

🎮 Demo Flow Example
----------Welcome to Smart Library----------

👉 Enter your choice: 1
Enter your Name: Adarsh
🎉 Congratulation! Adarsh become a Smart Library Member with ID: 45.

👉 Enter your choice: 2
Enter your ID: 45
Enter Book Name: The Alchemist
Congratulation! Your offer for Book The Alchemist accepted.

👨‍💻 Author

💡 Developed by Adarsh Jayprakash Mishra
📌 B.Sc. Computer Science Student
