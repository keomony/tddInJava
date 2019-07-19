import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FooTests {

    @Test
    public void shouldChangeValueOfFooWhenInvoked() {
        String ActualUpdatedFooValue = "Yes direction.";
        Foo foo = new Foo("No direction.");

        foo.changeFooValue(ActualUpdatedFooValue);

        String ExpectedUpdatedFooValue = foo.getFooValue();

        Assertions.assertEquals(ExpectedUpdatedFooValue, ActualUpdatedFooValue);

        Assertions.assertTrue(ExpectedUpdatedFooValue.equals(ActualUpdatedFooValue));
    }

}