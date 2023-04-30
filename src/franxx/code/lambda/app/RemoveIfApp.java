package franxx.code.lambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("FranXX", "Code", "002"));

//        for (var v : list) {
//            if (v.length() > 5) {
//                list.remove(v);
//            }
//        }

//        // anonclass
//        list.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length() > 5;
//            }
//        });
//
//        // lambda
        list.removeIf(name -> name.length() > 0);

        System.out.println(list);


    }
}
