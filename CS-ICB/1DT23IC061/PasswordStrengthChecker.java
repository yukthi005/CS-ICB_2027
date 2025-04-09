import java.util.Scanner;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===========================================");
        System.out.println("        Welcome to Password Checker        ");
        System.out.println("===========================================\n");

        String choice;

        do {
            System.out.print("Enter a password to check its strength: ");
            String password = scanner.nextLine();

            String strength = getPasswordStrength(password);
            System.out.println(">> Password strength: " + strength);

            if (strength.equals("Very Weak") || strength.equals("Weak")) {
                suggestStrongPassword();
            }

            System.out.print("\nDo you want to check another password? (yes/no): ");
            choice = scanner.nextLine().trim().toLowerCase();
            System.out.println();

        } while (choice.equals("yes") || choice.equals("y"));

        System.out.println("Thank you for using Password Checker. Stay safe!");
        scanner.close();
    }

    public static String getPasswordStrength(String password) {
        int length = password.length();
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }

        int score = 0;
        if (length >= 8) score++;
        if (hasUpper) score++;
        if (hasLower) score++;
        if (hasDigit) score++;
        if (hasSpecial) score++;

        switch (score) {
            case 5: return "Very Strong";
            case 4: return "Strong";
            case 3: return "Moderate";
            case 2: return "Weak";
            default: return "Very Weak";
        }
    }

    public static void suggestStrongPassword() {
        System.out.println(">> Suggestion: Try using at least 8 characters with a mix of:");
        System.out.println("   - Uppercase letters (A-Z)");
        System.out.println("   - Lowercase letters (a-z)");
        System.out.println("   - Digits (0-9)");
        System.out.println("   - Special symbols (!, @, #, etc.)");
        System.out.println(">> Example: Secure@123");
    }
}
