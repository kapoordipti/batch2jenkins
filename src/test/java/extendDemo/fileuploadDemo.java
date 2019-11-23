package extendDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fileuploadDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("document.querySelector(\"#search-3 > div > form > input.s.search-input\").value='abc'");
		
		
		//js.executeScript("document.querySelector(\"#text-3 > div > div > a:nth-child(1)\").setAttribute('style','border:3px solid red')");
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		Thread.sleep(4000);
//		alert.accept();
		
		driver.findElement(By.xpath("//*[@data-cli_action=\"accept\"]")).click();
		
		js.executeScript("document.querySelector(\"#photo\").scrollIntoView(true)");
		
		js.executeScript("document.querySelector(\"#photo\").click()");
		
		StringSelection selection = new StringSelection("D:\\abc.jpg");
		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
		clip.setContents(selection, selection);
		
				
			
			Robot r = new Robot();
			Thread.sleep(5000);
			
			r.keyPress(KeyEvent.VK_CONTROL);
		
			r.keyPress(KeyEvent.VK_V);
		
			//driver.findElement(By.name("Open")).click();
			Actions actions = new Actions(driver);
			WebElement elementLocator = driver.findElement(By.id("Open"));
			actions.contextClick(elementLocator).perform();

		
		
	}

}
