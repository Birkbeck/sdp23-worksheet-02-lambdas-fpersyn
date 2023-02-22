import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface TwoStringPredicate {
    public boolean test(String s1, String s2);
}

@FunctionalInterface
interface TwoElementPredicate<E1, E2> {
    boolean test(E1 e1, E2 e2);
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

    public static <T> T betterElement(T a, T b, TwoElementPredicate<T, T> pred) {
        // Use generics to replace betterString with betterEntry
        // and to replace TwoStringPredicate with TwoElementPredicate.
        if (pred.test(a, b)) return a;
        return b;
    }

    public static <T> List<T> allMatches(List<T> ls, Predicate<T> pred) {
        return ls.stream().filter(pred).toList();
    }

    public static List<String> transformedList(List<String> ls, Function<String, String> func) {
        return ls.stream().map(func).toList();
    }
}
