package com.amazon.tasks;

import com.amazon.interactions.ClickRandom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ProductCollectionTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                ClickRandom.click()
        );
    }

    public static Performable on(){
        return instrumented(ProductCollectionTask.class);
    }
}
