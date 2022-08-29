package com.noorteck.selenium.hw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class TestCase4 {
	public static void main(String[] args) throws InterruptedException {

		String url1 = "https://opensource-demo.orangehrmlive.com";
		
		String key = "webdriver.chrome.driver";
		String path = "C:\\Users\\bashi\\OneDrive\\Desktop\\B7-Selenium\\chromedriver.exe";

		System.setProperty(key, path);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(url1);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement el1 = driver.findElement(By.xpath("//input[@name = 'username']"));
		el1.sendKeys("Admin");
		
		WebElement el2 = driver.findElement(By.xpath("//input[@placeholder = 'Password']"));
		el2.sendKeys("admin123");
		
		WebElement el3 = driver.findElement(By.xpath("//button[@type = 'submit']"));
		el3.click();
		
	//	Alert alert = driver.switchTo().alert();
	//	alert.accept();
		
		WebElement el4 = driver.findElement(By.xpath("//span[text() = 'Admin']"));
		el4.click();
		
		WebElement el5 = driver.findElement(By.xpath("//span[text() = 'Job ']"));
		
		el5.click();
		
       WebElement el6 = driver.findElement(By.xpath("//a[text() = 'Job Titles']"));
		
		el6.click();
		
		WebElement el7 = driver.findElement(By.xpath("//button[@class = 'oxd-button oxd-button--medium oxd-button--secondary']"));
		el7.click();
		
		WebElement el8 = driver.findElement(By.xpath("//form[@class = 'oxd-form']/div[1]//input"));
		el8.sendKeys("SDET");
		
		WebElement el9 = driver.findElement(By.xpath("//textarea[@placeholder = 'Type description here']"));
		el9.sendKeys("Software Development Engineer in Test");
		
		WebElement el10 = driver.findElement(By.xpath("//textarea[@placeholder = 'Add note']"));
		el10.sendKeys("I am qualified for SDET");
		
		WebElement el11 = driver.findElement(By.xpath("//button[@type = 'submit']"));
		el11.click();
		
	    String actual = driver.findElement(By.xpath("//div[contains(text(), 'SDET')]")).getText();
		String expected = "SDET";
		
		Assert.assertEquals(actual, expected, " Failed ");
		
		
		driver.quit();

}
}