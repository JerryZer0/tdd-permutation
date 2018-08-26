import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public List<String> call(String input) {
        List<String> permutations = new ArrayList<>();
        if (input.length() == 1) {
            return Arrays.asList(input);
        }
        for (int i = 0; i < input.length(); i++) {
            List<String> restPermutations = call(getRestString(input, i));
            for (String permutation : restPermutations) {
                permutations.add(input.charAt(i) + permutation);
            }
        }
        return permutations;
    }

    private String getRestString(String input, int index) {
        return input.substring(0, index) + input.substring(index + 1);
    }
}
