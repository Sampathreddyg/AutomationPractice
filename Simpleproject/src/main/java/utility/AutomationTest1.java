package utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTest1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		FileReader fr = new FileReader("C:\\Users\\mouni\\eclipse-workspace\\Simpleproject\\config.properties");
		Properties pr = new Properties();
		pr.load(fr);
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		String link = pr.getProperty("URL");
		driver.get(link);
		String xp = pr.getProperty("mentab");
		String cs = driver.findElement(By.xpath(xp)).getText();
		System.out.println("Tab Name - "+cs);
		Thread.sleep(6000);
		driver.close();
	}

}
