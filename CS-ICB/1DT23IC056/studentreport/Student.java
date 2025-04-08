import java.io.Serializable;

public class Student implements Serializable {
    private int rollNumber;
    private String name;
    private int mathMarks;
    private int physicsMarks;
    private int chemistryMarks;

    public Student(int rollNumber, String name, int mathMarks, int physicsMarks, int chemistryMarks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.mathMarks = mathMarks;
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public int getPhysicsMarks() {
        return physicsMarks;
    }

    public int getChemistryMarks() {
        return chemistryMarks;
    }

    public double getAverage() {
        return (mathMarks + physicsMarks + chemistryMarks) / 3.0;
    }

    public String getGrade() {
        double avg = getAverage();
        if (avg >= 90) return "A+";
        else if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 50) return "C";
        else return "F";
    }

    @Override
    public String toString() {
        return "Roll No: " + rollNumber +
               ", Name: " + name +
               ", Math: " + mathMarks +
               ", Physics: " + physicsMarks +
               ", Chemistry: " + chemistryMarks +
               ", Avg: " + getAverage() +
               ", Grade: " + getGrade();
    }
}
