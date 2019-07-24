import java.util.List;

public class StringsJoiner {

    public String join(String delimiter, List<String> strings) {
        String result = "";

        if(stringsAreValid(strings)) {

            for (String string : strings) {
                result += string + delimiter;
            }

            return result.substring(0, result.length() - 1);
        }

        return result;
    }


    private Boolean stringsAreValid(List<String> strings){
        return (strings.size() > 0 && !strings.isEmpty() && !strings.contains(null));
    }
}

