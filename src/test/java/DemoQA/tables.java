package DemoQA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tables {
	@Parameters ({"URL"})
	@Test
	public void ERadio(String URL) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver.get("https://demoqa.com/elements");
		 driver.get(URL);
	driver.findElement(By.xpath("//span[text()=\"Web Tables\"]")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("addNewRecordButton")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("firstName")).sendKeys("Automation");
	driver.findElement(By.id("lastName")).sendKeys("Testing");
	driver.findElement(By.id("userEmail")).sendKeys("auto.test@mail.com");
	driver.findElement(By.id("age")).sendKeys("25");
	driver.findElement(By.id("salary")).sendKeys("20000");
	driver.findElement(By.id("department")).sendKeys("testing");
	Thread.sleep(2000);
	driver.findElement(By.id("submit")).click();

	Thread.sleep(2000);
	String data = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]")).getText();
	System.out.println(data);
	
	
	driver.quit();
}
}
