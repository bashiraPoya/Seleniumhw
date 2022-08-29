package com.noorteck.selenium.hw;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase2 {

	public static void main(String[] args) {

		String url1 = "http://demo.guru99.com/test/simple_context_menu.html";

		String key = "webdriver.chrome.driver";
		String path = "C:\\Users\\bashi\\OneDrive\\Desktop\\B7-Selenium\\chromedriver.exe";

		System.setProperty(key, path);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(url1);

		WebElement el = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions action = new Actions(driver);
		action.doubleClick(el).perform();

		Alert alert = driver.switchTo().alert();

		String alertText = alert.getText();
		System.out.println("Alert Message: " + alertText);

		alert.accept();

		driver.quit();

	}
}