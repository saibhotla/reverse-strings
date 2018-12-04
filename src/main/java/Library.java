import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

final class Library {

    public static List<String> reverseString(final List<String> stringsToReverse) {
        if(stringsToReverse == null){
            return Collections.emptyList();
        }

        return stringsToReverse
                .stream()
                .filter(Objects::nonNull)
                .map(toReversedString())
                .collect(Collectors.toList());
    }

    private static Function<String, String> toReversedString() {
        return stringToReverse ->  new StringBuilder(stringToReverse).reverse().toString();
    }

    public static List<String> evenOrOdd(final List<Integer> integersToConvert) {

        if(null == integersToConvert || integersToConvert.isEmpty()){
            return Collections.emptyList();
        }

        return integersToConvert
                .stream()
                .filter(Objects::nonNull)
                .map(integerToStringConvert())
                .collect(Collectors.toList());
    }

    private static Function<Integer, String> integerToStringConvert() {
        return integer -> integer%2==0 ? "even":"odd";
    }
}