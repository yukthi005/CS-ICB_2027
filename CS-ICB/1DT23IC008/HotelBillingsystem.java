
import java.util.*;

class MenuItem {
    String name;
    double price;

    MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class OrderItem {
    MenuItem item;
    int quantity;

    OrderItem(MenuItem item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    double getTotal() {
        return item.price * quantity;
    }
}

public class HotelBillingsystem {
    static List<MenuItem> menu = new ArrayList<>();
    static List<OrderItem> order = new ArrayList<>();

    public static void main(String[] args) {
        initMenu();

        Scanner scanner = new Scanner(System.in);
        System.out.println("==== Welcome to Mane oota ====");
        displayMenu();

        while (true) {
            System.out.print("Enter item number to order (0 to finish): ");
            int itemNo = scanner.nextInt();

            if (itemNo == 0) break;

            if (itemNo < 1 || itemNo > menu.size()) {
                System.out.println("Invalid item number. Try again.");
                continue;
            }

            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            MenuItem selectedItem = menu.get(itemNo - 1);
            order.add(new OrderItem(selectedItem, quantity));
            System.out.println(quantity + " x " + selectedItem.name + " added to order.");
        }

        printBill();
        scanner.close();
    }

    static void initMenu() {
        menu.add(new MenuItem("Idli (2 pcs)", 20));
        menu.add(new MenuItem("Vada (1 pc)", 15));
        menu.add(new MenuItem("Masala Dosa", 40));
        menu.add(new MenuItem("Plain Dosa", 35));
        menu.add(new MenuItem("Upma", 30));
        menu.add(new MenuItem("Pongal", 35));
        menu.add(new MenuItem("Filter Coffee", 15));
        menu.add(new MenuItem("Tea", 10));
    }

    static void displayMenu() {
        System.out.println("\n----- MENU -----");
        for (int i = 0; i < menu.size(); i++) {
            MenuItem item = menu.get(i);
            System.out.printf("%d. %-20s Rs. %.2f\n", i + 1, item.name, item.price);
        }
        System.out.println("----------------\n");
    }

    static void printBill() {
        double total = 0;
        System.out.println("\n========== BILL ==========");
        System.out.printf("%-20s %-10s %-10s\n", "Item", "Qty", "Amount");

        for (OrderItem orderItem : order) {
            double itemTotal = orderItem.getTotal();
            total += itemTotal;
            System.out.printf("%-20s %-10d Rs. %-8.2f\n",
                    orderItem.item.name, orderItem.quantity, itemTotal);
        }

        System.out.println("----------------------------");
        System.out.printf("Total Amount:         Rs. %.2f\n", total);
        System.out.println("============================");
        System.out.println("Thank you! Visit again.");
    }
}
