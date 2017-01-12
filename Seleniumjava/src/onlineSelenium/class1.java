package onlineSelenium;



	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class class1 {

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
	    public void findElementByName() {
	        driver.findElement(By.name("email")).sendKeys("mohammad@gmail.com");
	        driver.findElement(By.name("pass")).sendKeys("Test1234");
	        driver.findElement(By.id("loginbutton")).click();
	    }
	    
//	    @Test
//	    public void findElementByTagName() {
//	        driver.findElement(By.tagName("input")).sendKeys("mohammad@gmail.com");
//	    }
	    
//	    @Test
//	    public void findElementByLinkText() throws InterruptedException {
//	        driver.findElement(By.linkText("Forgot account?")).click();
//	        Thread.sleep(3000);
//	    }
	    
//	    @Test
//	    public void findElementByPartilaLinkText() {
//	        driver.findElement(By.partialLinkText("Forgot")).click();
//	    }
	    
//	    @Test
//	    public void findElementByXpath() {
//	        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("mohammad@gmail.com");
//	        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Test1234");
//	        driver.findElement(By.xpath("//*[@id='loginbutton']")).click();
//	    }
	    
	    @Test
	    public void findElementByList() throws InterruptedException {
	        List<WebElement> listOfElement = driver.findElements(By.tagName("a"));
	        for(WebElement element : listOfElement) {
	            if (element.getText().equals("a")) {
	                element.click();
	                break;
	            }
	        }
	    }
	    @Test
	    public void testScenarioLogin() {
	        String actualURL = driver.getCurrentUrl();
	        String expectedURL = "https://www.facebook.com/";
	        Assert.assertEquals(actualURL, expectedURL);
	    }
	}

