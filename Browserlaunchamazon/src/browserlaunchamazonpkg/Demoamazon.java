package browserlaunchamazonpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoamazon {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
System.setProperty("WebDriver.chrome.driver","C:\\Users\\Admin\\Downloads\\selenium automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

	}

}
