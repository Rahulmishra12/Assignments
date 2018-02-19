package virgo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;

public class VirgoTest {
	
	public static void main(String args[]){

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amol\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://virgoinnovations.com/Virgo/#/app/register");
		driver.manage().window().maximize();
		driver.findElement(By.name("EmailId")).sendKeys("v@mailinator.com");
		driver.findElement(By.name("password")).sendKeys("Rahul123");
		driver.findElement(By.name("password_confirmation")).sendKeys("Rahul123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//button//b")).click();
		driver.findElement(By.id("LoginID")).click();
		driver.findElement(By.id("login-password")).click();

	} 


}
