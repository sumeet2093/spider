package demowebshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apparel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@href='/apparel-shoes']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@data-productid='28']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@data-productid='28']/div/div/div/input[@value='Add to cart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 add-to-cart-button']")).click();
		System.out.println("Added to cart");
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='removefromcart']")).click();
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		System.out.println("Removed from cart");
		}

}
