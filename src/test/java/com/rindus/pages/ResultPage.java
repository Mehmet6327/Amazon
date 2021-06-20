package com.rindus.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ResultPage extends BasePage {
    @FindBy(xpath = "//span[@class='a-color-state a-text-bold']")
    public WebElement hatForMenText;
    @FindBy(xpath = "(//img[@class='s-image'])[1]")
    public WebElement firstHatForMen;
    @FindBy(xpath = "//span[@class='a-size-base-plus a-color-base a-text-normal']")
    public WebElement firstHatText;
    @FindBy(xpath = "//span[@class = 'a-size-large product-title-word-break']")
    public WebElement firstHatTextDetail;
    @FindBy(xpath = "//select[@name='dropdown_selected_size_name']")
    public WebElement selectSize;
    @FindBy(id = "quantity")
    public WebElement select;
    @FindBy(xpath = "//input[@id='add-to-cart-button']")
    public WebElement addToCart;
    @FindBy(xpath = "//a[@href='/gp/cart/view.html?ref_=nav_cart']")
    public WebElement Cart;
}
