import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basic {
	static
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

	}
	WebDriver driver ;
	@BeforeTest
	public void setUp() {

		driver = new ChromeDriver();

	
	driver.get("http://www.google.com");
	}
	
	@Test
	public void testGoogleSearch() {
	
	WebElement element = driver.findElement(By.name("q"));
	// Clear the existing text value
	element.clear();
	// Enter something to search for
	element.sendKeys("Selenium testing tools cookbook");
	// Now submit the form
	element.submit();
	
   
	}
	
	@AfterTest
	public void tearDown()  {

	driver.quit();
	}
	
}
