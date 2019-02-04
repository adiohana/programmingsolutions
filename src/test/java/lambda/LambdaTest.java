package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by aohana
 */
public class LambdaTest {

    @Test
    public void getContinentTest() {

        List<Country> countries = new ArrayList<>();
        Country country1 = new Country();
        country1.setContinent("US");
        country1.setPopulation(50);
        Country country2 = new Country();
        country2.setContinent("US");
        country2.setPopulation(140);
        Country country3 = new Country();
        country3.setContinent("UK");
        country3.setPopulation(50);
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);

        assertEquals(190, Lambda.lambdaGetContinent.getContinent(countries, "US"));

    }

    @Test
    public void getRandomSubsetTest() {

        List<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(4);
        integers.add(4);
        integers.add(4);
        integers.add(4);

        Lambda.randomSubsets.getRandomSubsets(integers);

    }
}
