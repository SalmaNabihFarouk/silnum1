package Login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.Secure;

import static org.testng.Assert.*;


public class LoginTests extends BaseTests {
@Test
    public void testSucessLogin() {
        LoginPage loginPage =homePage.formAuthenticationLink();
        loginPage.setUserNameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
     Secure secure =loginPage.clickLoginButton();
     String message=secure.getMessage();
     assertTrue(message.contains("You logged into a secure area!"),"You didnt login");

    }
}
