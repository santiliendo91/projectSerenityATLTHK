package task.saucedemo;

import models.User;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.saucedemo.SauceDemoHomePage;

public class Logout {
    public static Performable logout() {
        return Task.where(
                "{0} logout the app",
                Click.on(SauceDemoHomePage.MOREBTN),
                Click.on(SauceDemoHomePage.LOGOUT)
        );
    }
}
