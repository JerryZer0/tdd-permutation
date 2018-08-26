import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public List<String> call(String input) {
        List<String> result = new ArrayList<>();
        if (input.length() == 1) {
            result = Arrays.asList(input);
        }
        if (input.length() == 2) {
            for (int i = 0; i < input.length(); i++) {
                result.add(input.charAt(i) + getRestString(input, i));
            }
        }
        if (input.length() == 3) {
            List<String> result1 = new ArrayList<>();
            for(int x=0;x<input.length();x++){
                result1 = call(getRestString(input, x));
                for (int j =0; j < result1.size(); j++) {
                    result.add(input.charAt(x) + result1.get(j));
                }
            }
        }
        return result;
    }

    private String getRestString(String input, int index) {
        return input.substring(0, index) + input.substring(index + 1);
    }
}
