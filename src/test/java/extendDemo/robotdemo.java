package extendDemo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class robotdemo {

	public static <robot> void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		Thread.sleep(5000);
		
		StringSelection selection = new StringSelection("D:\\abc.jpg");
	Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
	clip.setContents(selection, selection);
	
		
		Robot r = new Robot();
		Thread.sleep(5000);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		
	}

}
