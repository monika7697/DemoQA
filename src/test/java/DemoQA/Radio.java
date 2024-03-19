package DemoQA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {
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
		driver.findElement(By.xpath("//span[text()=\"Radio Button\"]")).click();
		driver.findElement(By.xpath("//label[@for=\"yesRadio\"]")).click();
		Thread.sleep(3000);
		String out = driver.findElement(By.className("mt-3")).getText();
		System.out.println(out);
		driver.quit();

	}
}
