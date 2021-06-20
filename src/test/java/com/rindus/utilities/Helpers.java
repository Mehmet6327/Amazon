package com.rindus.utilities;
import org.openqa.selenium.WebElement;
public class Helpers {
    public static double calculateTotalPrice(WebElement price, WebElement quantity) {
        return Double.parseDouble(price.getText().replace('$',' ').trim())*Integer.parseInt(quantity.getText());
      }
    }

