package DemoQA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox {
	@Parameters ({"URL"})
	@Test
	public void Echeck(String URL) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver.get("https://demoqa.com/elements");
		 driver.get(URL);
		driver.findElement(By.xpath("//span[text()=\"Check Box\"]")).click();
		driver.findElement(By.className("rct-title")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.id("result")).getText();
		System.out.println(text);
		driver.quit();
}
}
