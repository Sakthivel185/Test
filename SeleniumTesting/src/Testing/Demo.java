package Testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
//comment4
public class Demo {
	WebDriver driver;
	XSSFSheet sheet;
	XSSFWorkbook book;
	 Logger logger=Logger.getLogger("Demo.class");
	 
	
  @Test
  public void f() {
	  WebElement element;
	  Select select;
	  WebDriverWait wait= new WebDriverWait(driver,10);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id")));
  }
  @BeforeMethod
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.youtube.com/");
	  driver.manage().window().maximize();
	  PropertyConfigurator.configure("src\\log4j.properties");
	 logger.info(driver.getTitle());
  }

  @AfterClass
  public void afterClass() {
  }

}
