package org.JavaUnit;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junittask2 {
	static WebDriver driver;
	@BeforeClass
	public static void beforeclass() {
		driver=new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	}
	@Test
	public void login() throws InterruptedException {
		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("venkateshsel99@gmail.com");
		String username = txtusername.getAttribute("value");
		Assert.assertEquals("verify username", "venkateshsel99@gmail.com", username);
		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("Selva@kamali1");
		String password = txtpassword.getAttribute("value");
		Assert.assertEquals("verify password", "Selva@kamali1", password);
		WebElement clicklogin = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		clicklogin.click();
		Thread.sleep(3000);
		WebElement weluser = driver.findElement(By.xpath("//a[@data-testid='username']"));
		String text = weluser.getText();
		boolean contains = text.contains("Welcome Venkatesh");
		Assert.assertTrue("verify text", contains);
	}
	@AfterClass
	public static void afterclass() {
		driver.quit();

	}
	
	
	

}
