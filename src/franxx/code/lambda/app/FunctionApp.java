package franxx.code.lambda.app;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        Function<String, Integer> integerFunction = s -> s.length();

        System.out.println(integerFunction.apply("Hilmi"));
    }
}
