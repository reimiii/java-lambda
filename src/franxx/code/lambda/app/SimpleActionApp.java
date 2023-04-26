package franxx.code.lambda.app;

import franxx.code.lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
//        SimpleAction action = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Hilmi AM";
//            }
//        };
//
//        System.out.println(action.action("FranXX"));
//
//        SimpleAction simpleAction = (String name) -> {
//          return "002";
//        };
//
//        System.out.println(simpleAction.action("FranXX"));

        SimpleAction simpleAction = (String value) -> {
            return "Hello " + value;
        };

        SimpleAction action = (v) -> {
            return "FranXX " + v;
        };

        SimpleAction action1 = (name) -> {
            return "FranXX " + name;
        };

        SimpleAction simpleAction1 = (String name) -> "Hello " + name;

        SimpleAction simpleAction2 = (name) -> "Hello " + name;

        SimpleAction simpleAction3 = name -> "Hello " + name;


    }
}
