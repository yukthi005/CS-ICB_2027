import java.io.*;
import java.util.*;

public class PasswordManager {
    static final String FILE_PATH = "data/credentials.txt";
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        new File("data").mkdir(); // create folder if not exists
        int choice;
        do {
            System.out.println("\n===== Password Manager =====");
            System.out.println("1. Add Credential");
            System.out.println("2. View All Credentials");
            System.out.println("3. Search Credential");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addCredential();
                case 2 -> viewAll();
                case 3 -> searchCredential();
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }

    static void addCredential() throws IOException {
        System.out.print("Enter website: ");
        String website = sc.nextLine();
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(website + "," + username + "," + password);
            writer.newLine();
        }

        System.out.println("Credential saved!");
    }

    static void viewAll() throws IOException {
        File file = new File(FILE_PATH);
        if (!file.exists() || file.length() == 0) {
            System.out.println("No credentials saved.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            System.out.println("\nSaved Credentials:");
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                System.out.println("Website: " + parts[0] + ", Username: " + parts[1] + ", Password: " + parts[2]);
            }
        }
    }

    static void searchCredential() throws IOException {
        System.out.print("Enter website to search: ");
        String target = sc.nextLine();
        boolean found = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equalsIgnoreCase(target)) {
                    System.out.println("Website: " + parts[0] + ", Username: " + parts[1] + ", Password: " + parts[2]);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No credentials found for " + target);
        }
    }
}
