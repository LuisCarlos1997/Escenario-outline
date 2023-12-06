package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OpenUser {
    public static final Target USERNAME = Target.the("Usuario").located(By.id("user-name"));
    public static final Target PASSWORD = Target.the("contrasena").locatedBy("//*[@id='password']");
    public static final Target LOGIN = Target.the("Ingresar").locatedBy("//*[@id='login-button']");
}
