import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


import static java.util.Arrays.asList;

public class PermutationTest {

    Permutation permutation = new Permutation();

    @Test
    public void should_return_a_when_input_is_a() {
        //Given
        String input = "a";
        //When
        List<String> combination = permutation.call(input);
        System.out.println(combination);
        //Then
        Assertions.assertEquals(Arrays.asList("a"), combination);
    }

    @Test
    public void should_return_ab_ba_when_input_is_ab() {
        //given
        String input = "ab";
        //when
        List<String> combination = permutation.call(input);
        //then
        Assertions.assertEquals(Arrays.asList("ab","ba"), combination);
    }

    @Test
    public void should_return_abc_acb_bac_bca_cab_cba_when_input_is_abc() {
        //given
        String input = "abc";
        //when
        List<String> combination = permutation.call(input);
        //then
        Assertions.assertEquals(Arrays.asList("abc","acb","bac","bca","cab","cba"), combination);
    }
}
