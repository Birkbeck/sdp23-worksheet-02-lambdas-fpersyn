@FunctionalInterface
interface TwoStringPredicate {
    public boolean test(String s1, String s2);
}

public class StringUtils {
    public static int eChecker(String a, String b) {
        // Compare if 2 strings contain the letter "e".
        if (a.contains("e") && !b.contains("e")) return -1;
        if (b.contains("e") && !a.contains("e")) return 1;
        return 0;
    }

    public static String betterString(String a, String b, TwoStringPredicate pred) {
        // Create a static method StringUtils.betterString which takes two strings
        // and a lambda with the condition, return the first when true, else the other.
        if (pred.test(a, b)) return a;
        return b;
    }
}
