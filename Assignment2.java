package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/login");
         driver.findElement(By.id("username")).sendKeys("demoSalesManager");
         driver.findElement(By.id("password")).sendKeys("crmsfa");
         driver.findElement(By.className("decorativeSubmit")).click();
         driver.findElement(By.linkText("CRM/SFA")).click();
         driver.findElement(By.linkText("Leads")).click();
         driver.findElement(By.linkText("Create Lead")).click();
         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Blackstraw");
         driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swetha");
         driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
         driver.findElement(By.name("firstNameLocal")).sendKeys("swetha");
         driver.findElement(By.name("departmentName")).sendKeys("MBA");
         driver.findElement(By.name("description")).sendKeys("I'm learning");
         
         WebElement findElement = driver.findElement(By.id("createLeadForm_primaryEmail"));
         findElement.sendKeys("swethamay2000@gmail.com");//.sendKeys("swethamay2000@gmail.com");
         
         driver.findElement(By.name("submitButton")).click();
         Thread.sleep(3000);
         driver.findElement(By.linkText("Edit")).click();
         Thread.sleep(3000);

         driver.findElement(By.name("description")).clear();//importantNote
         Thread.sleep(3000);

         driver.findElement(By.name("importantNote")).sendKeys("Choose kind , be kind");//smallSubmit
         Thread.sleep(3000);

         driver.findElement(By.className("smallSubmit")).click();
         Thread.sleep(3000);

       //  String title = driver.getTitle();
 		// System.out.println(title);

         
         

	}

}
