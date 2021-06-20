package com.rindus.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class AmazonMainPage extends BasePage {
    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchBox;
    @FindBy(xpath = "//span[@id='nav-search-submit-text']/input")
    public WebElement searchButton;
    @FindBy(xpath = "//span[contains(text(),'Change')]")
    public WebElement adressPopUp;
    @FindBy(xpath = "//span[contains(text(),'No,thanks')]")
    public WebElement languagePopUp;
    public void dismissPopUp(){
        try {
            if (adressPopUp.isEnabled()){
                adressPopUp.click();
            }else{
                languagePopUp.click();
            }
        }
        catch (Exception e){
        }
    }
}
