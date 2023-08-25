package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2Week4 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://buythevalue.in/");
		WebElement FstProduct = driver.findElement(By.xpath("(//a[@class='product-title'])[7]"));

		Actions acc = new Actions(driver);
		acc.scrollByAmount(0, 700).click(FstProduct).perform();
		driver.findElement(By.name("wk_zipcode")).sendKeys("602026");
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		driver.findElement(By.xpath("//button[@name='add']")).click();
		Thread.sleep(4000);
		WebElement ViewButton = driver.findElement(By.xpath("(//a[text()='View Cart'])[1]"));

		// Javascript method
		// Due to improper handling of dom , elementinterceptor /javascript exception

		driver.executeScript("arguments[0].click();", ViewButton);

		driver.findElement(By.xpath("//input[@id='checkout']")).click();

		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		alert.accept();

		driver.close();

	}
}