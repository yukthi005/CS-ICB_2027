import java.io.*;
import java.util.ArrayList;

public class FileHandler {
    private static final String FILE_NAME = "students.ser";

    public static void saveToFile(ArrayList<Student> students) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            out.writeObject(students);
            System.out.println("Data saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving to file: " + e);
        }
    }

    public static ArrayList<Student> loadFromFile() {
        ArrayList<Student> list = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            list = (ArrayList<Student>) in.readObject();
            System.out.println("Data loaded from file.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Starting with empty list.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading from file: " + e);
        }
        return list;
    }
}
