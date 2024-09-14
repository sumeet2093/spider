package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(50000);
		driver.findElement(By.xpath("//section[text()='Link']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Default Link']")).click();
		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		driver.findElement(By.xpath("//section[text()='Link']")).click();
		driver.findElement(By.xpath("//a[text()='Payments']")).click();
		driver.findElement(By.xpath("//section[text()='Link']")).click();
		driver.findElement(By.xpath("//a[text()='Return Policy']")).click();
		driver.findElement(By.xpath("//section[text()='Link']")).click();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		driver.findElement(By.xpath("//section[text()='Link']")).click();
		System.out.println("Successful");
	}

}
