package SeleniumPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutoSugg {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
		List<WebElement> allSugg = driver.findElements(By.xpath("//ul[text()='iphone']"));	
		int count = allSugg.size();

		System.out.println(count);
		for(int i=0; i<count; i++) {
			String text = allSugg.get(i).getText();
			System.out.println(text);
		}
		//allSugg.get(count).getText();
	}


}
