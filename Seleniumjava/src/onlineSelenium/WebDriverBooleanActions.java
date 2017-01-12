package onlineSelenium;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverBooleanActions extends WebDriverFactory{
	    
	    @Test
	    public void booleanCondition() {
	        // How to check is element displayed
//	        boolean isDisplayed;
//	        try {
//	            isDisplayed = getDriver().findElement(By.id("mohammad")).isDisplayed();
//	            if(isDisplayed == true) {
//	                System.out.println("Radio button is displayed");
//	            }
//	        } catch (NoSuchElementException e) {
//	            Assert.fail("Radio button is not displayed");
//	            e.printStackTrace();
//	        }
	        
	        
	        //How to check if element is enabled 
//	        boolean isEnabled = getDriver().findElement(By.id("u_0_d")).isEnabled();
//	        if(isEnabled == false) {
//	            // Click on xyz button
//	        } else {
//	            // Click on abc button
//	        }
	    
	        // How to check if element is selected 
	    
	        getDriver().findElement(By.id("u_0_i")).click();
	        boolean isSelected = getDriver().findElement(By.id("u_0_i")).isSelected();
	        if(isSelected == false) {
	            System.out.println("Button is not selected");
	        } else {
	            Assert.fail("Button should not be selected by default");
	        }
	    }
	    

	}


