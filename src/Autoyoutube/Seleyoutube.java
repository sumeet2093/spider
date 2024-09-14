package Autoyoutube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Seleyoutube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","./softwares/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[id='search']")).sendKeys("salaar");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button[id='search-icon-legacy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("img[src='https://i.ytimg.com/vi/HihakYi5M2I/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBtZ4_XY1IR6vchl1JnEpfMzsjItg']")).click();
		//driver.findElement(By.className("style-scope ytd-video-renderer")).click();

	}

}
