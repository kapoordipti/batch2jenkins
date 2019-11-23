package extendDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rightstartmath.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("document.querySelector(\"#search-3 > div > form > input.s.search-input\").value='abc'");
		
		
		//js.executeScript("document.querySelector(\"#text-3 > div > div > a:nth-child(1)\").setAttribute('style','border:3px solid red')");
		
		js.executeScript("document.querySelector(\"#text-14 > div > div > p > a\").scrollIntoView(true)");
		
		
		
		
		

	}

}
