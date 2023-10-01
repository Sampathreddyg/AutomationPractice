package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLinks {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(option);
		driver.get("http:/google.com");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("Number of Links "+list.size());
		for(WebElement x:list) {
			System.out.println("Links Text "+x.getAttribute("href"));
		}
		list.get(14).click();
		
		Thread.sleep(5000);
//		driver.close();
	}

}
