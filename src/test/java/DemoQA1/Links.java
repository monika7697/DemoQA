package DemoQA1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {
	
	WebDriver driver;
	@Parameters ({"URL"})
	@Test
	public void L1(String URL) throws InterruptedException
	{
   WebDriverManager.chromedriver().setup();
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
   //driver.get("https://demoqa.com/elements");
   driver.get(URL);
   driver.findElement(By.xpath("//span[text()=\"Links\"]")).click();
   driver.findElement(By.id("simpleLink")).click();
   Thread.sleep(2000);
   Set<String> handles=driver.getWindowHandles();
   System.out.println(handles);
   Iterator<String> itr=handles.iterator();
   String mainWindow= itr.next();
   String childWindow=itr.next();
   Thread.sleep(2000);
   driver.switchTo().window(mainWindow);
   Thread.sleep(2000);
   JavascriptExecutor js = (JavascriptExecutor) driver;
   js.executeScript("window.scrollBy(0,250)","");
   driver.findElement(By.id("created")).click();
   Thread.sleep(2000);
   WebElement e = driver.findElement(By.id("linkResponse"));
   System.out.println(e.getText());
   Thread.sleep(2000);
   
   driver.quit();
}
}
