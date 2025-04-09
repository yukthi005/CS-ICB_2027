import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questions, options, and answers
        String[] questions = {
            "What is the capital of France?",
            "Who wrote 'Romeo and Juliet'?",
            "Which planet is known as the Red Planet?"
        };

        String[][] options = {
            {"A. Paris", "B. London", "C. Berlin", "D. Rome"},
            {"A. William Shakespeare", "B. Charles Dickens", "C. J.K. Rowling", "D. Mark Twain"},
            {"A. Earth", "B. Mars", "C. Venus", "D. Jupiter"}
        };

        char[] answers = {'A', 'A', 'B'};

        int score = 0;

        System.out.println("🧠 Welcome to the Quiz!\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q" + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(scanner.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + answers[i] + "\n");
            }
        }

        System.out.println("🎉 Quiz Over! You scored " + score + " out of " + questions.length);
        scanner.close();
    }
}
