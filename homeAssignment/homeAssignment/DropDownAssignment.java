//Create Account
package week2.homeAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("demoSalesManager");
		
		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		
		//Account Name
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("PrasannaLaxmi");
		
		//Description
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		
		//Industry 
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select opt = new Select(industry);
		opt.selectByVisibleText("Computer Software");
		
		//Ownership
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select opt2 = new Select(ownership);
		opt2.selectByVisibleText("S-Corporation");
		
		//Source
        WebElement source = driver.findElement(By.id("dataSourceId"));
        Select opt3 = new Select(source);
        opt3.selectByValue("LEAD_EMPLOYEE");
        
        //Marketing Campaign
        WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
        Select opt4 = new Select(marketing);
        opt4.selectByIndex(6);
        
        //State/Province
       WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select opt5 = new Select(state);
		opt5.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		Thread.sleep(5000);
		driver.close();
		
		
		

	}

}
