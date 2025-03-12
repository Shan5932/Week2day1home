package homeassignmentweek2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {

	public static void main(String[] args) {
		
		
		FirefoxDriver driver = new FirefoxDriver();
	
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");	
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("shan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("mani");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("PTPL");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("testleaf");
		driver.findElement(By.name("generalProfTitle")).sendKeys("Welcome to test");
		driver.findElement(By.name("submitButton")).click();
		driver.getTitle();
		driver.close();
		}

}
