public class StringUtils {
    public static int eChecker(String a, String b) {
        // Compare if 2 strings contain the letter "e".
        if (a.contains("e") && !b.contains("e")) return -1;
        if (b.contains("e") && !a.contains("e")) return 1;
        return 0;
    }
}
