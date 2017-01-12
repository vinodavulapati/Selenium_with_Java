package work_day1_;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class class2{
private WebDriver driver = null;

// Before class methods execute before each class
@BeforeClass
public void beforeClass() {
    System.setProperty("webdriver.ie.driver", "C://Selenium//IEDriverServer.exe");
    driver = new InternetExplorerDriver();
    driver.navigate().to("http://facebook.com");
}

// After class method executes after each class 
@AfterClass
public void afterClass() {
    driver.quit();
}

// Test executes between before and after class 
@Test
public void sampleTestScenario() {
    System.out.println("Sample test");
}
}