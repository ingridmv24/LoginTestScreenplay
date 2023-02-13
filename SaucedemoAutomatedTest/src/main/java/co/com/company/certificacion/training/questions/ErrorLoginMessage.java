package co.com.company.certificacion.training.questions;

import co.com.company.certificacion.training.userinterfaces.HomePage;
import co.com.company.certificacion.training.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ErrorLoginMessage implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return LoginPage.LOGIN_TEXT.resolveAllFor(actor).get(0).getText();
    }

    public static ErrorLoginMessage appears()
    {
        return new ErrorLoginMessage();
    }
}
