import java.util.ArrayList;
import java.util.Scanner;

// Expense model
class Expense {
    String category;
    double amount;
    String date;

    Expense(String category, double amount, String date) {
        this.category = category;
        this.amount = amount;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Date: " + date + " | Category: " + category + " | Amount: ₹" + amount;
    }
}

// Main manager class
public class ExpenseManager {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Expense> expenses = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("------ Welcome to Expense Manager ------");

        boolean running = true;
        while (running) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addExpense();
                case 2 -> viewExpenses();
                case 3 -> showTotal();
                case 4 -> {
                    System.out.println("Exiting... Goodbye!");
                    running = false;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Add Expense");
        System.out.println("2. View All Expenses");
        System.out.println("3. Show Total Expense");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void addExpense() {
        System.out.print("Enter category (e.g. Food, Travel, Bills): ");
        String category = scanner.nextLine();

        System.out.print("Enter amount: ₹");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.print("Enter date (DD-MM-YYYY): ");
        String date = scanner.nextLine();

        expenses.add(new Expense(category, amount, date));
        System.out.println("Expense added successfully!");
    }

    private static void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses to show.");
        } else {
            System.out.println("\n------ Expense List ------");
            for (Expense e : expenses) {
                System.out.println(e);
            }
        }
    }

    private static void showTotal() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.amount;
        }
        System.out.println("Total Expense: ₹" + total);
    }
}
