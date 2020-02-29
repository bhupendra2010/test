package pages;

import drivers.DriverFact;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Homepage extends DriverFact {

    public void doSearch(String searchTerm) {
        driver.findElement(By.id("searchTerm"))
                .sendKeys(searchTerm);

        driver.findElement(By.id("searchTerm"))
                .sendKeys(Keys.ENTER);

    }

    public String getCurrentUrl() {return driver.getCurrentUrl();  }
}

