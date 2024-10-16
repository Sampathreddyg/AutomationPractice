package utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonDemo {

	public static void main(String[] args) throws IOException {

		String dir = System.getProperty("user.dir");
		File fi = new File(dir+"\\config.properties");
		BufferedReader br = new BufferedReader(new FileReader(fi));
		Properties pr = new Properties();
		pr.load(br);
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("start-maximized");
		opt.setBrowserVersion("113");
		WebDriver driver = new ChromeDriver(opt);
		driver.get(pr.getProperty("url"));
		System.out.println("Page Title : "+driver.getTitle());
		driver.quit();
		
	}

}
