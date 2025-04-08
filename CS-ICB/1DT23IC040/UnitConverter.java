import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Unit Converter ---");
            System.out.println("1. Meters to Feet");
            System.out.println("2. Feet to Meters");
            System.out.println("3. Celsius to Fahrenheit");
            System.out.println("4. Fahrenheit to Celsius");
            System.out.println("5. Kilograms to Pounds");
            System.out.println("6. Pounds to Kilograms");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            double input, result;

            switch (choice) {
                case 1:
                    System.out.print("Enter meters: ");
                    input = scanner.nextDouble();
                    result = input * 3.28084;
                    System.out.println("Feet: " + result);
                    break;
                case 2:
                    System.out.print("Enter feet: ");
                    input = scanner.nextDouble();
                    result = input / 3.28084;
                    System.out.println("Meters: " + result);
                    break;
                case 3:
                    System.out.print("Enter Celsius: ");
                    input = scanner.nextDouble();
                    result = (input * 9/5) + 32;
                    System.out.println("Fahrenheit: " + result);
                    break;
                case 4:
                    System.out.print("Enter Fahrenheit: ");
                    input = scanner.nextDouble();
                    result = (input - 32) * 5/9;
                    System.out.println("Celsius: " + result);
                    break;
                case 5:
                    System.out.print("Enter Kilograms: ");
                    input = scanner.nextDouble();
                    result = input * 2.20462;
                    System.out.println("Pounds: " + result);
                    break;
                case 6:
                    System.out.print("Enter Pounds: ");
                    input = scanner.nextDouble();
                    result = input / 2.20462;
                    System.out.println("Kilograms: " + result);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
