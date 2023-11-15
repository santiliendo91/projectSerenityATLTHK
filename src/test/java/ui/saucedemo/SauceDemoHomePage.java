package ui.saucedemo;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SauceDemoHomePage  extends PageObject {

    public static Target USERNAME = Target.the("username field").locatedBy("#user-name");
    public static Target PASSWORD = Target.the("password field").locatedBy("#password");
    public static Target BUTTONLOGIN = Target.the("login button").locatedBy("#login-button");

    public static Target MOREBTN = Target.the("Open Menu").locatedBy("#react-burger-menu-btn");

    public static Target LOGOUT = Target.the("Logout Option").locatedBy("#logout_sidebar_link");
}
