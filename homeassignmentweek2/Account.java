package homeassignmentweek2;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");	
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.className("x-panel-header")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("shanaccount");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("numberEmployees")).sendKeys("5");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println("page tile is:"+title);
		driver.close();
		
	}

}