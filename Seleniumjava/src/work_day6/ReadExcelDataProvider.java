
package work_day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelDataProvider {
	public WebDriver driver;
	public WebDriverWait wait;
	String appURL = "https://www.linkedin.com/";
	
	//Locators
	private By byEmail = By.id("session_key-login");
	private By byPassword = By.id("session_password-login");
	private By bySubmit = By.id("signin");
	private By byError = By.id("global-alert-queue");
	
	@BeforeClass
	public void testSetup() {
		System.setProperty("webdriver.chrome.driver", "C://Selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 5);
	}
	

	@Test(dataProvider="empLogin")
	public void VerifyInvalidLogin(String userName, String password) {
		driver.navigate().to(appURL);
		driver.findElement(byEmail).sendKeys(userName);
		driver.findElement(byPassword).sendKeys(password);
		//wait for element to be visible and perform click
		wait.until(ExpectedConditions.visibilityOfElementLocated(bySubmit));
		driver.findElement(bySubmit).click();
		
		//Check for error message
		wait.until(ExpectedConditions.presenceOfElementLocated(byError));
		String actualErrorDisplayed = driver.findElement(byError).getText();
		String requiredErrorMessage = "Please correct the marked field(s) below.";
		Assert.assertEquals(requiredErrorMessage, actualErrorDisplayed);
		
	}
	
	@DataProvider(name="empLogin")
	public Object[][] loginData() {
		Object[][] arrayObject = getExcelData("D:/sampledoc.xlsx","Sheet1");
		return arrayObject;
	}

	/**
	 * @param File Name
	 * @param Sheet Name
	 * @return
	 */
	public String[][] getExcelData(String fileName, String sheetName) {
		String[][] arrayExcelData = null;
		try {
			FileInputStream fs = new FileInputStream(fileName);
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet(sheetName);

			int totalNoOfCols = sh.getColumns();
			int totalNoOfRows = sh.getRows();
			
			arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
			
			for (int i= 1 ; i < totalNoOfRows; i++) {

				for (int j=0; j < totalNoOfCols; j++) {
					arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		}
		return arrayExcelData;
	}

	@Test
	public void tearDown() {
		driver.quit();
	}
}