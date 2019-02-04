package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by aohana
 */
public class Lambda {

    static GetContinent lambdaGetContinent = (List<Country> countries, String continent) -> {
        int res = 0;
        for(Country country : countries) {
            if(country.getContinent().equals(continent)) {
                res+=country.getPopulation();
            }
        }
        return res;
    };

    static RandomSubsets randomSubsets = (List<Integer> integers) -> {
        int randomIndex = new Random().nextInt(integers.size());
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<randomIndex; i++) {
          res.add(integers.get(new Random().nextInt(integers.size())));
        }
        return res;
    };

}
