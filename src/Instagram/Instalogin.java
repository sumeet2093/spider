package Instagram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instalogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("sumeet27061136@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("radhaswamy");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Not now']")).click();
		//driver.findElement(By.xpath("//button[text()='Not now']")).click();
		driver.findElement(By.xpath("//span[text()='Search']")).click();
	}

}
