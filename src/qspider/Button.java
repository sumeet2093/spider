package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(50000);
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Default Click']")).click();
		driver.findElement(By.xpath("//button[@id='btn']")).click();
		driver.findElement(By.xpath("//button[@id='btn2']")).click();
		driver.findElement(By.xpath("//button[@id='btn8']")).click();
		System.out.println("Successful");
}
}