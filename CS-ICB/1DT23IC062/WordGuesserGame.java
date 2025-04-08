import java.util.*;

public class WordGuesserGame {
    public static void main(String[] args) {
        String[] wordList = {"apple", "banana", "grape", "orange", "mango"};
        String word = wordList[new Random().nextInt(wordList.length)];

        try (Scanner scanner = new Scanner(System.in)) {

        char[] guessed = new char[word.length()];
        Arrays.fill(guessed, '_');

        int attemptsLeft = 7;
        Set<Character> guessedLetters = new HashSet<>();

        System.out.println("🎮 Welcome to Word Guesser Game!");
        System.out.println("Guess the word by typing one letter at a time.");

        while (attemptsLeft > 0) {
            System.out.print("\nWord: ");
            for (char c : guessed) {
                System.out.print(c + " ");
            }

            System.out.print("\nEnter a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if (guessedLetters.contains(guess)) {
                System.out.println("You've already guessed that letter.");
                continue;
            }

            guessedLetters.add(guess);

            if (word.indexOf(guess) >= 0) {
                System.out.println("✅ Good guess!");
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess) {
                        guessed[i] = guess;
                    }
                }
            } else {
                attemptsLeft--;
                System.out.println("❌ Wrong! Attempts left: " + attemptsLeft);
            }

            if (String.valueOf(guessed).equals(word)) {
                System.out.println("\n🎉 Congrats! You guessed the word: " + word);
                return;
            }
        }

        }
    }
}
