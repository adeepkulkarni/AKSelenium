package seleniumweb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sele2 {
	public static void main (String[]args)
	{
		try{
			System.setProperty("webdriver.chrome.driver","D:\\InpodsAutomation\\WebAPITesting\\JAR\\ChromeDriver2.33\\chromedriver.exe.");
			WebDriver drive5 = new ChromeDriver();
			drive5.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			drive5.get("http://www.seleniumeasy.com/test");
			drive5.findElement(By.xpath("(.//*[@id='navbar-brand-centered']//li[1])[1]")).click();
			Thread.sleep(2000);
			drive5.findElement(By.xpath(".//*[@href='./basic-checkbox-demo.html']")).click();
			Thread.sleep(3000);
			//drive5.findElement(By.xpath(" (.//*[@class='tree-indicator glyphicon glyphicon-chevron-right'])[1]")).click();
			//Thread.sleep(1000);
			//drive5.findElement(By.xpath(".//*[@href='./basic-checkbox-demo.html']")).click();
			//Thread.sleep(2500);
			drive5.findElement(By.xpath(".//*[@id='isAgeSelected']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@class='btn btn-primary']")).click();
			Thread.sleep(3000);
			drive5.findElement(By.xpath(".//*[@class='btn btn-primary']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath("(.//*[@class='cb1-element'])[1]")).click();
			Thread.sleep(2500);
			drive5.findElement(By.xpath("(.//*[@class='cb1-element'])[2]")).click();
			Thread.sleep(2500);
			drive5.findElement(By.xpath("(.//*[@class='cb1-element'])[3]")).click();
			Thread.sleep(2500);
			drive5.findElement(By.xpath("(.//*[@class='cb1-element'])[4]")).click();
			Thread.sleep(2500);
			Thread.sleep(3000);
			drive5.findElement(By.xpath(".//*[@class='btn btn-primary']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@class='btn btn-primary']")).click();
			Thread.sleep(1000);
}catch(Exception e6){}
		}
}


//