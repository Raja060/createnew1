package org.tcs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actionsample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\P.C.RajA\\eclipse-workspace\\org.tcs\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		WebElement findElement = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life']"));
		String text = findElement.getText();
		System.out.println(text);
		boolean contains = text.contains("people");
		System.out.println(contains);
		driver.close();
		
	}

}
