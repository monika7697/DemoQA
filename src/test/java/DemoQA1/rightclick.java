package DemoQA1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
public class rightclick {
public void rightclick() throws InterruptedException {

WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
driver.get("https://demoqa.com/buttons");
//WebElement W1 = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
WebElement W2 = driver.findElement(By.xpath("//button[text()='Right Click Me']"));
Actions A=new Actions(driver);

Thread.sleep(3000);
//A.doubleClick(W1).perform();//right
A.contextClick( W2).perform();

/*Thread.sleep(3000);
//driver.quit();
System.setProperty("webdriver.chrome.driver","C:\\Users\\Asus\\eclipseworkspace\\SeleniumTutorial\\Driver\\chromedriver.exe");
WebDriver drive=new ChromeDriver();
drive.manage().window().maximize();
drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
drive.get("https://sellglobal.ebay.in/seller-center/#");
WebElement W1 = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
Actions A=new Actions(driver);
Thread.sleep(3000);
A.contextClick( W2).perform();*/
}}
