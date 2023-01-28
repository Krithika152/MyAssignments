package seleniumassign.week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createcontact {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Primary");
		driver.findElement(By.id("lastNameField")).sendKeys("Contact1");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Keetz");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("K");
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Contact");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("k152@gmail.com");
		WebElement element1 = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd = new Select(element1);
		dd.selectByVisibleText("Alaska");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Contact");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("The Title is " +driver.getTitle());

	}

}
