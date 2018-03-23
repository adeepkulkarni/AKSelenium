package seleniumweb;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class sele4 {

	public static void main(String[] args) {
		try{
			System.setProperty("webdriver.chrome.driver","D:\\InpodsAutomation\\WebAPITesting\\JAR\\ChromeDriver2.33\\chromedriver.exe.");
			WebDriver drive5 = new ChromeDriver();
			drive5.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			drive5.get("http://www.seleniumeasy.com/test");
			drive5.findElement(By.xpath("(.//*[@id='navbar-brand-centered']//li[1])[1]")).click();
			Thread.sleep(2000);
			drive5.findElement(By.xpath("(.//*[@href='./input-form-demo.html'])[1]")).click();
			Thread.sleep(3000);
			drive5.findElement(By.xpath(".//*[@placeholder='First Name']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@placeholder='First Name']")).sendKeys("James");
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@placeholder='Last Name']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@placeholder='Last Name']")).sendKeys("Bond");
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@placeholder='E-Mail Address']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@placeholder='E-Mail Address']")).sendKeys("adeep.kulkarni@gmail.com");
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@name='phone']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@name='phone']")).sendKeys("0202629550");
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@placeholder='Address']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@placeholder='Address']")).sendKeys("Flat no 2 Horizon Apts Kothrud");
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@placeholder='city']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@placeholder='city']")).sendKeys("Pune");
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@name='state']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[.='Arizona']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@placeholder='Zip Code']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@placeholder='Zip Code']")).sendKeys("45252");
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@placeholder='Website or domain name']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@placeholder='Website or domain name']")).sendKeys("www.inpodsx.com");
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@value='yes']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@placeholder='Project Description']")).click();
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@placeholder='Project Description']")).sendKeys("Good Project");
			Thread.sleep(1000);
			drive5.findElement(By.xpath(".//*[@class='btn btn-default']")).click();
			Thread.sleep(2000);
		}catch(Exception e5){}

	}

}

//


/*


*/
