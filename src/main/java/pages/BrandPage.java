package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class BrandPage {

    WebDriver driver;
    WebDriverWait wait;

    public BrandPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Scroll to section
    public void scrollToBrowseSection() {

        WebElement section = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Browse Bikes By')]")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", section);
    }

    // Click Brand tab
    public void clickBrandTab() throws InterruptedException {

        WebElement brandTab = wait.until(
            ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(text(),'Brand')]")));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll properly
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", brandTab);

        Thread.sleep(500);

        // Use JS click
        js.executeScript("arguments[0].click();", brandTab);
    }
    

    public void selectBMW() {

        WebElement bmw = wait.until(
            ExpectedConditions.presenceOfElementLocated(By.xpath("//div[normalize-space()='BMW']")));

        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Scroll properly
        js.executeScript("arguments[0].scrollIntoView({block:'center'});", bmw);

        try { Thread.sleep(500); } catch (Exception e) {}

        // Click using JS (important)
        js.executeScript("arguments[0].click();", bmw);
    }
    
    public void clickCruiserBikes() {

        // Wait for BMW page to load
        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//h1[contains(text(),'BMW Bikes')]")));

        // Click Cruiser Bikes
        WebElement cruiser = wait.until(
            ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Cruiser Bikes')]")));

        // Scroll and click
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cruiser);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", cruiser);
    }
}