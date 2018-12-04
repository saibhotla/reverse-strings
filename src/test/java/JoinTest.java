import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

final class JoinTest {

    @Test
    void returnsEmptyStringGivenNull() {
        //Exercise
        String actual = Library.join(null, null);

        assertThat(actual, is(""));
    }

    @Test
    void returnsGopalGivenGopal() {
        //Exercise
        String actual = Library.join(null, "Gopal");

        assertThat(actual, is("Gopal"));
    }

    @Test
    void returnsTestGivenTest() {
        //Exercise
        String actual = Library.join(null, "Test");

        assertThat(actual, is("Test"));
    }

    @Test
    void returnsEmptyStringForNoArguments() {
        //Exercise
        String actual = Library.join(null);

        assertThat(actual, is(""));
    }

    @Test
    void returnsTestSpaceGopalGivenTestAndGopal() {
        //Exercise
        String actual = Library.join(null, "Test","Gopal");

        assertThat(actual, is("Test Gopal"));

    }

    @Test
    void returnsChairSpaceDeskGivenThoseInputs() {
        //Exercise
        String actual = Library.join(null, "Chair","Desk");

        assertThat(actual, is("Chair Desk"));

    }

    @Test
    void returnsTVCommaComputerDeskGivenThoseInputsWithDelimeter() {
        //Exercise
        String actual = Library.join(",", "TV","Computer");

        assertThat(actual, is("TV,Computer"));

    }

    @Test
    void returnsChairTildaDeskTildaTabsGivenThreeInputs() {
        //Exercise
        String actual = Library.join("~", "Chair","Desk","Tabs");

        assertThat(actual, is("Chair~Desk~Tabs"));

    }

    @Test
    void returnsEmptyStringWithNoSpacesForNullInStrings() {
        //Exercise
        String actual = Library.join(null, "Bottle", null);

        assertThat(actual, is("Bottle"));

    }


    @Test
    void joinReplacesSpacesWithBackTick() {
        //Exercise
        String actual = Library.join(null, "Bottle", " ", "Fred");

        assertThat(actual, is("Bottle ` Fred"));

    }



}
