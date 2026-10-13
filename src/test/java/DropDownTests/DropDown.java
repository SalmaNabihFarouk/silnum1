package DropDownTests;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDown  extends BaseTests {
    @Test
    public void testDropdown(){
        var dropdownPage = homePage.dropDown();
        String option = "Option 1";
        dropdownPage.selectFormDropDown(option);
        List<String> selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1,
                "The number of elements is not correct");
        assertTrue(selectedOptions.contains("Option 1"),
                "The option was not selected");
    }


}
