# 📘 Student Report Card Management System – Java Console App
    A simple console-based Java application to manage student records and generate basic report cards. It supports adding students, viewing all records, searching by roll number, and saving data persistently using a file.

# 📁 Files Included
    Main.java – Main driver file with menu and logic
    
    Student.java – Class representing a student
    
    StudentManager.java – Manages the student list and operations
    
    FileHandler.java – Handles file input/output
    
    students.txt – File used to store student data (created automatically)

# ✅ Features
    ➕ Add a student with roll number, name, and marks
    
    📄 Display all student records
    
    🔍 Search student by roll number
    
    💾 Save data to file and load it automatically at startup
    
    🧾 Stores data in students.txt using serialization

# 🛠️ How to Compile and Run
    Open your terminal (e.g., Git Bash or Command Prompt)

    Navigate to the folder containing your .java files


# 💡 How It Works
    When the program starts, it loads student data from students.txt (if it exists).
    You can interact with the menu to add students, view all, or search by roll number.
    Upon exiting, all student data is saved into the file so that it persists across runs.
