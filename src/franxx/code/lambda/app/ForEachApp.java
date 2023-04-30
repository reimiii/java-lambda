package franxx.code.lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> list = List.of("FranXX", "002", "Zero", "Two");

        // foreach
        for (var v : list) {
            System.out.println(v);
        }

        System.out.println("=========== foreach");

        // forEach AnonClass
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println("=========== anonclass");

        // lambda
        list.forEach(s -> System.out.println(s));

        // lambda method ref
        list.forEach(System.out::println);

        System.out.println("=========== lambda");
    }
}
