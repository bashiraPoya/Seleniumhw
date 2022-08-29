package com.noorteck.selenium.hw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase5 {

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
		
		WebElement el4 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a"));
		el4.click();
		
		WebElement el5 = driver.findElement(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[2]"));
		el5.sendKeys("00016");

		WebElement el6 = driver.findElement(By.xpath("//div[@class='oxd-grid-4 orangehrm-full-width-grid']/div[3]"));
		el6.click();

		WebElement el7 = driver.findElement(By.xpath("//div[@role='listbox']"));

		el7.findElement(By.xpath(".//*[contains(text(), 'Full-Time Permanent')]")).click();
		
		WebElement el8 = driver.findElement(By.xpath("//button[@type = 'submit']"));
		el8.click();
		
		driver.quit();
				

	}
}