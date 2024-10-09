package webTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableDemo1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(12));
		driver.get("http://letcode.in/table");
//		WebElement table =driver.findElement(By.id("shopping"));
		WebElement table = driver.findElement(By.id("simpletable"));
		WebElement text = driver.findElement(By.xpath("//p[contains(text(),'Check if the sorting')]"));

		Actions action = new Actions(driver);
		action.moveToElement(text).perform();

		List<WebElement> table_head = table.findElements(By.tagName("thead"));

		for (WebElement head : table_head) {
			System.out.println(head.getText());
		}
		List<WebElement> table_row = table.findElements(By.cssSelector("tbody>tr"));
		for (WebElement head : table_row) {
			System.out.println(head.getText());
		}

		driver.close();
	}
}
