import java.util.*;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.setStudentList(FileHandler.loadFromFile());

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Report Card System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search by Roll Number");
            System.out.println("4. Save & Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine();  // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Math Marks: ");
                    int math = sc.nextInt();
                    System.out.print("Enter Physics Marks: ");
                    int physics = sc.nextInt();
                    System.out.print("Enter Chemistry Marks: ");
                    int chemistry = sc.nextInt();

                    Student s = new Student(roll, name, math, physics, chemistry);
                    manager.addStudent(s);
                    System.out.println("Student added.");
                    break;

                case 2:
                    manager.displayAll();
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search: ");
                    int r = sc.nextInt();
                    Student found = manager.searchByRoll(r);
                    if (found != null)
                        System.out.println(found);
                    else
                        System.out.println("Student not found.");
                    break;

                case 4:
                    FileHandler.saveToFile(manager.getStudentList());
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}
