Project Overview
The currency converter is built using Java Swing for the graphical user interface. It supports conversions between USD, EUR, GBP, JPY, and CAD. The application is designed to be intuitive and easy to use, making it accessible to users of all skill levels.

Features
User-Friendly Interface: Easy-to-use GUI with dropdown menus for selecting currencies.

Real-Time Conversion: Instantly converts currencies as you select them.

Error Handling: Displays error messages for invalid input.

Predefined Exchange Rates: Uses fixed exchange rates for simplicity.

Cross-Platform Compatibility: Runs on any platform with a Java Runtime Environment (JRE).

Requirements
Java Development Kit (JDK): Ensure you have a JDK installed on your system. Recommended versions include OpenJDK or Oracle JDK.

Java Runtime Environment (JRE): Required to run the application.

Visual Studio Code (VS Code): Recommended for development, but any Java IDE can be used.

Git: For version control and collaboration.

Installation
Clone this repository using Git:

bash
git clone https://github.com/yourusername/yourrepositoryname.git
Open the project in your preferred Java IDE (e.g., VS Code, IntelliJ IDEA).

Ensure you have the necessary Java extensions installed in your IDE.

Usage
Run the CurrencyConverter.java file.

Enter an amount in the "Amount" field.

Select the "From" and "To" currencies using the dropdown menus.

Click the "Convert" button to perform the conversion.

The result will be displayed in the "Result" field.

Troubleshooting
Invalid Input: Ensure you enter a valid numeric amount.

GUI Issues: Check that your Java environment is properly configured.

Conversion Errors: Verify that the exchange rates are correctly defined.

Future Enhancements
Dynamic Exchange Rates: Fetch exchange rates from APIs for real-time accuracy.

Additional Currencies: Support more currencies.

Conversion History: Store and display previous conversions.

User Profiles: Allow users to save favorite currency pairs.

Contributing
Contributions are welcome! If you have ideas for improvements or want to add new features, please submit a pull request. Here are some guidelines:

Code Style: Follow standard Java coding conventions.

Documentation: Update this README file with any changes.

Testing: Include unit tests for new functionality.

License
This project is licensed under the MIT License. See LICENSE for details.

Technical Details
Programming Language: Java.

GUI Framework: Java Swing.

Exchange Rates: Predefined in the code for simplicity.

Project Structure
The project consists of a single Java file (CurrencyConverter.java) that contains all the necessary code for the GUI and conversion logic.

Code Explanation
The code is structured into several sections:

GUI Components: Creation of panels, fields, and buttons.

Event Handling: Listeners for button clicks and input validation.

Conversion Logic: Functions to perform currency conversions.

Testing
Testing is crucial to ensure the application works correctly. Here are some test cases:

Valid Input: Test with different numeric amounts.

Invalid Input: Test with non-numeric input.

Currency Selection: Test all possible currency combinations.

FAQ
Q: How do I run the application?
A: Run the CurrencyConverter.java file in your Java IDE.

Q: Can I add more currencies?
A: Yes, you can modify the code to include additional currencies.

Q: How do I update exchange rates?
A: Modify the EXCHANGE_RATES array in the code.
