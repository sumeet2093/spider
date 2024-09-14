package qspider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(50000);
		driver.findElement(By.xpath("//li[text()='With placeholder']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Sumeet8242");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("sumeet8242@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sumeet8242");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
