package seleniumweb;

import java.util.concurrent.TimeUnit;     

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class sele5 {
	public static void main (String[]args)
	{
		try{
			System.setProperty("webdriver.chrome.driver","D:\\InpodsAutomation\\WebAPITesting\\JAR\\ChromeDriver2.33\\chromedriver.exe.");
			WebDriver drive5 = new ChromeDriver();
			drive5.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			drive5.get("http://www.seleniumeasy.com/test");
			drive5.findElement(By.xpath("(.//*[@id='navbar-brand-centered']//li[1])[1]")).click();
			Thread.sleep(2000);
			drive5.findElement(By.xpath(".//*[@href='./basic-select-dropdown-demo.html']")).click();
			Thread.sleep(3000);
			drive5.findElement(By.xpath(".//*[@id='select-demo']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@value='Monday']")).click();
			Thread.sleep(1000);
			
             WebElement e=drive5.findElement(By.xpath(".//*[@value='California']"));
             WebElement e2=drive5.findElement(By.xpath(".//*[@value='Florida']"));
             WebElement e3=drive5.findElement(By.xpath(".//*[@id='multi-select']"));
             WebElement e4=drive5.findElement(By.xpath(".//*[@value='New Jersey']"));
             e4.click();
             Actions builder = new Actions(drive5);
            
             builder.moveToElement(e3).keyDown(e3,Keys.CONTROL)
             .build();
             builder.perform();
                   e.click();
                   e2.click();
                   builder.moveToElement(e3) .keyUp(Keys.CONTROL)
                    .build();
             builder.perform();
             
			Thread.sleep(1000);
			//drive5.findElement(By.xpath(".//*[@value='15 - 50']")).click();
			//Thread.sleep(1000);
			//Actions b = new Actions(drive5);
			drive5.findElement(By.xpath(".//*[@id='printMe']")).click();
			
                    
			Thread.sleep(2000);
}catch(Exception e7){e7.printStackTrace();}
		}
	
}







/*
package seleniumweb;



public class sele3 {
	public static void main (String[]args)
	{
		try{
			System.setProperty("webdriver.chrome.driver","D:\\InpodsAutomation\\WebAPITesting\\JAR\\ChromeDriver2.33\\chromedriver.exe.");
			WebDriver drive5 = new ChromeDriver();
			drive5.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			drive5.get("http://www.seleniumeasy.com/test");
			drive5.findElement(By.xpath("(.//*[@id='navbar-brand-centered']//li[1])[1]")).click();
			Thread.sleep(2000);
			drive5.findElement(By.xpath(".//*[@href='./basic-radiobutton-demo.html']")).click();
			Thread.sleep(3000);
			drive5.findElement(By.xpath("(.//*[@value='Female'])[1]")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath("(.//*[@class='btn btn-default'])[1]")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath("(.//*[@value='Male'])[2]")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@value='15 - 50']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@onclick='getValues();']")).click();
			Thread.sleep(2000);
}catch(Exception e7){}
		}
	}
*/