package com.amazon.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeUI {
    //En este caso ya no se extiende de PageObject
    public static Target TXT_SEARCH=Target.the("textbox search")
            .locatedBy("//input[@id='twotabsearchtextbox']"); //igualmente se usa located(By)
}
