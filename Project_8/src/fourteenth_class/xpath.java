//XPATH

package fourteenth_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jitender.ahuja\\Downloads\\Jar Files\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		/*//tag with single attribute (static)
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("abc");*/
		
		/*//tag with multiple attributes with or condition
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname' or @type='text']"));
		firstname.sendKeys("abc");*/
		
		/*//tag with multiple attributes with and condition
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname' and @type='text']"));
		firstname.sendKeys("abc");*/
		
		//tag with multiple attributes with and condition
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname' and @type='text']"));
		firstname.sendKeys("abc");
		
	}

}