package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
           ChromeDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("http://leaftaps.com/opentaps/control/login");
           driver.findElement(By.id("username")).sendKeys("demoSalesManager");
           driver.findElement(By.id("password")).sendKeys("crmsfa");//decorativeSubmit
           driver.findElement(By.className("decorativeSubmit")).click();
           driver.findElement(By.linkText("CRM/SFA")).click();//
           driver.findElement(By.linkText("Leads")).click();//Create Lead
           driver.findElement(By.linkText("Create Lead")).click();//smallSubmit
           driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Blackstraw");
           driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swetha");//lastName
           driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
           driver.findElement(By.name("firstNameLocal")).sendKeys("swetha");//createLeadForm_firstNameLocal
           driver.findElement(By.name("departmentName")).sendKeys("MBA");
           driver.findElement(By.name("description")).sendKeys("I'm learning");
           driver.findElement(By.className("smallSubmit")).click();//smallSubmit
           String title = driver.getTitle();
   		   System.out.println(title);
             Thread.sleep(10000);
             driver.close();
           
           
           
	}
	
	
}

