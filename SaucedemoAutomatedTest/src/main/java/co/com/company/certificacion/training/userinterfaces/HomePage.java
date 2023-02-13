package co.com.company.certificacion.training.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target LABEL_TITLE = Target.the("homePage_title").located(By.className("title"));
}
