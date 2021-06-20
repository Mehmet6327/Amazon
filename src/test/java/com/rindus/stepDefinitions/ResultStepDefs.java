package com.rindus.stepDefinitions;
import com.rindus.pages.ResultPage;
import com.rindus.utilities.ConfigurationReader;
import com.rindus.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import java.util.NoSuchElementException;
public class ResultStepDefs {
    ResultPage resultPage;
    String hatName;
    @When("the user selects first hat appearing")
    public void the_user_selects_first_hat_appearing() {
        resultPage = new ResultPage();
        hatName = resultPage.firstHatText.getText();
        resultPage.firstHatForMen.click();
        String [] firstLetterOfHatName = hatName.split(" ");
        String currentUrl = Driver.get().getCurrentUrl();
        Assert.assertTrue(currentUrl.contains(firstLetterOfHatName[0]));
        String actualTextDetails = resultPage.firstHatTextDetail.getText();
        Assert.assertEquals(actualTextDetails,hatName);
    }
    @When("the user adds the hat to the Cart with quantity {string}")
    public void the_user_adds_the_hat_to_the_Cart_with_quantity(String quantity) {
        try {
            Select optionsSize = new Select(resultPage.selectSize);
            optionsSize.selectByIndex(2);
        } catch (Exception e) {
            System.out.println("noSize");
        }
        try {
            Select options = new Select(resultPage.select);
            options.selectByValue(quantity);
        } catch (NoSuchElementException e) {
        }
        resultPage.addToCart.click();
        String goProductUrl = Driver.get().getCurrentUrl();
        Assert.assertTrue(goProductUrl.contains(ConfigurationReader.get("goProductUrl")));
    }
    @When("the user opens the cart")
    public void the_user_opens_the_cart() {
       resultPage.Cart.click();
       String shoppingCartUrl = Driver.get().getCurrentUrl();
       Assert.assertTrue(shoppingCartUrl.contains(ConfigurationReader.get("shoppingCartUrl")));
    }
}
