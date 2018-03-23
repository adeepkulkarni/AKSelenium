package newpackage1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchapp {

	public static void main(String[] str)
	{
		System.out.println(toCamelCase("The finance minister has proposed"));
	
		try
		{
			
		System.setProperty("webdriver.chrome.driver","D:\\InpodsAutomation\\WebAPITesting\\JAR\\chromedriver.exe.");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/doodles/icc-champions-trophy-2017-begins");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='hplogo-complex']")).click();
	/*Thread.sleep(3000);
		while(true)
		{
			try{
				//Thread.sleep(1000);
				driver.findElement(By.xpath(".//*[@id='hplogo-complex']")).click();
			}catch(Exception e){}
		}*/
		}catch(Exception e){e.printStackTrace();}
		
		
		
		
	}
	
	public static String toCamelCase(final String init) {
	    if (init==null)
	        return null;

	    final StringBuilder ret = new StringBuilder(init.length());

	    for (final String word : init.split(" ")) {
	        if (!word.isEmpty()) {
	            ret.append(word.substring(0, 1).toUpperCase());
	            ret.append(word.substring(1).toLowerCase());
	        }
	        if (!(ret.length()==init.length()))
	            ret.append(" ");
	    }

	    return ret.toString();
	}

}

