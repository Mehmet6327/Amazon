package com.rindus.stepDefinitions;
import com.rindus.pages.AmazonMainPage;
import com.rindus.pages.ResultPage;
import com.rindus.utilities.ConfigurationReader;
import com.rindus.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
public class AmazonStepDefs {
    @Given("the user is on the Amazon page")
    public void the_user_is_on_the_Amazon_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        String expectedUrl = ConfigurationReader.get("url");
        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @When("the user searches for {string}")
    public void the_user_searches_for(String expectedHatsForMen) throws InterruptedException {
        AmazonMainPage amazonMainPage = new AmazonMainPage();
        amazonMainPage.searchBox.sendKeys(expectedHatsForMen);
        amazonMainPage.searchButton.click();
        String expectedUrl = ConfigurationReader.get("searchUrlForHat");
        String actualUrl = Driver.get().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        ResultPage resultPage = new ResultPage();
        String actualHatForMen =  resultPage.hatForMenText.getText();
        String [] hatText = actualHatForMen.split("\"");
        Assert.assertEquals(hatText[1],expectedHatsForMen);
    }
}
