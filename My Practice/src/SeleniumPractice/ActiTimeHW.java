package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class ActiTimeHW {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement us = driver.findElement(By.name("username"));
		int h1 = us.getSize().getHeight();
		int w1 = us.getSize().getWidth();
		WebElement pwd = driver.findElement(By.name("pwd"));
		int h2 = pwd.getSize().getHeight();
		int w2 = pwd.getSize().getWidth();
		if
		(h1==h2&&w1==w2) {
		System.out.println("Height and width is same");
		}
		else{
			System.out.println("height and width is diffrent");
		}
		driver.close();
	}

}
