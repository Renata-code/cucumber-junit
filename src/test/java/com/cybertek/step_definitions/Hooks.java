package com.cybertek.step_definitions;

import com.cybertek.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {




    @Before(order=2)
    public void setUpScenario(){
        System.out.println("---> Before annotation : Setting up browser");

    }
    @Before(value = "@db",order = 5)
    public  void setUpDatabaseConnection(){
        System.out.println("---->Before Annotation:DB connection created<---------");
    }

    //#1 we need to take a screenshot using SELENIUM
//a- we have to cast our Driver type to "TakesScreenshot"
//b- then we put the whole code "(TakesScreenshot)Driver.getDriver()" inside parenthesis ()
//c- then we say .getScreenshotAs()
//d- then we pass "OutputType.BYTES" to the argument
//c- then we store the whole structure to an array of byte. Like below
      //byte [] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);


    @After(order = 1)
    public void tearDownScenario(Scenario scenario) {

        if (scenario.isFailed()) {

            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            //2 we are going to attach it into our report
            //attach method accept 3 arguments screenshot,"image/png" and current scenario's name

            scenario.attach(screenshot, "image/png", scenario.getName());

        }

    }

/*
    from previous method just take it out to make it neat
     //System.out.println("--->After annotation: Closing browser");

       // System.out.println("scenario.getName() = " + scenario.getName());
        //System.out.println("scenario.getSourceTagNames() = " + scenario.getSourceTagNames());
        //System.out.println("scenario.isFailed() = " + scenario.isFailed());

        //1 we need to take screenshot using Selenium






/*

    @After(value = "db", order = 4)
    public void tearDownDatabaseConnection(){
        System.out.println("---> After annotation : DB connection closed");
    }

   @BeforeStep
    public void setUpStep(){
       System.out.println("=============>: Beforestep taking screenshot");
   }
   @AfterStep
    public void tearDownStep(){
       System.out.println("==============>: Afterstep Taking Screenshot");
   }








      /*

 */




}




