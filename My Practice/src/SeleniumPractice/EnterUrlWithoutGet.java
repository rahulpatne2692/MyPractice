package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterUrlWithoutGet {
static {
	System.setProperty("webdriver.chrome.driver","./driver.chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.gmail.com/");
		Thread.sleep(2000);
		
		
		
		
		
	}

}
