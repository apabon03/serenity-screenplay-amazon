package com.amazon.interactions;


import com.amazon.utils.EscrituraExcel;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static com.amazon.ui.CatalogueUI.LBL_NAME_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickRandom implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor){
        List<WebElementFacade> listProducts = LBL_NAME_PRODUCT.resolveAllFor(actor); //devuelve toda la coleccion

        Random random = new Random();
        int indexRandom = random.nextInt(listProducts.size());

        String productName = listProducts.get(indexRandom).getText(); //en este punto selecciona al azar
        EscrituraExcel.escrituraExcel("src/test/resources/Data/Data2.xlsx", productName, 1, 1);
        listProducts.get(indexRandom).click();

    }

    public static Performable click(){ //método con el cual se interactia
        return instrumented(ClickRandom.class);
    }
}
