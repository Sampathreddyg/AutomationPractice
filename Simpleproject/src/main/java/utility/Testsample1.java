package utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Testsample1 {

	static Object dt;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pageTitle;
		DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd,HH.mm.ss");
	    //get current date time with Date()
	    Date date = new Date();
	    dt = dateFormat.format(date);
		Testsample1 ref = new Testsample1();
		
		System.out.println("Welcome to The New World");
		
		System.setProperty("webdriver.chrome.driver","target/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com");
		pageTitle = driver.getTitle();
		System.out.println(pageTitle+" Title Length: "+pageTitle.length());
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try {
		driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();
		}catch(NoSuchElementException e) {
			System.out.println(e.getStackTrace());
		}
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Biopic Books ", Keys.ENTER);;
		ref.pageScreenshot(driver, pageTitle);
		
		driver.navigate().to("https://www.myntra.com");
		pageTitle = driver.getTitle();
		System.out.println(pageTitle);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		try {
//		WebElement element = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
//		if (element.isDisplayed())
//			element.click();
//		}catch(NoSuchElementException e) {
//			System.out.println(e.getStackTrace());
//		}
		// get screenshot of full page
		ref.getFullPageScreenshot(driver, pageTitle);
		driver.quit();	
	}

	public void getFullPageScreenshot (WebDriver driver, String page) {
		Screenshot sc = 
				new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		 try {
             ImageIO.write(sc.getImage(),"PNG",new File("Screenshots\\"+page+dt+".png"));
         } catch (IOException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
	}
	
	public void pageScreenshot(WebDriver driver, String page) {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("Screenshots\\"+page+dt+".png"));
		}catch (IOException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}
	
}
