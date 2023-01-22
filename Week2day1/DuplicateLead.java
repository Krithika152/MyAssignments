package Assignments.Week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Solartis");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Krithika");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Team Lead");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kk@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		WebElement element = driver.findElement(By.id("createLeadForm_companyName"));
		element.clear();
		element.sendKeys("Solar");
		WebElement element2 = driver.findElement(By.id("createLeadForm_firstName"));
		element2.clear();
		element2.sendKeys("Niru");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The Title is " + driver.getTitle());

	}

}
