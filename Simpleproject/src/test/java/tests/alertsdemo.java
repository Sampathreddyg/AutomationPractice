package tests;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.basepack.Basepage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alertsdemo {

	WebDriver driver;

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/test");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(12));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
//		driverLaunch("https://letcode.in/alert");
		driver.findElement(By.xpath("//a[contains(text(),'Dialog')]")).click();
		driver.findElement(By.id("accept")).click();
		alertsdemo al = new alertsdemo();
		al.switchToAlert();
		driver.findElement(By.id("confirm")).click();
		al.switchToAlert();
		driver.close();
	}

	public void switchToAlert() {
		Alert simpleAlert = driver.switchTo().alert();
		System.out.println("Alert message : " + simpleAlert.getText());
		simpleAlert.accept();
	}

}
