package DemoQA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Textbox {

	@Parameters ({"URL"})
	@Test
	public void Etext(String URL)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver.get("https://demoqa.com/elements");
		 driver.get(URL);
		//driver.findElement(By.xpath("//h5[text()=\"Elements\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Text Box\"]")).click();
		driver.findElement(By.id("userName")).sendKeys("automationTesting");
		driver.findElement(By.id("userEmail")).sendKeys("automationtesting@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("my current address");
		driver.findElement(By.id("permanentAddress")).sendKeys("my Permanent address");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("submit")).click();
		String textn = driver.findElement(By.id("name")).getText();
		String texte = driver.findElement(By.id("name")).getText();
		String textc = driver.findElement(By.id("name")).getText();
		String textp = driver.findElement(By.id("name")).getText();
		System.out.println(textn);
		System.out.println(texte);
		System.out.println(textc);
		System.out.println(textp);
		driver.quit();
		
	}
}
