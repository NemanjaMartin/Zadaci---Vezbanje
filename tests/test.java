package tests;

    
import domaci.Home;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



    

public class test {
	
	private static WebDriver driver;
	
	
	@BeforeClass
	public void createDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver- selenium\\chromedriver.exe");	
	        driver = new ChromeDriver();
	}
	
	@Test
	public void testNaviBack() {
		
		driver.navigate().to(Home.URL);
		driver.navigate().back();
		String currentUrl =  driver.getCurrentUrl();
		 System.out.println(currentUrl);
		 String expectedUrl = "data:,";
		 
		 Assert.assertEquals(currentUrl, expectedUrl);
		
	}
	
	@Test
	public void testForward() {
		driver.navigate().to(Home.URL);
		driver.navigate().back();
		driver.navigate().forward();
		String currnetUrl = driver.getCurrentUrl();
		
		String expectedUrl = "https://itbootcamp.rs/";
		
		Assert.assertEquals(currnetUrl,expectedUrl );	 
		 
	}
	
	@Test
	public void refreshtest() {
		driver.manage().window().maximize();
		driver.navigate().to(Home.URL);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().setPosition(new Point(50, 0));
		
		
	}
 
	@Test
	public void testSearchTestiranje() {
	driver.navigate().to(Home.URL);
	driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[2]/div/div/div[2]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[2]/div/div/form/div/div/input")).click();
	driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[2]/div/div/form/div/div/input")).sendKeys("testiranje");
	driver.findElement(By.xpath("//*[@id=\"masthead\"]/div[2]/div/div/form/div/div/input")).sendKeys(Keys.ENTER);
	driver.get("https://itbootcamp.rs/?s=testiranje");
	
	
	
	
	
	
	
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	try {
		FileUtils.copyFile(file, new File("C:/Users/Stefan/Desktop/screenshot/tets.png"));
	} catch (IOException e) {
	// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	
	}
	
	
	
	

}
