package com.rindus.pages;
import com.rindus.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ShoppingCartPage extends BasePage {
   @FindBy(xpath = "//span[text()='Qty:']/following-sibling::span")
    public WebElement hatQuantity;
    @FindBy(xpath = "//span[@id='sc-subtotal-amount-activecart']")
    public WebElement totalPrice;
    @FindBy(xpath = "(//span[contains(@class,'a-size-medium a-color-base')])[2]")
    public WebElement hatPrice;
    public void selectQuantityByIndex(int quantity){
     Driver.get().findElement(By.xpath("//span[@data-a-class='quantity']")).click();
     Driver.get().findElement(By.xpath("//ul[@role='listbox']/li/a[text()='"+quantity+"']")).click();
    }
}
