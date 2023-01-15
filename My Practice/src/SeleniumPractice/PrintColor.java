package SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintColor {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String color = driver.findElement(By.linkText("Forgotten password?")).getCssValue("color");
		String fontSize = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-Size");
		String fontType = driver.findElement(By.linkText("Forgotten password?")).getCssValue("font-family");
		System.out.println(color);
		System.out.println(fontSize);
		System.out.println(fontType);
		driver.close();

	}

}
