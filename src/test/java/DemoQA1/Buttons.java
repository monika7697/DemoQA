package DemoQA1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {
	WebDriver driver;
	@Parameters ({"URL"})
	@Test
	public void doubleclick(String URL) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver.get("https://demoqa.com/elements");
		 driver.get(URL);
		driver.findElement(By.xpath("//*[@id=\"item-4\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		WebElement dc = driver.findElement(By.id("doubleClickBtn"));
		Actions a = new Actions(driver);
		a.doubleClick(dc).perform();
		Thread.sleep(3000);
		String text = driver.findElement(By.id("doubleClickMessage")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//button[text()=\"Click Me\"]")).click();
		String text1 = driver.findElement(By.id("dynamicClickMessage")).getText();
		System.out.println(text1);
		Thread.sleep(3000);
		WebElement rc = driver.findElement(By.xpath("//button[text()=\"Right Click Me\"]"));
		Actions b = new Actions(driver);
		b.contextClick(rc).perform();
		String text2 = driver.findElement(By.id("rightClickMessage")).getText();
		System.out.println(text2);
		Thread.sleep(3000);
		
		driver.quit();
	}
	
}