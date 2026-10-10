package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

  private WebDriver driver;
    private By formLink= By.linkText("Form Authentication");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

public LoginPage formAuthenticationLink(){
        driver.findElement(formLink).click();
        return new LoginPage(driver);

}

}
