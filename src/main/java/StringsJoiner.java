import java.util.List;

public class StringsJoiner {
    public String join(List<String> strings) {
        if(strings.size() > 0){
            return strings.get(0);
        } else {
            return "";
        }
    }
}
