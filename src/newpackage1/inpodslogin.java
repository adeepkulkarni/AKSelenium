package newpackage1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class inpodslogin {
	public static void main(String[] args) {
		
		try{
			System.setProperty("webdriver.chrome.driver","D:\\InpodsAutomation\\WebAPITesting\\JAR\\ChromeDriver2.33\\chromedriver.exe.");
			WebDriver drive3=null;
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			drive3  = new ChromeDriver(options);    
			//driver=new HtmlUnitDriver();
            
			drive3 .manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			drive3 .manage().window().maximize();
			
			drive3.get("http://demo.inpods.com/");
			WebDriverWait wait= new WebDriverWait(drive3,100);
			
			drive3.findElement(By.xpath(".//*[@data-toggle='modal']")).click();
			WebElement e=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='UserName']")));
			e.click();
			//Thread.sleep(5000);
			//drive3.findElement(By.xpath(".//*[@id='UserName']")).click(); 
			drive3.findElement(By.xpath(".//*[@id='UserName']")).sendKeys("sd@inpods.com");
			drive3.findElement(By.xpath(".//*[@id='Password']")).click();
			drive3.findElement(By.xpath(".//*[@id='Password']")).sendKeys("t1t1t1");
			drive3.findElement(By.xpath(".//*[@id='Password']")).sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			e=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@class='fa fa-calendar']")));
			e.click();
			Thread.sleep(5000);
			//drive3.findElement(By.xpath(".//*[@class='fa fa-calendar']")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath(".//*[@class='desc ng-binding' and .='DelayShowingMarks']")).click();
			drive3.findElement(By.xpath(".//button[.='Ok']")).click();
			Thread.sleep(1000);
			e=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@class='fa fa-cog']")));
			e.click();
			//Thread.sleep(3000);
			//drive3.findElement(By.xpath(".//*[@class='fa fa-cog']")).click();
			e=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@style='float:left']")));
			e.click();
			//Thread.sleep(5000);
			//drive3.findElement(By.xpath(".//*[@style='float:left']")).click();
			Alert al = drive3.switchTo().alert();
			al.accept();
			e=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@name='lblActivityCategoryType']")));
			e.click();
			//Thread.sleep(20000);
			//drive3.findElement(By.xpath(".//*[@name='lblActivityCategoryType']")).click();  
			Thread.sleep(5000);
			drive3.findElement(By.xpath(".//*[@name='lblActivityCategoryType']//*[@name='value']")).click();
			Thread.sleep(2000);
			drive3.findElement(By.xpath(".//*[@name='lblActivityCategoryType']//*[@name='value']//*[@value='Test']")).click();
			//drive3.findElement(By.xpath(".//*[.='assmayur-1']/..//*[.='Student View']")).click();
			e=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@name='lblexamControlType']")));
			e.click();
			//Thread.sleep(5000);
			//drive3.findElement(By.xpath(".//*[@name='lblexamControlType']")).click();
			Thread.sleep(5000);
			new Select(drive3.findElement(By.xpath(".//*[@name='value']"))).selectByValue("GroupAccessCode");
			drive3.findElement(By.xpath(".//*[@id='secretGACode']")).click();
			drive3.findElement(By.xpath(".//*[@id='secretGACode']")).sendKeys("123");
			drive3.findElement(By.xpath(".//*[@name='lblMinutes']")).click();
			new Select(drive3.findElement(By.xpath(".//*[@name='value']"))).selectByValue("20");
			drive3.findElement(By.xpath(".//*[@name='btnAddActivity' and .='+Add question set']")).click();
			drive3.findElement(By.xpath(".//*[@name='cbxActivityType']")).click();
			new Select(drive3.findElement(By.xpath(".//*[@name='cbxActivityType']"))).selectByValue("7");
			Thread.sleep(4000);
			drive3.findElement(By.xpath(".//*[@name='btnSave']")).click();
			Thread.sleep(4000);
			Alert  a2= drive3.switchTo().alert();
			Thread.sleep(4000);   //(.//*[@class='dynatree-expander'])[2]
			a2.accept();
			Thread.sleep(4000);
			drive3.findElement(By.xpath(".//*[@style='width:20%;border: 0px;text-align :left; ']")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath(".//*[@name='lblConcept']")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath(".//*[@class='dynatree-expander']")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath(".//*[@title='CO - 2_SD']")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath(".//*[@name='cmbBlooms']//../button")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath(".//*[@title='Bloom1']")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath("(.//*[@name='lblConcept'])[2]")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath("(.//*[@class='dynatree-expander'])[3]")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath("(.//*[@title='CO - 3_SD'])[2]")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath("(.//*[@name='cmbBlooms']//../button)[2]")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath("(.//*[@title='Bloom2'])[2]")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath("(.//*[@name='lblConcept'])[3]")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath("(.//*[@class='dynatree-expander'])[5]")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath("(.//*[@title='CO - 4_SD'])[3]")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath("(.//*[@name='cmbBlooms']//../button)[3]")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath("(.//*[@title='Bloom3'])[3]")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath("(.//*[@name='lblConcept'])[4]")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath("(.//*[@class='dynatree-expander'])[7]")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath("(.//*[@title='CO - 1_SD'])[4]")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath("(.//*[@name='cmbBlooms']//../button)[4]")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath("(.//*[@title='Bloom1'])[4]")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath("(.//*[@name='lblConcept'])[5]")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath("(.//*[@class='dynatree-expander'])[9]")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath("(.//*[@title='CO - 2_SD'])[5]")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath("(.//*[@name='cmbBlooms']//../button)[5]")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath("(.//*[@title='Bloom3'])[5]")).click();
			Thread.sleep(1000);
			drive3.findElement(By.xpath(".//*[@name='btnSave']")).click();
			Thread.sleep(4000);
			drive3.findElement(By.xpath(".//*[@id='cbxEnablePublish']")).click();
			Thread.sleep(2000);
			drive3.findElement(By.xpath(".//*[@class='okButtonClass']")).click();
			Thread.sleep(3000);
			Alert  a4= drive3.switchTo().alert();
			Thread.sleep(4000);   //(.//*[@class='dynatree-expander'])[2]  okButtonClass
			a4.accept();
			Thread.sleep(4000);
//			drive3.findElement(By.xpath(".//*[@src='http://d15qyl5of70ybf.cloudfront.net/images/avatar/user1.png']")).click();
	//		drive3.findElement(By.xpath(".//*[@href='/account/SignOut']")).click();
			//
			
			
			//name="value"//
	
}catch(Exception e1){e1.printStackTrace();}
	}
}

/*



public class fblogin {

	
*/