import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PluralizerTests {

    @Test
    void shouldAddSWhenWordIsNormal(){
        Pluralizer pluralizer = new Pluralizer();

        String actualResult = pluralizer.pluralize("dog");

        Assertions.assertEquals("dogs", actualResult);
    }

}