package websitehosting.cicdautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class wh_test1 {
	public static WebDriver driver;
	@Test
	public void test1()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://localhost:8080/websitehosting");
		String tagname = driver.findElement(By.tagName("h2")).getText();
		System.out.println("CICD - Automation");
		Assert.assertEquals(tagname, "We are trying Continuous integration and development");			
		
	}

}
