import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MaxTest {
    /*
            Maximum Integer
     */
    //Maximum Int at First
    @Test
    public void givenNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        Integer max = (Integer) generic.findMaximum(5,4,3);
        Assertions.assertEquals(5,max);
    }

    //Maximum Int at Second
    @Test
    public void givenNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        Integer max = (Integer) generic.findMaximum(4,5,3);
        Assertions.assertEquals(5,max);
    }

    //Maximum Int at Third
    @Test
    public void givenNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        Integer max = (Integer) generic.findMaximum(4,3,5);
        Assertions.assertEquals(5,max);
    }

    /*
            Maximum Float
     */

    // Maximum Float at First
    @Test
    public void givenFloatNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        Float max = (Float) generic.findMaximum(7.8f,4.4f,5.2f);
        Assertions.assertEquals(7.8f,max);
    }

    //Maximum float at Second
    @Test
    public void givenFloatNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        Float max = (Float) generic.findMaximum(4.4f,7.8f,5.2f);
        Assertions.assertEquals(7.8f,max);
    }

    //Maximum float at Third
    @Test
    public void givenFloatNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        Float max = (Float) generic.findMaximum(4.4f,5.2f,7.8f);
        Assertions.assertEquals(7.8f,max);
    }

    /*
            Maximum String
     */

    // Maximum String at First
    @Test
    public void givenStringNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        String max = (String) generic.findMaximum("Banana","Apple","Peach");
        Assertions.assertEquals("Banana",max);
    }

    // Maximum String at Second
    @Test
    public void givenStringNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        String max = (String) generic.findMaximum("Apple","Banana","Peach");
        Assertions.assertEquals("Banana",max);
    }

    // Maximum String at Third
    @Test
    public void givenStringNumber_FirstMaximum_returnMaximumNumber(){
        Max generic = new Max();
        String max = (String) generic.findMaximum("Apple","Peach","Banana");
        Assertions.assertEquals("Banana",max);
    }
}