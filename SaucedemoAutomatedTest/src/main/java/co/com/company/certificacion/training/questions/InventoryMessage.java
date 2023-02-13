package co.com.company.certificacion.training.questions;

import co.com.company.certificacion.training.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class InventoryMessage implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return HomePage.LABEL_TITLE.resolveAllFor(actor).get(0).getText();
    }

    public static InventoryMessage isVisible(){
        return new InventoryMessage();
    }
}
