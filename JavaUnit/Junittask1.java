package org.JavaUnit;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junittask1 {
	static WebDriver driver;
	@BeforeClass
	public static void BeforeClass() {
		driver=new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
	}
	@AfterClass
	public static void afterclass() {
		driver.quit();	
	}
	@Before
	public void beforemethod() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File file=new File("C:\\Users\\DELL\\eclipse-workspace\\selenium eclipse workspace\\DATADRIVEN_\\ScreenShot\\1st.png");
		FileUtils.copyFile(screenshotAs,file);
	}
	@After
	public void aftermethod() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File file=new File("C:\\Users\\DELL\\eclipse-workspace\\selenium eclipse workspace\\DATADRIVEN_\\ScreenShot\\2nd.png");
		FileUtils.copyFile(screenshotAs,file);
	}
	@Test
	public void login() {
		WebElement txtemail = driver.findElement(By.id("email"));
		txtemail.sendKeys("venkateshsel99@gmail.com");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("Selva@kamali1");
		WebElement txtlogin = driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
		txtlogin.click();
	}
	

		
	

}
