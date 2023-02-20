import java.util.Arrays;
import java.util.Comparator;

public class Outline {

  public static String[] words() {
      return new String[] {
          "face",
          "wolf",
          "compass",
          "elephant",
          "angular",
          "spaceman",
          "santa",
          "camera"
      };
  }

  public static void question_1a() {
    // sort words by length (ascending)
    String[] words = words();
    Arrays.sort(words, (String a, String b) -> Integer.compare(a.length(), b.length()));
    System.out.println("Q1A = " + Arrays.asList(words));
  }

  public static void question_1b() {
    // sort words by length (descending)
    String[] words = words();
    Arrays.sort(words, (String a, String b) -> Integer.compare(b.length(), a.length()));
    System.out.println("Q1B = " + Arrays.asList(words));
  }

  public static void question_1c() {
    // sort words by first character
    String[] words = words();
    // TODO
  }

  public static void question_1d() {
    // sort words by those that start with "e", then remaining letters.
    String[] words = words();
    // TODO
  }

  public static void main(String... args) {
    question_1a();
    question_1b();
  }
}
