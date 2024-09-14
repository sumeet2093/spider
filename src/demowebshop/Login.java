package demowebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[href='/login']")).click();
		driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("sumeet8246@gmail.com");
		driver.findElement(By.cssSelector("input[name='Password']")).sendKeys("sumeet8246");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[href='/logout']")).click();		
	}

}
