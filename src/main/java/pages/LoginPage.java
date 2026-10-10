package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
private By userNameField=By.id("username");
    private By PasswordField=By.id("password");
    private By loginButton=By.cssSelector("#login>button");

public LoginPage(WebDriver driver){
this.driver=driver;
}




    public void setPasswordField( String password ) {
    driver.findElement(PasswordField).sendKeys(password);
    }

    public void setUserNameField(String username) {
        driver.findElement(userNameField).sendKeys(username);
    }

    public Secure clickLoginButton() {
        driver.findElement(loginButton).click();
return new Secure(driver);
    }
}
