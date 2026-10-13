package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

  private WebDriver driver;
//    private By formLink= By.linkText("Form Authentication");
    public HomePage(WebDriver driver){
        this.driver=driver;
    }

public LoginPage formAuthenticationLink(){
//        driver.findElement(formLink).click();
    clickLink("Form Authentication");
        return new LoginPage(driver);

}
    public HoversPage clickHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public DropDownPage dropDown (){
//        driver.findElement(formLink).click();
        clickLink("Dropdown");
        return new DropDownPage(driver);

    }

    public KeyPressesPage clickKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

public  void clickLink( String linkText){

        driver.findElement(By.linkText(linkText)).click();
}




}
