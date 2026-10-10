package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Secure {
    private WebDriver driver;
    private By Message=By.id("flash");
    public Secure (WebDriver driver){
        this.driver=driver;
    }



    public String getMessage(){
        return driver.findElement(Message).getText();
    }
}
