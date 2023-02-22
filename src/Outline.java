import java.util.Arrays;

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
    Arrays.sort(words, (String a, String b) -> Integer.compare(a.charAt(0), b.charAt(0)));
    System.out.println("Q1C = " + Arrays.asList(words));
  }

  public static void question_1d() {
    // sort words by those that contain an "e", then remaining words.
    String[] words = words();
    Arrays.sort(words, (String a, String b) -> {
      if (a.contains("e") && !b.contains("e")) return -1;
      if (b.contains("e") && !a.contains("e")) return 1;
      return 0;
    });
    System.out.println("Q1D = " + Arrays.asList(words));
  }

  public static void question2() {
    // using answer Q1D, extract number calc to static method StringUtils.eChecker()
    String[] words = words();
    Arrays.sort(words, StringUtils::eChecker);
    System.out.println("Q2 = " + Arrays.asList(words));
  }

  public static void main(String... args) {
    question_1a();
    question_1b();
    question_1c();
    question_1d();
    question2();
  }
}
