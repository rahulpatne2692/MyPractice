package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllOptionMtr {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///G:/QSPIDER/Selenium/My%20Practice/Hotel.html");
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Thread.sleep(3000);
		Select s = new Select(mtrListBox);
		List<WebElement> allOptions = s.getOptions();
		int count=allOptions
				.size();
		for(int i=0;i<count;i++) {
			s.selectByIndex(i);
		}
		driver.close();        
		
		
	}

}
