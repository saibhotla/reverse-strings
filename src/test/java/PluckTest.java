import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.contains;

final class PluckTest {

    @Test
    void pluckValuesWhenGivenNullReturnEmptyList(){
        //Setup

        //Exercise
        List<String> actual = Library.pluck(null);

        assertThat(actual.isEmpty(), is(true));

    }

    @Test
    @Disabled
    void pluckValuesWhenGivenEmptyListReturnEmptyList(){
        //Setup

        //Exercise
        List<String> actual = Library.pluck(Collections.emptyList());

        assertThat(actual.isEmpty(), is(true));

    }

    @Test
    void pluckValuesWhenGivenNullListReturnList(){
        //Setup

        //Exercise
        List<String> actual = Library.pluck(Collections.singletonList(null));

        assertThat(actual.isEmpty(), is(true));

    }

    @Test
    void pluckValuesWhenGivenSingleElementListReturnList(){
        //Setup
        HashMap<String, String> pluckMap= new HashMap<String, String>();
        pluckMap.put("foo","bar");

        //Exercise
        List<String> actual = Library.pluck(Collections.singletonList(pluckMap));

        assertThat(actual, contains("bar"));

    }

    @Test
    void pluckValuesWhenGivenAnotherElementListReturnList(){
        //Setup
        HashMap<String, String> pluckMap1= new HashMap<>();
        pluckMap1.put("foo","ski");
        HashMap<String, String> pluckMap2= new HashMap<>();
        pluckMap2.put("foo","bar");

        //Exercise
        List<String> actual = Library.pluck(Arrays.asList(pluckMap1,pluckMap2));

        assertThat(actual, contains("ski","bar"));

    }





}