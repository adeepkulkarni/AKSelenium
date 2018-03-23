package seleniumweb;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sele1 {
	
	public static void main (String[]args)
	{
		try{
			System.setProperty("webdriver.chrome.driver","D:\\InpodsAutomation\\WebAPITesting\\JAR\\ChromeDriver2.33\\chromedriver.exe.");
			WebDriver drive5 = new ChromeDriver();
			drive5.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			drive5.get("http://www.seleniumeasy.com/test");
			drive5.findElement(By.xpath("(.//*[@id='navbar-brand-centered']//li[1])[1]")).click();
			Thread.sleep(2000);
			drive5.findElement(By.xpath(" (.//*[@href='./basic-first-form-demo.html'])[1]")).click();
			Thread.sleep(3000);
			drive5.findElement(By.xpath(".//*[@placeholder='Please enter your Message']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@placeholder='Please enter your Message']")).sendKeys("Remove false advertising from your website");
			Thread.sleep(1000);
			drive5.findElement(By.xpath("(.//*[@class='btn btn-default'])[1]")).click();
			Thread.sleep(4000);
			drive5.findElement(By.xpath("(.//*[@placeholder='Enter value'])[1]")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath("(.//*[@placeholder='Enter value'])[1]")).sendKeys("2");
			Thread.sleep(1000);
			drive5.findElement(By.xpath("(.//*[@placeholder='Enter value'])[2]")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath("(.//*[@placeholder='Enter value'])[2]")).sendKeys("3");
			Thread.sleep(1000);
			drive5.findElement(By.xpath("(.//*[@class='btn btn-default'])[2]")).click();
			Thread.sleep(4000);
			String str2=drive5.findElement(By.xpath(".//*[@id='displayvalue']")).getText();
			if(str2.trim().equals("5")){
				System.out.println("True condition");
				}
			else{
				System.out.println("False condition");
			}
			String str3=drive5.findElement(By.xpath(".//*[@id='display']")).getText();
			if(str3.trim().equals("Remove false advertising from your website"))
			{
				System.out.println("True condition");
			}
			else{
				System.out.println("False condition");
			}
			drive5.close();
		}catch(Exception e5){e5.printStackTrace();}
	}
	}


/* 
public static void main (String[]args) 
{  
	try{
		System.setProperty("webdriver.chrome.driver","D:\\InpodsAutomation\\WebAPITesting\\JAR\\ChromeDriver2.33\\chromedriver.exe.");
		WebDriver drive4 = new ChromeDriver();
		drive4.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		drive4.get("https://twitter.com");
		drive4.findElement(By.xpath(".//*[@ href='/login']")).click();
		drive4.findElement(By.xpath(".//*[@placeholder='Phone, email or username']")).click();
		drive4.findElement(By.xpath(".//*[@placeholder='Phone, email or username']")).sendKeys("viratkohli@gmail.com");
		drive4.findElement(By.xpath("(.//*[@name='session[password]'])[2]")).click();
		drive4.findElement(By.xpath("(.//*[@name='session[password]'])[2]")).sendKeys("183vspakistan");
		drive4.findElement(By.xpath(".//*[@class='submit EdgeButton EdgeButton--primary EdgeButtom--medium']")).click();
		drive4.findElement(By.xpath(".//*[@id='tweet-box-home-timeline']")).click();
		drive4.findElement(By.xpath(".//*[@id='tweet-box-home-timeline']")).sendKeys("Big game tonight, Chelsea vs Barcelona #UCL");
		Thread.sleep(3000);
		drive4.findElement(By.xpath(".//*[@class='tweet-action EdgeButton EdgeButton--primary js-tweet-btn']")).click();
		Thread.sleep(3000);
		drive4.findElement(By.xpath(".//*[@id='user-dropdown-toggle']")).click();
		drive4.findElement(By.xpath(".//*[@id='signout-button']/button")).click();
	}catch(Exception e2){e2.printStackTrace();}
}  
}
*/