package selenium_practise;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class class1 {
	public static void main(String args[]) {
		System.setProperty("webdriver.ie.driver", "C://Selenium//IEDriverServer.exe");
		// Initialize InternetExplorerDriver Instance. 
		 WebDriver driver = new InternetExplorerDriver(); 
		driver.get("https://www.amazon.com"); 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung"); 
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@id='desktop-sx-top-slot_widget_sims_k2p-featured-asin-widget']/div[2]/div[1]/div[2]/div[1]/a/img")).click(); 
		Select dropdown = new Select(driver.findElement(By.id("quantity")));
		
		
		dropdown.selectByVisibleText("11");

		
		//dropdown.selectByIndex(5);

		
		// dropdown.selectByValue("11");
		driver.findElement(By.name("freeTrialBBOP")).click(); 
		
		 driver.findElement(By.id("add-to-cart-button")).click();
		
		
		driver.get("https://www.facebook.com"); 	
		// WebDriver
		//driver.findElement(By.className("inputtext")).sendKeys("avk.509@gmail.com");
		
		//driver.findElement(By.className("inputtext")).sendKeys("MLOVE.ucm123");	
		
		//driver.findElement(By.("add-to-cart-button")).click();
		
		
	}
}


//.//*[@id='js_0']/div/div/div
