package utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectorDemo {

	static String text = "iphone 14";
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		WebElement closeBtn =  driver.findElement(By.xpath("//span[@role='button']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(text);
		
		
		Thread.sleep(3000);
		
		driver.close();
	}

}