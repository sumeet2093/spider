package Autofacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selefacebook {
	

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("sumeet8242@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("hirarani");
		driver.findElement(By.name("login")).click();
		Thread.sleep(10000);
		driver.quit();
		
		// TODO Auto-generated method stub

	}

}
