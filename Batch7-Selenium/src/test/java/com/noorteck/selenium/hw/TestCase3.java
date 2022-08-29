package com.noorteck.selenium.hw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestCase3 {

	public static void main(String[] args) throws InterruptedException {

		String url1 = "http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";

		String key = "webdriver.chrome.driver";
		String path = "C:\\Users\\bashi\\OneDrive\\Desktop\\B7-Selenium\\chromedriver.exe";

		System.setProperty(key, path);

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get(url1);

		WebElement el1 = driver.findElement(By.xpath("//*[@id='box6']"));
		WebElement el2 = driver.findElement(By.xpath("//*[@id='box7']"));
		WebElement el3 = driver.findElement(By.xpath("//*[@id='box1']"));
		WebElement el4 = driver.findElement(By.xpath("//*[@id='box4']"));
		WebElement el5 = driver.findElement(By.xpath("//*[@id='box5']"));
		WebElement el6 = driver.findElement(By.xpath("//*[@id='box2']"));
		WebElement el7 = driver.findElement(By.xpath("//*[@id='box3']"));

		WebElement country1 = driver.findElement(By.xpath("//*[@id='box106']"));
		WebElement country2 = driver.findElement(By.xpath("//*[@id='box107']"));
		WebElement country3 = driver.findElement(By.xpath("//*[@id='box101']"));
		WebElement country4 = driver.findElement(By.xpath("//*[@id='box104']"));
		WebElement country5 = driver.findElement(By.xpath("//*[@id='box105']"));
		WebElement country6 = driver.findElement(By.xpath("//*[@id='box102']"));
		WebElement country7 = driver.findElement(By.xpath("//*[@id='box106']"));

		Actions action = new Actions(driver);

		action.clickAndHold(el1).moveToElement(country1).release().build().perform();
		Thread.sleep(1000);
		action.clickAndHold(el2).moveToElement(country2).release().build().perform();
		Thread.sleep(1000);
		action.clickAndHold(el3).moveToElement(country3).release().build().perform();
		Thread.sleep(1000);
		action.clickAndHold(el4).moveToElement(country4).release().build().perform();
		Thread.sleep(1000);
		action.clickAndHold(el5).moveToElement(country5).release().build().perform();
		Thread.sleep(1000);
		action.clickAndHold(el6).moveToElement(country6).release().build().perform();
		Thread.sleep(1000);
		action.clickAndHold(el7).moveToElement(country7).release().build().perform();
		Thread.sleep(1000);

		System.out.println("Done");

		driver.quit();

	}
}