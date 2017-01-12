package onlineSelenium;

import java.util.ArrayList;
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

public class day1 {
	private WebDriver driver = null;

	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.ie.driver", "C://Selenium//IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.navigate().to("http://facebook.com");
	}

	@Test
	public void findElementById() {
		driver.findElement(By.id("email")).sendKeys("avk.509@gmail.comm");
		driver.findElement(By.id("pass")).sendKeys("1234567890");
		driver.findElement(By.xpath(".//*[@id='u_0_n']")).click();
	}

	/*
	 * @Test public void findElementById2(){ //
	 * driver.findElement(By.id("email")).sendKeys("avk.509@gmail.comm"); //
	 * driver.findElement(By.id("pass")).sendKeys("1234567890"); //
	 * driver.findElement(By.xpath(".//*[@id='u_0_n']")).click();
	 * 
	 * 
	 * List<WebElement> el =
	 * driver.findElements(By.xpath(".//*[@id='js_0']/div/div/div"));
	 * 
	 * //Assert.assertTrue(el.get(0).
	 * equals("The email or phone number you’ve entered doesn’t match any account."
	 * )); Assert.assertTrue(el.get(0).
	 * equals("The email you’ve entered doesn’t match any account. Sign up for an account."
	 * )); }
	 * 
	 * @Test public void findElementById3(){ //
	 * driver.findElement(By.id("email")).sendKeys("avk.509@gmail.comm"); //
	 * driver.findElement(By.id("pass")).sendKeys("1234567890"); //
	 * driver.findElement(By.xpath(".//*[@id='u_0_n']")).click();
	 * 
	 * String
	 * actual_msg=driver.findElement(By.xpath(".//*[@id='js_0']/div/div/div")).
	 * getText(); //String
	 * expect="The email or phone number you’ve entered doesn’t match any account."
	 * ; String
	 * expect="The email you’ve entered doesn’t match any account. Sign up for an account."
	 * ; Assert.assertEquals(actual_msg, expect); }
	 */
//*************************************************************************************************
	/*@Test
	public void findDuplicates() throws InterruptedException {
		// List<WebElement> listOfElement =
		// driver.findElements(By.tagName("a"));
		List<String> freshcontents, duplicatecontents;
		freshcontents = new ArrayList();
		duplicatecontents = new ArrayList();
		List<WebElement> urllist;
		urllist = driver.findElements(By.tagName("a"));
		for (WebElement url : urllist) {
			// check duplicate content
			if (url.getAttribute("href").trim().matches("([^\\s]+(\\-[0-9])$)")) {
				// store duplicate contents into duplicatecontents List variable
				duplicatecontents.add(url.getText().trim() + "  " + url.getAttribute("href").trim());
			} else {
				// store Fresh content into freshcontents List variable
				freshcontents.add(url.getText().trim() + "  " + url.getAttribute("href").trim());
			}
		}
		driver.quit();

	System.out.println("===== Duplicate contents =======");System.out.println("Number of duplicate contents =: "+duplicatecontents.size());
	for(String duplicate:duplicatecontents)
	{
		System.out.println(duplicate);
	}System.out.println("\n===== Fresh contents =======");System.out.println("Number of Fresh contents =: "+freshcontents.size());for(
	String fresh:freshcontents)
	{
		System.out.println(fresh);
	}

}
	*/
	
//***********************************************************************************************
	
	 @Test
	    public void findElementByList() throws InterruptedException {
	        List<WebElement> listOfElement = driver.findElements(By.tagName("a"));
	        for(int i=0;i<listOfElement.size();i++){
	            System.out.println(listOfElement.get(i).getText()); 
	        
	        	
	           
	               
	            }
	        }
	        
	
	

	@AfterClass
	public void afterClass() {
		// driver.quit();
	}
}

//