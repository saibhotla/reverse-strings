import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.contains;
final class EvenOrOddTest {

    @Test
    void evenOrOddReturnsEmptyWhenGivenNull(){

        //Setup


        //Exercise
        final List<String> actual = Library.evenOrOdd(null);

        assertThat(actual.isEmpty(), is(true));

    }

    @Test
    void evenOrOddReturnsEmptyWhenGivenEmptyList(){

        //Setup


        //Exercise
        final List<String> actual = Library.evenOrOdd(Collections.emptyList());

        assertThat(actual.isEmpty(), is(true));

    }

    @Test
    void evenOrOddReturnsOneStringWhenGivenOneInteger(){

        //Setup


        //Exercise
        final List<String> actual = Library.evenOrOdd(Collections.singletonList(1));

        MatcherAssert.assertThat(actual, contains("odd"));

    }

    @Test
    void evenOrOddReturnsOneStringWhenGivenOneDifferentInteger(){

        //Setup


        //Exercise
        final List<String> actual = Library.evenOrOdd(Collections.singletonList(2));

        MatcherAssert.assertThat(actual, contains("even"));

    }

    @Test
    void evenOrOddReturnsEmptyListWhenGivenOneNull(){

        //Setup


        //Exercise
        final List<String> actual = Library.evenOrOdd(Collections.singletonList(null));

        MatcherAssert.assertThat(actual.isEmpty(), is(true));

    }
    @Test
    void evenOrOddReturnsListWhenGivenOneNull(){

        //Setup


        //Exercise
        final List<String> actual = Library.evenOrOdd(Arrays.asList(null, 2));

        MatcherAssert.assertThat(actual, contains("even"));

    }

    @Test
    void evenOrOddReturnsListWhenGivenManyIntegers(){

        //Setup


        //Exercise
        final List<String> actual = Library.evenOrOdd(Arrays.asList(null, 1, 2));

        MatcherAssert.assertThat(actual, contains("odd","even"));

    }

    @Test
    void evenOrOddReturnsListWhenGivenManyNegativeIntegers(){

        //Setup


        //Exercise
        final List<String> actual = Library.evenOrOdd(Arrays.asList(-10, -25));

        MatcherAssert.assertThat(actual, contains("even","odd"));

    }
}
