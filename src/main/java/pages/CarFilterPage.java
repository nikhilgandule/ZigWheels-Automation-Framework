package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CarFilterPage {

	WebDriver driver;
	WebDriverWait wait;

	public CarFilterPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}

	// Scroll to Browse Cars section
	public void scrollToCarsSection() {

		WebElement section = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[contains(text(),'Browse Cars By')]")));
		
															//aligns the element in the center of the screen
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block:'center'});", section);
	
	}

	// Click Seating Capacity tab
	public void clickSeatingCapacityTab() {

		WebElement tab = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(@class,'browseby-seating-capacity-car-tab')]")));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView({block:'center'});", tab);

		try { Thread.sleep(500); } catch (Exception e) {}

		js.executeScript("arguments[0].click();", tab);
	}

	// Select 9 Seater
	public void selectNineSeater() {

		WebElement nineSeater = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//a[contains(text(),'9 Seater')]")));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView({block:'center'});", nineSeater);

		try { Thread.sleep(500); } catch (Exception e) {}

		js.executeScript("arguments[0].click();", nineSeater);

		// Wait next page load
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1")));
	}

	// Click Engine Displacement
	public void clickEngineDisplacement() {

		WebElement engineTab = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'Engine')]") ) );

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView({block:'center'});", engineTab);

		try { Thread.sleep(500); } catch (Exception e) {}

		js.executeScript("arguments[0].click();", engineTab);
	}

	// Select 3001cc and above
	public void select3000Plus() {

		WebElement option = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(),'3001')]")));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView({block:'center'});", option);

		try { Thread.sleep(500); } catch (Exception e) {}

		js.executeScript("arguments[0].click();", option);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1")));
	}

	public void clickPriceTab() {

		WebElement priceTab = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(text(),'Budget')] | //li[contains(text(),'Price')]")));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView({block:'center'});", priceTab);

		try { Thread.sleep(500); } catch (Exception e) {}

		js.executeScript("arguments[0].click();", priceTab);
	}

	public void openFirstCar() {

		// Wait for car list to load (VERY IMPORTANT)
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//li[contains(@class,'modelItem')]")));

		// Now get first car image
		WebElement firstCar = wait.until(
				ExpectedConditions.presenceOfElementLocated(By.xpath("(//li[contains(@class,'modelItem')]//img)[1]")));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll to element
		js.executeScript("arguments[0].scrollIntoView({block:'center'});", firstCar);

		try { Thread.sleep(500); } catch (Exception e) {}

		// Click
		js.executeScript("arguments[0].click();", firstCar);

		// Switch window if new tab opens
		for (String win : driver.getWindowHandles()) {
			driver.switchTo().window(win);
		}
	}
}