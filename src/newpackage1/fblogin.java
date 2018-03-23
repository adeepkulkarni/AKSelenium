package newpackage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class fblogin {

		public static void main(String[] args) {
			
			try{
				System.setProperty("webdriver.chrome.driver","D:\\InpodsAutomation\\WebAPITesting\\JAR\\ChromeDriver2.33\\chromedriver.exe.");
				WebDriver drive2 = new ChromeDriver();
				drive2.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				drive2.get("https://www.facebook.com");
				drive2.findElement(By.xpath(".//*[@id='email']")).click();
				drive2.findElement(By.xpath(".//*[@id='email']")).sendKeys("jamesbond@hotmail.com");
				drive2.findElement(By.xpath(".//*[@id='pass']")).click();
				drive2.findElement(By.xpath(".//*[@id='pass']")).sendKeys("***********");
				drive2.findElement(By.xpath(".//*[@id='u_0_2']")).click();
				drive2.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
				
				
				//
				
				
					
				
				
				
				
				
				
				
}catch(Exception e1){}
		}
}
