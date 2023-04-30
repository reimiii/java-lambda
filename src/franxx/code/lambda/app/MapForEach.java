package franxx.code.lambda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEach {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name", "002");
        map.put("model", "FranXX");
        map.put("power", "100000");

        // avg
        for (var v : map.entrySet()) {
            System.out.println(v.getKey() + " : " + v.getValue());
        }

        // anonclass
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                System.out.println(s + " : " + s2);
            }
        });

        // lambda
        map.forEach((s, s2) -> System.out.println(s + " : " + s2));
    }
}
