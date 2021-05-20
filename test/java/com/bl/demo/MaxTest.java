import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Optional;


public class MaxTest {
    /*
            Maximum Integer
     */
    //Maximum Int at First
    @Test
    public void givenNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        Optional<Integer> max = generic.findMaximum(7,4,3,5);
        Assertions.assertEquals(Optional.of(7),max);
    }

    //Maximum Int at Second
    @Test
    public void givenNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        Optional<Integer> max = generic.findMaximum(4,7,3,5);
        Assertions.assertEquals(Optional.of(7),max);
    }

    //Maximum Int at Third
    @Test
    public void givenNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        Optional<Integer> max = generic.findMaximum(4,3,7,5);
        Assertions.assertEquals(Optional.of(7),max);
    }

    /*
            Maximum Float
     */

    // Maximum Float at First
    @Test
    public void givenFloatNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        Optional<Float> max = generic.findMaximum(7.8,4.4,5.4,3.3);
        Assertions.assertEquals(Optional.of(7.8),max);
    }

    //Maximum float at Second
    @Test
    public void givenFloatNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        Optional<Float> max = generic.findMaximum(4.4,7.8,5.4,3.3);
        Assertions.assertEquals(Optional.of(7.8),max);
    }

    //Maximum float at Third
    @Test
    public void givenFloatNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        Optional<Float> max = generic.findMaximum(4.4,5.4,7.8,3.3);
        Assertions.assertEquals(Optional.of(7.8),max);
    }

    /*
            Maximum String
     */

    // Maximum String at First
    @Test
    public void givenStringNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        Optional<String> max = generic.findMaximum("Banana","Peach","Apple","Kiwi");
        Assertions.assertEquals(Optional.of("Banana"),max);

    }

    // Maximum String at Second
    @Test
    public void givenStringNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        Optional<String> max = generic.findMaximum("Peach","Banana","Apple","Kiwi");
        Assertions.assertEquals(Optional.of("Banana"),max);
    }

    // Maximum String at Third
    @Test
    public void givenStringNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        Optional<String> max = generic.findMaximum("Peach","Apple","Banana","Kiwi");
        Assertions.assertEquals(Optional.of("Banana"),max);
    }
}