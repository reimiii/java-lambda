package franxx.code.lambda.app;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "FranXX";

        System.out.println(supplier.get());
    }
}
