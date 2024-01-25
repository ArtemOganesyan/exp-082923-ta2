package definitions;

import cucumber.api.java.en.Given;

public class JavaSteps {
    @Given("test java")
    public void testJava() {
        System.out.println("Step executed");
    }
}
