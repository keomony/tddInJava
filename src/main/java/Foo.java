public class Foo {

    private String fooValue;

    public Foo(String fooValue) {
        this.fooValue = fooValue;
    }

    public void changeFooValue(String updatedFoodVaule){
        this.fooValue = updatedFoodVaule;
    }

    public String getFooValue() {
        return fooValue;
    }
}
