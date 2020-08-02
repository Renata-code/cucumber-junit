package com.cybertek.step_definitions;

import com.cybertek.pages.SmartBearPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SmartBearStepDefinitions {
    SmartBearPage smartBearPage = new SmartBearPage();



    @Given("User is on the SmartBear Tester account and on Order page")
    public void user_is_on_the_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        smartBearPage.username.sendKeys("Tester");
        smartBearPage.password.sendKeys("test");
        smartBearPage.submit.click();
        smartBearPage.orderButton.click();

    }

    @Then("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {
        smartBearPage.dropdownBox.click();
        smartBearPage.familyAlbumOption.click();

    }
    @Then("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {
        smartBearPage.quantityBox.sendKeys(string);

    }
    @Then("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
        smartBearPage.customerNameBox.sendKeys(string);

    }

    @Then("User enters {string} to street")
    public void user_enters_to_street(String string) {
        smartBearPage.streetNameBox.sendKeys(string);
    }

    @Then("User enters {string} to city")
    public void user_enters_to_city(String string) {
        smartBearPage.cityNameBox.sendKeys(string);

    }
    @Then("User enters {string} to state")
    public void user_enters_to_state(String string) {
        smartBearPage.statenameBox.sendKeys(string);

    }

    @Then("User enters {string}")
    public void user_enters(String string) {
        smartBearPage.zipBox.sendKeys(string);

    }
    @Then("User selects Visa as card type")
    public void user_selects_visa_as_card_type() {
        smartBearPage.visaCardOption.click();

    }
    @Then("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
        smartBearPage.cardNumber.sendKeys(string);

    }
    @Then("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
        smartBearPage.expirationDate.sendKeys(string);

    }

    @Then("User clicks process button")
    public void user_clicks_process_button() {
        smartBearPage.processButton.click();

    }

    @Then("User verifiesJohn Wick is in the list")
    public void user_verifies_john_wick_is_in_the_list() {

        List<WebElement>actualList = Driver.getDriver().findElements(By.xpath("//*[@id=\"ctl00_MainContent_fmwOrder\"]//td"));
       for(WebElement each:actualList){
           Assert.assertTrue(actualList.contains("John Wick"));
       }

    }
}