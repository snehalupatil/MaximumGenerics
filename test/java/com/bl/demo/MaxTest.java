import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MaxTest {
    @Test
    public void givenNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        Integer max = generic.findMaximumInt(5,4,3);
        Assertions.assertEquals(5,max);
    }
}