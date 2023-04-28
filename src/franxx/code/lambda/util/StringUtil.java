package franxx.code.lambda.util;

public class StringUtil {
    public static boolean isLowerCase(String s) {
        for (var c : s.toCharArray()) {
            if (!Character.isLowerCase(c)) {
                return false;
            }
        }
        return true;
    }
}
