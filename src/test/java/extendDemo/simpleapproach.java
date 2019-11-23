package extendDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class simpleapproach {

	public static String main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-table/#");
		Thread.sleep(5000);
		
		String structure = "Financial Centre";
		
		String strRank = driver.findElement(By.xpath("//th[text()='" + structure + "']//following-sibling::td[5]")).getText();
		System.out.println(strRank);
		
		Thread.sleep(5000);
		
		driver.quit();
		
		return strRank;
		
		
		
		
	}

}
