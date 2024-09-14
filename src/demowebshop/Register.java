package demowebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[href='/register']")).click();
		driver.findElement(By.cssSelector("input[id='gender-male']")).click();
		driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Sumeet");
		driver.findElement(By.cssSelector("input[id='LastName']")).sendKeys("Kumar");
		driver.findElement(By.cssSelector("input[id='Email']")).sendKeys("sumeet8246@gmail.com");
		driver.findElement(By.cssSelector("input[id='Password']")).sendKeys("sumeet8246");
		driver.findElement(By.cssSelector("input[id='ConfirmPassword']")).sendKeys("sumeet8246");
		driver.findElement(By.cssSelector("input[value='Register']")).click();
		driver.findElement(By.cssSelector("input[value='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a[href='/logout']")).click();
		
	}

}
