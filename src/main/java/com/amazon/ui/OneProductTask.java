package com.amazon.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OneProductTask {
    public static final Target LBL_ARTICLE= Target.the("Product name") //final para que el valor no cambie
            .located(By.id("productTitle"));
}
