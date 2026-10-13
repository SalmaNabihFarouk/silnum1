package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropDownPage {
    private  WebDriver driver;
private By dropDownLocator=By.id("dropdown");

    public DropDownPage ( WebDriver  driver){
        this.driver=driver;
    }

    public  void selectFormDropDown( String option){
        getDropDown().selectByVisibleText(option);

    }
    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements = getDropDown().getAllSelectedOptions();
        List<String> selectedOptions = new ArrayList<>();
        for(WebElement element : selectedElements){
            selectedOptions.add(element.getText());
        }
        return selectedOptions;
    }


    public Select getDropDown(){
        return new Select(driver.findElement(dropDownLocator));
    }
}
