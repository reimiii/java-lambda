package franxx.code.lambda.app;

import franxx.code.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        SimpleAction action = new SimpleAction() {
            @Override
            public String action() {
                return "Hilmi AM";
            }
        };

        System.out.println(action.action());

        SimpleAction simpleAction = () -> {
          return "002";
        };

        System.out.println(simpleAction.action());
    }
}
