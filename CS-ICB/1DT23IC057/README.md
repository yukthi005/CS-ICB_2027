Password Manager (Java Console App)

A simple file-based Password Manager built using Java. This console application helps you store and retrieve your website credentials securely on your local system.

Features:
✅ Add new website credentials (Website, Username, Password)
📄 View all saved credentials
🔍 Search for a credential by website name
💾 File-based storage using .txt (can be enhanced with encryption)
🧑‍💻 Easy-to-use console interface
Project Structure:
PasswordManager/ ├── src/ │ └── PasswordManager.java # Main Java code ├── data/ │ └── credentials.txt # File to store credentials (auto-created) ├── README.md # Project description └── .gitignore # Ignore compiled files and data

Sample output on terminal:
===== Password Manager =====

Add Credential
View All Credentials
Search Credential
Exit Enter choice: 1 Enter website: gmail.com Enter username: example@gmail.com Enter password: mySecret123 Credential saved!

Future Improvements:
🔐 Encrypt stored passwords using AES or Base64 
🖼️ Add GUI using Java Swing 
☁️ Optional: Sync credentials with cloud (Google Drive, Firebase, etc.) 
🧪 Add unit tests using JUnit

Author:
GitHub: dhatrishv

Flow Diagram of working:
1.Start Program Shows a menu: Add, View, Search, Exit. 
2.User Input User selects an option (1-4). 
3.Actions Based on Choice Add → Takes website, username, password → Saves to file. View → Reads and displays all saved credentials. Search → Finds and shows credentials for a given website. Exit → Ends the program. 
4.Loop After each action, returns to the main menu until the user exits.
