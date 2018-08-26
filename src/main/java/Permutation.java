import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class Permutation {
    public List<String> call(String input) {
        List<String> result = new ArrayList<>();
        if (input.length() == 1) {
            result = Arrays.asList(input);
        }
        if (input.length() == 2) {
            result.add(input.substring(0, 1) + input.substring(1, 2));
            result.add(input.substring(1, 2) + input.substring(0, 1));
        }
        if (input.length() == 3) {
            result.add(input.substring(0, 1) + input.substring(1, 2)+ input.substring(2, 3));
            result.add(input.substring(0, 1) + input.substring(2, 3)+ input.substring(1, 2));
            result.add(input.substring(1, 2) + input.substring(0, 1)+ input.substring(2, 3));
            result.add(input.substring(1, 2) + input.substring(2, 3)+ input.substring(0, 1));
            result.add(input.substring(2, 3) + input.substring(0, 1)+ input.substring(1, 2));
            result.add(input.substring(2, 3) + input.substring(1, 2)+ input.substring(0, 1));
        }
        return result;
    }
}
