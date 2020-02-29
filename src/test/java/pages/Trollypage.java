package pages;

import drivers.DriverFact;
import org.openqa.selenium.By;

public class Trollypage extends DriverFact {

    public void addToTrolley() {
        driver.findElement(By.cssSelector("button[data-test='component-att-button']")).click();
    }


    public void goToTrolley() {
        driver.findElement(By.cssSelector(".xs-row a[data-test='component-att-button-basket']")).click();
    }

    public String getProductInTrolley() {
        return driver.findElement(By.cssSelector(".ProductCard__content__9U9b1.xsHidden.lgFlex")).getText();
    }
}

