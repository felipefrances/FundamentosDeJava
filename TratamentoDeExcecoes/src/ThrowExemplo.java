import java.util.Scanner;
public class ThrowExemplo {
        public static String upperLetters(String word) throws Exception {
            String newWord = null;
            try {
                newWord = word.toUpperCase();
            } catch (NullPointerException e) {
                throw new Exception(e);
            }
            return newWord;
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String phrase = null;
            String newWord = null;
            System.out.print("Write something: ");
            phrase = in.nextLine();
            try {
                newWord = upperLetters(phrase);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                in.close();
            }
            System.out.println("Phrase in uppercase: " + newWord);
        }
    }