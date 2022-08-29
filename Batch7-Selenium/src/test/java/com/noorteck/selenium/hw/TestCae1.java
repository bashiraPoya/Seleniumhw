package com.noorteck.selenium.hw;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCae1 {
	public static void main(String[] args) {

		String url1 = "http://demo.guru99.com/test/simple_context_menu.html";

		String key = "webdriver.chrome.driver";
		String path = "C:\\Users\\bashi\\OneDrive\\Desktop\\B7-Selenium\\chromedriver.exe";

		System.setProperty(key, path);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(url1);

		WebElement el = driver.findElement(By.xpath("//*[contains(text(), 'right click me')]"));

		Actions action = new Actions(driver);

		action.contextClick(el).build().perform();

		WebElement el1 = driver.findElement(By.cssSelector(".context-menu-icon-copy"));

		el1.click();

		Alert alert = driver.switchTo().alert();

		String alertText = alert.getText();
		System.out.println("Alert Message: " + alertText);

		alert.accept();

		driver.quit();

	}
}