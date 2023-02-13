package co.com.company.certificacion.training.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target USERNAME_INPUT = Target.the("userName_input").
            located(By.id("user-name"));

    public static final Target PASSWORD_INPUT = Target.the("password_input").
            located(By.id("password"));
    public static final Target LOGIN_BUTTON = Target.the("login_button").
            located(By.id("login-button"));

    public static final Target LOGIN_TEXT = Target.the("login_text").
            located(By.cssSelector("h3[data-test='error']"));
}
