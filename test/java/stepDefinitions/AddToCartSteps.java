package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class AddToCartSteps {

    // This step definition corresponds to the step "I am on the product page"
    @Given("I am on the product page")
    public void i_am_on_the_product_page() {
        // Write code here that navigates to the product page
    }

    // This step definition corresponds to the step "I click on the {string} button"
    @When("I click on the {string} button")
    public void i_click_on_the_button(String buttonName) {
        // Write code here that clicks on the specified button
    }

    // This step definition corresponds to the step "the product should be added to my cart"
    @Then("the product should be added to my cart")
    public void the_product_should_be_added_to_my_cart() {
        // Write code here that checks whether the product is added to the cart
    }

    // This step definition corresponds to the step "the cart should display the correct total price"
    @Then("the cart should display the correct total price")
    public void the_cart_should_display_the_correct_total_price() {
        // Write code here that verifies the correct total price in the cart
    }
}

