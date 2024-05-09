package TestNG_Programming;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FrameSwitchingBetweenByIndex {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void init()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://docs.oracle.com/javase/docs/api/");
	}
	
	@AfterTest
	public void close()
	{
		driver.quit();
		
	}
	
	@Test
	public void switchingBetweenByIndex()
	{
		List<WebElement> frameCount = driver.findElements(By.tagName("frame"));
		int size = frameCount.size();
		System.out.println(size);
	}
	
	
	

}
