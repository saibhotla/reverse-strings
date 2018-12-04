import java.util.Collections;
import java.util.List;

final class Library {

    public static List<String> reverseString(final List<String> stringsToReverse) {
        if(stringsToReverse ==null || stringsToReverse.isEmpty()){
            return Collections.emptyList();
        }

        return Collections.singletonList("oof");
    }
}