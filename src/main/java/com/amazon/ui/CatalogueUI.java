package com.amazon.ui;

import net.serenitybdd.screenplay.targets.Target;

public class CatalogueUI {
    public static final Target LBL_NAME_PRODUCT = Target.the("Product Collection").locatedBy("//h2/a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal' and not(@is-empty)]");
}
