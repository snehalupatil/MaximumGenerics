import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MaxTest {
    @Test
    public void givenNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        Integer max = generic.findMaximumInt(5,4,3);
        Assertions.assertEquals(5,max);
    }

    @Test
    public void givenNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        Integer max = generic.findMaximumInt(4,5,3);
        Assertions.assertEquals(5,max);
    }

    @Test
    public void givenNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        Integer max = generic.findMaximumInt(4,3,5);
        Assertions.assertEquals(5,max);
    }

    @Test
    public void givenFloatNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        Float max = generic.findMaximumFloat(7.8f,4.4f,5.2f);
        Assertions.assertEquals(7.8f,max);
    }
}