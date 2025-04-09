import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    double amount;
    String category;
    String note;

    Expense(double amount, String category, String note) {
        this.amount = amount;
        this.category = category;
        this.note = note;
    }

    public String toString() {
        return "₹" + amount + " | " + category + " | " + note;
    }
}

public class ExpenseTracker {
    public static void main(String[] args) {
        ArrayList<Expense> expenses = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n📊 Expense Tracker Menu");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Total Spent");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount: ₹");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter category (Food, Travel, etc): ");
                    String category = sc.nextLine();
                    System.out.print("Enter note: ");
                    String note = sc.nextLine();
                    expenses.add(new Expense(amount, category, note));
                    System.out.println("✅ Expense added!");
                    break;

                case 2:
                    System.out.println("\n📄 All Expenses:");
                    for (Expense e : expenses) {
                        System.out.println(e);
                    }
                    break;

                case 3:
                    double total = 0;
                    for (Expense e : expenses) total += e.amount;
                    System.out.println("💰 Total Spent: ₹" + total);
                    break;

                case 4:
                    System.out.println("👋 Exiting...");
                    break;

                default:
                    System.out.println("❌ Invalid choice!");
            }

        } while (choice != 4);
        sc.close();
    }
}
