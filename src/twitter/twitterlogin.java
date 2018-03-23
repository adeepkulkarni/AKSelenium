package twitter;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class twitterlogin {

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

/*



public class fblogin {

		public static void main(String[] args) {
			logout=
			try{
				System.setProperty("webdriver.chrome.driver","D:\\InpodsAutomation\\WebAPITesting\\JAR\\ChromeDriver2.33\\chromedriver.exe.");
				WebDriver drive2 = new ChromeDriver();
				drive2.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
				drive2.get("https://www.facebook.com");
				
				drive2.findElement(By.xpath(".//*[@id='email']")).sendKeys("jamesbond@hotmail.com");
				drive2.findElement(By.xpath(".//*[@id='pass']")).click();
				drive2.findElement(By.xpath(".//*[@id='pass']")).sendKeys("***********");
				drive2.findElement(By.xpath(".//*[@id='u_0_2']")).click();
				drive2.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
				
				
				//
				
				
					
				
				
				
				
				
				
				
}catch(Exception e1){}
		}
}
*/