package com.rindus.stepDefinitions;
import com.rindus.pages.ShoppingCartPage;
import com.rindus.utilities.Helpers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.assertEquals;
public class ShoppingStepDefs {
    @When("the user changes the quantity from {int} to {int} in Cart")
    public void the_user_changes_the_quantity_from_to_in_Cart(int int1, int int2) throws InterruptedException {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        shoppingCartPage.selectQuantityByIndex(int2);
        Thread.sleep(2000);
    }
    @Then("as the quantity equals to {int} calculated price should be equal to the total price")
    public void as_the_quantity_equals_to_calculated_price_should_be_equal_to_the_total_price(int expectedHatQuantity) throws InterruptedException {
        ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
        int actualHatQuantity = Integer.parseInt(shoppingCartPage.hatQuantity.getText());
        assertEquals(expectedHatQuantity, actualHatQuantity);
        double expectedTotalPrice = Helpers.calculateTotalPrice(shoppingCartPage.hatPrice, shoppingCartPage.hatQuantity);
        double actualTotalPrice = Double.parseDouble(shoppingCartPage.totalPrice.getText().replace('$', ' ').trim());
        assertEquals(expectedTotalPrice, actualTotalPrice, 0);
    }
}
