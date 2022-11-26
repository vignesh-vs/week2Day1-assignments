package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		//setup browser driver
		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver  driver = new ChromeDriver ();
		
		//load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the browser window
      driver.manage().window().maximize();
     // driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
      driver.findElement(By.xpath("//input [@id= 'username']")).sendKeys("Demosalesmanager");
      //driver.findElement(By.id("password")).sendKeys("crmsfa");
      driver.findElement(By.xpath("//input [@id= 'password']")).sendKeys("crmsfa");
       driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
      //driver.findElement(By.linkText("CRM/SFA")).click();
       driver.findElement(By.partialLinkText("CRM")).click();
      //driver.findElement(By.linkText("Leads")).click();
       driver.findElement(By.partialLinkText("Leads")).click();
      driver.findElement(By.linkText("Create Lead")).click();
      driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTL");
      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vignesh");
      driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sulaga");
      driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("VIG");
      driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("BANKING");
      driver.findElement(By.id("createLeadForm_description")).sendKeys("DESCRIPTION");
      driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@test.com");
            
      WebElement eleTool = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
      Select dd = new Select(eleTool);          
      dd.selectByVisibleText("New York");         
      driver.findElement(By.className("smallSubmit")).click();
       System.out.println("The Title of Resulting Page...."+ driver.getTitle());         
      
	}

}
