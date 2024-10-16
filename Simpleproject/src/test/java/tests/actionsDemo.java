package tests;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class actionsDemo {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximized");
//		option.setBrowserVersion("115");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		System.out.println("Browser version " + option.getBrowserVersion());
		DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
		Date date = new Date();
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		driver.switchTo().frame("callout");
		driver.findElement(By.xpath("//button[@aria-label='Stay signed out']")).click();
		driver.switchTo().defaultContent();
		Actions action = new Actions(driver);
		WebElement gmail_link = driver.findElement(By.linkText("Gmail"));
		action.moveToElement(gmail_link);
//		action.click(gmail_link).perform();
//		driver.wait();
		action.contextClick(gmail_link).perform();
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(".\\Screenshots\\" + title + "_" + dateFormat.format(date) + ".png"));
		WebElement search = driver.findElement(By.xpath("//img[@alt='Google']"));
		action.contextClick(search).perform();
		driver.close();
	}

}
