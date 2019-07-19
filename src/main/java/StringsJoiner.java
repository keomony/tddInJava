import java.util.List;

public class StringsJoiner {
    public String join(String delimiter, List<String> strings) {
        if(strings.size() > 0) {
            String result ="";
            for (String string : strings) {
                result += string;
                result += delimiter;
            }
            return result.substring(0, result.length() -1);
        } else {

            return "";
        }
    }
}

