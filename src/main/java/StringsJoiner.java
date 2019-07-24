import java.util.List;

public class StringsJoiner {
    public String join(String delimiter, List<String> strings) {

        String result = "";

        if (strings.size() > 0 && !strings.isEmpty() && !strings.contains(null)) {

            for (String string : strings) {
                result += string;
                result += delimiter;
            }

            return result.substring(0, result.length() - 1);
        }

        return result;
    }
}

