package domaci;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lokatori {
	
	public static final String URL = "http://demo.guru99.com/test/newtours/";
	public static final String REGISTER_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a";
	public static final String TXTNAME_XPATH = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[2]/td[2]/input";
	public static final String ADDRESSNAME = "address1";
	public static final String CITYNAME = "city";


	public static void main(String[] args) {
		
		
		  System.setProperty("webdriver.chrome.driver", "C:\\Chrome driver- selenium\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			
			driver.get(URL);
			
			WebElement register = driver.findElement(By.linkText("REGISTER"));
			
			register.click();
			
			
			WebElement address = driver.findElement(By.name(ADDRESSNAME));
			
			address.sendKeys("atresa");
			
		    WebElement city = driver.findElement(By.name("city"));
		    
		    city.sendKeys("Belgradoooo");
		    
		    
		    
		    
			 
			
			
			
			
			

	}

}
