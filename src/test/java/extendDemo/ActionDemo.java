package extendDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rightstartmath.com/");
		Thread.sleep(5000);
		
		WebElement eleCur = driver.findElement(By.xpath("//a[text()='Curriculum']"));
				Actions act = new Actions(driver);
				
				act.moveToElement(eleCur).build().perform();
				
				WebElement eleResearch = driver.findElement(By.xpath("(//a[text()='Research'])[1]"));	
				
				act.moveToElement(eleResearch).click(eleResearch).build().perform();

	}

}
