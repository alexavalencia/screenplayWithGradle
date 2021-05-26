package com.prueba.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SetUpStage {

    @Managed
    private static WebDriver driver;

    @Before
    public void setUpStage(){
        OnStage.setTheStage(Cast.whereEveryoneCan(BrowseTheWeb.with(driver)));
        OnStage.theActor("user");
    }

    @After
    public void closeTheStage(){
        OnStage.drawTheCurtain();
    }
}
