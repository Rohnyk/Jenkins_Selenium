package testselenium1;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
public class Test2 {
	  @Test
	  public void f() {
		  WebDriver driver;
		  System.setProperty("webdriver.chrome.driver","D:\\ME\\devops\\Testing\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.google.in/");
		  driver.findElement(By.name("q")).sendKeys("msis manipal");
		  driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		  driver.findElement(By.className("LC20lb DKV0Md")).click();
		  
		  
	  }
}
