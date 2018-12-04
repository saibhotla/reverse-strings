import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.contains;

final class LibraryTest {

    @Test
    void reverseStringsReturnsEmptyListWhenGivenNull() {
        //Setup

        //Exercise
        final List<String> actual = Library.reverseString(null);
        //Assert
        assertThat(actual.isEmpty(), is(true));

    }

    @Test
    void reverseStringReturnsEmptyListWhenGivenEmptyList(){

        //Exercise
        final List<String> actual = Library.reverseString(Collections.emptyList());
        //Assert
        assertThat(actual.isEmpty(), is(true));

    }

    @Test
    void reverseStringsReturnsListWithOneReversedValue(){
        //Setup

        //Exercise
        final List<String> actual = Library.reverseString(Collections.singletonList("foo"));

        //Assert
        MatcherAssert.assertThat(actual,contains("oof"));
    }
}
