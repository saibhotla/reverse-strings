import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

final class Library {

    public static List<String> reverseString(final List<String> stringsToReverse) {
        if(stringsToReverse == null){
            return Collections.emptyList();
        }

        return stringsToReverse
                .stream()
                .filter(Objects::nonNull)
                .map(stringToReverse ->  new StringBuilder(stringToReverse).reverse().toString())
                .collect(Collectors.toList());
    }
}