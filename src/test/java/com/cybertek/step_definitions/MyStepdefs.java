package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPage;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;

public class MyStepdefs {
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();

    @Then("user search for {string}")

    public void userSearchFor(String SearchValue) {

        googleSearchPage.searchBox.sendKeys(SearchValue+Keys.ENTER);

    }

    @Then("user search for {string} and {string}")
    public void userSearchForAnd(String SearchValue, String Action) {
        googleSearchPage.searchBox.sendKeys(SearchValue+ " "+Action+Keys.ENTER);

    }
}
