package tests;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectClassdemo {
	@Test
	public void webpageopen() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/dropdowns");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(8));
		Select drop = new Select(driver.findElement(By.id("superheros")));
		List<WebElement> fruit = drop.getOptions();
		drop.selectByIndex(2);
		drop.selectByIndex(5);
		drop.selectByIndex(7);
		drop.selectByIndex(28);
		drop.deselectAll();
		List<WebElement> fruit1 = drop.getAllSelectedOptions();
		System.out.println("No of options "+fruit.size());
		for (WebElement f:fruit1	) {
			System.out.println(f.getText());
		}
		if(fruit1.isEmpty()) {
			System.out.println("No options were selected");
		}
		Select drop1 = new Select(driver.findElement(By.id("fruits")));
		if(drop1.isMultiple()) {
			System.out.println("It is Multiple dropdown");
		}else {
			System.out.println("It is Single dropdown");
		}
		List<WebElement> options = drop1.getOptions();	
		for(WebElement ele:options) {
			String fru = ele.getText();
//			System.out.println(fru);
			if(fru.equalsIgnoreCase("MANGO")) {
				ele.click();
				System.out.println(ele.getText()+" Element selected : "+ele.isSelected());
				break;
			}
		}
		Thread.sleep(5000);
		driver.close();
	}


}
