import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static java.util.Arrays.asList;

public class PermutationTest {

   @Test
    public void should_return_a_when_input_is_a(){
      //Given
      String input="a";
      //When
      List<String> combination=Permutation.call(input);
      //Then
      Assertions.assertEquals(combination,is(asList("a")));
   }

}
