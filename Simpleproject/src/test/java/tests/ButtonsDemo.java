package tests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonsDemo {

	public static void main(String[] args) throws Throwable {
	
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximized");
		option.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://stackoverflow.com/questions/5686825/how-to-remove-unused-imports-from-eclipse");
		driver.findElement(By.xpath("//ol//a[text()='About']")).click();
//		Thread.sleep(2000);
		WebElement img = driver.findElement(By.xpath("//div[text()=' Visit Meta ']/..//*[name()='svg']/*[2]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(img));
		Actions act = new Actions(driver);
		act.click(img).perform();
		Thread.sleep(2000);
		driver.close();
		
	}
	
	
	
}