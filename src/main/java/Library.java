import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

final class Library {

    public static void main(String[] args) {


    }

    private static long multiply(final int startInclusive, final int endInclusive) {
        return IntStream.rangeClosed(startInclusive, endInclusive)
                .reduce((accumulator, currentNumber) -> accumulator * currentNumber)
                .orElse(0);
    }

    private static long sum(final int... numbersToSum) {

        return Arrays.stream(numbersToSum)
                .reduce((left, right) -> left + right)
                .orElse(0);
    }

    public static List<String> reverseString(final List<String> stringsToReverse) {
        if (stringsToReverse == null) {
            return Collections.emptyList();
        }

        return stringsToReverse
                .stream()
                .filter(Objects::nonNull)
                .map(toReversedString())
                .collect(Collectors.toList());
    }

    private static Function<String, String> toReversedString() {
        return stringToReverse -> new StringBuilder(stringToReverse).reverse().toString();
    }

    public static List<String> evenOrOdd(final List<Integer> integersToConvert) {

        if (null == integersToConvert || integersToConvert.isEmpty()) {
            return Collections.emptyList();
        }

        return integersToConvert
                .stream()
                .filter(Objects::nonNull)
                .map(integerToStringConvert())
                .collect(Collectors.toList());
    }

    private static Function<Integer, String> integerToStringConvert() {
        return integer -> integer % 2 == 0 ? "even" : "odd";
    }

    public static List<String> pluck(final List<Map<String, String>> valuesToBePlucked) {
        if (valuesToBePlucked == null) {
            return Collections.emptyList();
        }

        return valuesToBePlucked
                .stream()
                .filter(Objects::nonNull)
                .map(extractValueFromMap -> extractValueFromMap.get("foo"))
                .filter(Objects::nonNull)
                .collect(Collectors.toList());

    }

    public static String join(String delimiter, final String... stringsToBeJoined) {

        final String theDelimiter = Optional
                .ofNullable(delimiter)
                .orElse(" ");

        final String[] theStrings = Optional
                .ofNullable(stringsToBeJoined)
                .orElse(new String[0]);

        return Arrays.stream(theStrings)
                .filter(Objects::nonNull)
                .map(input -> " ".equals(input) ? "`" : input)
                .reduce((accumulator, currentValue) -> accumulator + theDelimiter +  currentValue)
                .orElse("");


    }
}