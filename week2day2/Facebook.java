package seleniumassign.week2day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Keetz");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("N");
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("8908778901");
		driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("welcome123");
		WebElement element = driver.findElement(By.name("birthday_day"));
		Select dd = new Select(element);
		dd.selectByIndex(7);
		WebElement element2 = driver.findElement(By.name("birthday_month"));
		Select dd1= new Select(element2);
		dd1.selectByIndex(2);
		WebElement element3 = driver.findElement(By.name("birthday_year"));
		Select dd2= new Select(element3);
		dd2.selectByIndex(10);
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		
		
		}

}
