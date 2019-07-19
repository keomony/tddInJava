import java.util.List;

public class StringsJoiner {
    public String join(List<String> strings) {
        if(strings.size() > 0) {
            String result ="";
            for (String string : strings) {
                result += string;
            }
            return result;
        } else {

            return "";
        }


    }
}

