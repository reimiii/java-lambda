package franxx.code.lambda.app;

import franxx.code.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
//        Predicate<String> predicate = s -> StringUtil.isLowerCase(s);
        Predicate<String> predicate = StringUtil::isLowerCase;

        System.out.println(predicate.test("franXX"));
        System.out.println(predicate.test("zerotwo"));

        // Method Reference di Parameter

//        Function<String, String> functionUpper = s -> s.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase;

        System.out.println(functionUpper.apply("Make Sense"));
    }

    public void run() {
        // punya orang lain
//        MethodReferenceApp app = new MethodReferenceApp();
//        Predicate<String> predicate = app::isLowerCase;

        Predicate<String> predicate = this::isLowerCase;

        System.out.println(predicate.test("franXX"));
        System.out.println(predicate.test("zerotwo"));
    }

    public void run2() {
        // punya orang lain
        MethodReferenceApp app = new MethodReferenceApp();
        Predicate<String> predicate = app::isLowerCase;


        System.out.println(predicate.test("franXX"));
        System.out.println(predicate.test("zerotwo"));
    }

    public boolean isLowerCase(String s) {
        for (var c : s.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
