package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.OpenUser;

public class OpenTask implements Task {

    String username;
    String password;

    public OpenTask(String username, String password) {
        this.username = username;
        this.password = password;

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues(username).into(OpenUser.USERNAME));
        actor.attemptsTo(Enter.keyValues(password).into(OpenUser.PASSWORD));
        actor.attemptsTo(Click.on(OpenUser.LOGIN));
    }
    public static OpenTask ingresar (String username, String password){
        return Tasks.instrumented(OpenTask.class, username, password);
    }
}
