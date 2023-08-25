package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1Week4 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();//
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();//ext-gen601
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();//
		driver.findElement(By.xpath("//table[@name='ComboBox_partyIdFrom']/following-sibling::a/img")).click();//(//tbody/tr/td[@tabindex='0']/div/a[@class='linktext'])[1]
		Set<String> contacts1 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<String>(contacts1);
		driver.switchTo().window(list1.get(1));
		driver.findElement(By.xpath("(//tbody/tr/td[@tabindex='0']/div/a)[1]")).click();//
		driver.switchTo().window(list1.get(0));
		driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']/following-sibling::a/img")).click();
		Set<String> contacts2 = driver.getWindowHandles();
		List<String> list2 = new ArrayList<String>(contacts2);
		driver.switchTo().window(list2.get(1));////td[@tabindex='0']/div/a[text()='11329']
		driver.findElement(By.xpath("//tbody/tr/td[@tabindex='0']/div/a[text()='DemoLBCust']")).click();//
		driver.switchTo().window(list1.get(0));//Merge
		driver.findElement(By.className("buttonDangerous")).click();
		driver.switchTo().alert().accept();
	}

}
