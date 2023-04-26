package franxx.code.lambda.app;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.isBlank();

        System.out.println(predicate.test(""));
        System.out.println(predicate.test("Mee"));
    }
}
