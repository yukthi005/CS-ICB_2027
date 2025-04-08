
Simple Number Guessing Game

Description:
------------
This is a simple, text-based Number Guessing Game implemented in Java.
The program generates a random integer within a predefined range (1 to 100 by default).
The user is then prompted to guess the number. After each guess, the program provides feedback, indicating whether the guess was too high or too low.
The game continues until the user guesses the correct number. Finally, it displays the total number of attempts taken.

Features:
---------
*   Generates a random number between 1 and 100.
*   Takes integer input from the user via the console.
*   Provides feedback ("Too high!" or "Too low!") for incorrect guesses.
*   Validates if the guess is within the specified range.
*   Handles basic non-integer input gracefully.
*   Counts the number of tries the user takes.
*   Congratulates the user upon guessing the correct number.

Requirements:
-------------
*   Java Development Kit (JDK) installed (Version 8 or later recommended).

How to Compile and Run:
-----------------------
1.  **Save:** Save the Java code into a file named `NumberGuessingGame.java`.
2.  **Open Terminal:** Open a command prompt or terminal window.
3.  **Navigate:** Go to the directory where you saved the `NumberGuessingGame.java` file using the `cd` command (e.g., `cd C:\path\to\your\code`).
4.  **Compile:** Compile the code using the Java compiler:
    ```bash
    javac NumberGuessingGame.java
    ```
    This will create a `NumberGuessingGame.class` file in the same directory.
5.  **Run:** Execute the compiled code using the Java Virtual Machine:
    ```bash
    java NumberGuessingGame
    ```

How to Play:
------------
1.  Run the program following the steps above.
2.  You will see a welcome message asking you to guess a number between 1 and 100.
3.  Enter your integer guess and press Enter.
4.  The program will tell you if your guess is "Too high!" or "Too low!".
5.  Continue guessing based on the feedback.
6.  If you enter something that is not a valid integer, it will ask you to enter an integer.
7.  Once you guess the correct number, the game will congratulate you and show how many tries it took.
8.  The game will then end.


