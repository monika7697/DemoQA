package DemoQA1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Forms {
	@Test
	public void forms() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://demoqa.com/forms");
		driver.findElement(By.xpath("//span[text()=\"Practice Form\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)", "");
		driver.findElement(By.id("firstName")).sendKeys("Monika");
		driver.findElement(By.id("lastName")).sendKeys("Mohite");
		js.executeScript("window.scroll(0,500)", "");
		driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("monikamohite@gmail.com");
		js.executeScript("window.scroll(0,500)", "");
		driver.findElement(By.xpath("//label[@for=\"gender-radio-2\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"userNumber\"]")).sendKeys("9876543210");
		js.executeScript("window.scroll(0,500)", "");
		driver.findElement(By.id("dateOfBirthInput")).click();
		driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"1997\"]")).click();
		driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]")).click();
		driver.findElement(By.xpath("//option[@value=\"5\"]")).click();
		driver.findElement(By.xpath("//div[@aria-label=\"Choose Saturday, June 7th, 1997\"]")).click();
		Thread.sleep(2000);
		/*WebElement d = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[6]/div[2]/div/div/div[1]"));
		//d.click();
		d.sendKeys("Ma");
		d.sendKeys(Keys.ENTER);
		d.sendKeys("Eng");
		d.sendKeys(Keys.ENTER);*/
		
		js.executeScript("window.scroll(0,500)", "");
		//driver.findElement(By.id("//input[@id=\"hobbies-checkbox-1\"]")).click();
		//driver.findElement(By.id("hobbies-checkbox-3")).click();
		//driver.findElement(By.id("uploadPicture")).click();
		driver.findElement(By.id("currentAddress")).sendKeys("Loni Kalbhor, Pune-412201");
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,250)", "");
		driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
		driver.quit();
	}

}
