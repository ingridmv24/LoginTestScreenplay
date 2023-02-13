package co.com.company.certificacion.training.stepdefinitios;

import co.com.company.certificacion.training.questions.ErrorLoginMessage;
import co.com.company.certificacion.training.questions.InventoryMessage;
import co.com.company.certificacion.training.tasks.LoginTask;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;
import org.hamcrest.core.IsEqual;

public class LoginStepDefinitions {
    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} is on the login page {string}")
    public void isOnTheLoginPage(String user, String url) {
        OnStage.theActorCalled(user).wasAbleTo(
                Open.url(url)
        );
    }
    @When("user attempts to login with username {string} and password {string}.")
    public void userAttemptsToLoginWithUsernameAndPassword(String username, String password) {
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.EnterCredentials(username,password));
    }
    @Then("user can see the inventory page")
    public void userCanSeeTheInventoryPage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(InventoryMessage.isVisible(), IsEqual
                .equalTo("PRODUCTS")));
    }
    @Then("user should see an error message")
    public void userShouldSeeAnErrorMessage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ErrorLoginMessage.appears(), IsEqual
                .equalTo("Epic sadface: Username and password do not match any user in this service")));
    }




}
