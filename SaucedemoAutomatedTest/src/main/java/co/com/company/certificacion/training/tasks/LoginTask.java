package co.com.company.certificacion.training.tasks;

import co.com.company.certificacion.training.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class LoginTask implements Task {
     String username;
     String password;

    public LoginTask(String username,String password){
        this.username = username;
        this.password = password;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LoginPage.USERNAME_INPUT),
                Enter.theValue(password).into(LoginPage.PASSWORD_INPUT),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }

    public static LoginTask EnterCredentials(String username, String password)
    {
        return Tasks.instrumented(LoginTask.class,username,password);
    }
}
