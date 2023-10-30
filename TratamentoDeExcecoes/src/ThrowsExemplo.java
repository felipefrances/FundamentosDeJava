import java.util.Scanner;

public class ThrowsExemplo {
        public static void upperLetters(String word) throws NullPointerException {
            String newWord = null;
            newWord = word.toUpperCase();
            System.out.println("Old word: " + word);
            System.out.println("New word: " + newWord);
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String phrase = null;
            System.out.print("Write something: ");
            phrase = in.nextLine();
            try {
                upperLetters(phrase);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
                System.out.println("An error occurs.");
            } finally {
                in.close();
            }
        }
    }
