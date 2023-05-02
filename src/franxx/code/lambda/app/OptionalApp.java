package franxx.code.lambda.app;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("zerotwo");

        String name = null;
        sayHello(name);
    }

    public static void sayHello(String name) {
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(
//                        s -> System.out.println("HELLO " + s),
//                        () -> System.out.println("Empty")
//                );

        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN");
        System.out.println("HELLO " + upperName);

//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> optionalUpperName = optionalName.map(s -> s.toUpperCase());
//
//        optionalUpperName.ifPresent(s -> System.out.println("HELLO " + s));

        // if
//        if (name != null) {
//            String upperName = name.toUpperCase();
//            System.out.println("HELLO " + upperName);
//        }
    }
}
