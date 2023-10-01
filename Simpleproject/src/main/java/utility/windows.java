package utility;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windows {

	public static void main(String[] arg) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.in/");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		// System.out.println("Window Size : "+driver.manage().window().getSize());
		driver.switchTo().frame("callout").findElement(By.xpath("//button[@jsname='ZUkOIc']")).click();
		Set<Cookie> cookiesList = driver.manage().getCookies();
		for (Cookie cook : cookiesList) {
			System.out.println(cook);
		}
		System.out.println("List of cookies");
		driver.manage().window().setPosition(new Point(200, 150));
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(1000, 550));
		Thread.sleep(5000);
		driver.close();
	}
}
