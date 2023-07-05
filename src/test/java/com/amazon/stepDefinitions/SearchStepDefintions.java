package com.amazon.stepDefinitions;

import com.amazon.questions.ProductValidationQuestion;
import com.amazon.tasks.HomeTask;
import com.amazon.tasks.ProductCollectionTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class SearchStepDefintions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("that user open page Amazon and search any product")
    public void openUrl() {
        theActorCalled("User").wasAbleTo(
                Open.url("https://amazon.com/")
        );
    }
    @When("user click  on  product tittle and user click on add to cart")
    public void selectProduct() {
        theActorInTheSpotlight().attemptsTo(

                HomeTask.fromHome(),
                ProductCollectionTask.on()
        );
    }
    @Then("user can read the product name from excel")
    public void readNameProduct() {
        // Write code here that turns the phrase above into concrete actions

        theActorInTheSpotlight().should(
                seeThat(ProductValidationQuestion.from(),
                        Matchers.equalTo(true))
        );

    }
}
