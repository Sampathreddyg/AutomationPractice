package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import com.basepack.Basepage;

public class radiobuttonsdemo extends Basepage {
	
	WebDriver driver = new ChromeDriver((ChromeDriverService) driverLaunch());
	
	public static void main(String[] args) {

		driverLaunch();

	}

}
