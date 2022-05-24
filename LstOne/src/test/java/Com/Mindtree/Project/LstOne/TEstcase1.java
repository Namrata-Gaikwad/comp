package Com.Mindtree.Project.LstOne;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TEstcase1 {
@Test
	public static void Test1() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browser\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Open Valid Url
		driver.get("https://www.urbanladder.com");
	}

}
