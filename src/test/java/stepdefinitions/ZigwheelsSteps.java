package stepdefinitions;

import base.BaseTest;
import pages.*;
import io.cucumber.java.en.*;
import utils.ScreenshotUtil;

import java.util.List;

public class ZigwheelsSteps extends BaseTest {

    LoginPage loginPage;
    BikesPage bikesPage;
    ElectricCarsPage electricCarsPage;
    ReviewPage reviewPage;
    BrandPage brandPage;
    CarFilterPage carFilterPage;
    ElectricBikes electricBikes;

    // LOGIN
    @Given("user launches the application")
    public void launchApp() {
        loginPage = new LoginPage(driver);
    }

    @When("user performs google login")
    public void performLogin() {
        loginPage.googleLoginValidation();
    }

    @Then("login should be successful")
    public void verifyLogin() {
        ScreenshotUtil.capture(driver, "Login");
    }

    // BIKES
    @Given("user is on bikes page")
    public void goToBikesPage() {
        bikesPage = new BikesPage(driver);
    }

    @When("user selects upcoming bikes and chooses Honda")
    public void selectHondaBikes() {
        bikesPage.goToUpcomingBikes();
        bikesPage.selectHondaManufacturer();
    }

    @Then("user should see Honda bikes under 4 lakhs")
    public void verifyHondaBikes() {
        bikesPage.getHondaBikesUnder4L();
        ScreenshotUtil.capture(driver, "Honda_Bikes");
    }

    // ELECTRIC CARS
    @Given("user navigates to electric cars page")
    public void goToElectricCars() {
        electricCarsPage = new ElectricCarsPage(driver);
    }

    @When("user opens the first electric car")
    public void openCar() {
        electricCarsPage.goToElectricCars();
        electricCarsPage.openFirstCar();
    }

    @Then("car details should be displayed")
    public void verifyCarDetails() {
        electricCarsPage.printCarDetails();
        ScreenshotUtil.capture(driver, "ElectricCar");
    }

    // REVIEWS
    @Given("user navigates to reviews page")
    public void goToReviews() {
        reviewPage = new ReviewPage(driver);
    }

    @When("user retrieves reviews in descending order")
    public void getReviews() {
        reviewPage.goToUserReviews();
    }

    @Then("reviews should be displayed correctly")
    public void verifyReviews() {
        List<String> reviews = reviewPage.getReviewsInDescendingOrder();
        reviewPage.printCleanReviews(reviews);
        ScreenshotUtil.capture(driver, "Reviews");
    }

    // BRAND
    @Given("user scrolls to browse by brand")
    public void scrollToBrand() {
        brandPage = new BrandPage(driver);
        brandPage.scrollToBrowseSection();
    }

    @When("user selects BMW and chooses cruiser bikes")
    public void selectBMW() throws Exception {
        brandPage.clickBrandTab();
        brandPage.selectBMW();
        brandPage.clickCruiserBikes();
    }

    @Then("BMW cruiser bikes should be displayed")
    public void verifyBMW() {
        ScreenshotUtil.capture(driver, "BMW_Cruiser");
    }

    // FILTER
    @Given("user navigates to cars section")
    public void goToCarsSection() {
        carFilterPage = new CarFilterPage(driver);
        carFilterPage.scrollToCarsSection();
    }

    @When("user applies filters for 9 seater, 3000cc, and price")
    public void applyFilters() {
        carFilterPage.clickSeatingCapacityTab();
        carFilterPage.selectNineSeater();
        carFilterPage.clickEngineDisplacement();
        carFilterPage.select3000Plus();
        carFilterPage.clickPriceTab();
        carFilterPage.openFirstCar();
    }

    @Then("filtered cars should be displayed")
    public void verifyFilters() {
        ScreenshotUtil.capture(driver, "FilterCars");
    }

    // ELECTRIC BIKE
    @Given("user navigates to electric bikes page")
    public void goToEVPage() {
        electricBikes = new ElectricBikes(driver);
    }

    @When("user searches for electric bikes")
    public void searchBike() {
        electricBikes.gotoPage();
        electricBikes.searchEVBike();
    }

    @Then("electric bike results should be shown")
    public void verifyEVBike() {
        ScreenshotUtil.capture(driver, "ElectricBike");
    }
}
