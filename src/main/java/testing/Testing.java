package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","G:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(5000);
		
	    WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
	    
	    firstname.sendKeys("Archit");
	    
	    WebElement Lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
	    
	    Lastname.sendKeys("Shrivastava");
	    
	    WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
	    
	    email.sendKeys("architshrivastava509@gmail.com");
	    

	}

}
