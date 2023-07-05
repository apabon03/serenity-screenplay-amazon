package com.amazon.tasks;

import com.amazon.utils.Excel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static com.amazon.ui.HomeUI.TXT_SEARCH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

//se implementa interfaz
public class HomeTask implements Task {
    private static ArrayList<Map<String, String>> data = new ArrayList<>();

    @Override
    public <T extends Actor> void performAs(T actor){

        try {
            data = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Data2.xlsx", "SearchProduct");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Enter.theValue(data.get(0).get("Search")).into(TXT_SEARCH).thenHit(Keys.ENTER)
                //Enter.theValue(data.get(0).get("Search")).into(TXT_SEARCH).thenHit(Keys.ENTER)
        );
    }

    public static Performable fromHome(){
        return instrumented(HomeTask.class);
    }
}
