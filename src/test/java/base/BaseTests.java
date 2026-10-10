package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
//    private By linklocators=By.tagName("a");
//    private By inputslink=By.linkText("Inputs");
@BeforeClass
    public void setup(){
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        homePage=new HomePage(driver);
//        System.out.println(driver.getTitle());
//List <WebElement> links=  driver.findElements(linklocators);
//        System.out.println("the number of links"+links.size());
//WebElement inputelement=driver.findElement(inputslink).click();
//        driver.findElement(inputslink).click();

    }
    @AfterClass
    public void tearDown(){
    driver.quit();
    }

}
