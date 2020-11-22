

// How to resolved merge conflict. https://www.youtube.com/watch?v=JtIX3HJKwfo - Changes has been made by the team lead.

// How to create a branch // https://www.youtube.com/watch?v=WSWnch-SyPM - Branch created



package AppiumEclipseProject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class AppiumMobile123 {

	WebDriver driver;	
	
	@Test
	public void SampleTest() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability("NoRest", "true");	
		cap.setCapability("fullReset", "false");
		cap.setCapability("devicename", "emulator-5554 ");
		cap.setCapability("platformName", "Android");	
		cap.setCapability("platformversion", " 7.1.1");	
	//	cap.setCapability("AppPackage", "");//
		cap.setCapability(CapabilityType.BROWSER_NAME, "chrome");
	
		
//		caps.setCapability(MobileCapabilityType.APP, "");// Provide the absolutely path to the apk
		//	caps.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		//	caps.setCapability(MobileCapabilityType.NO_RESET, "true");
		
		
		
		WebDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		
	//	URL url =  new URL("http://127.0.0.1:4723/wd/hub");
	//	WebDriver driver = new AppiumDriver<MobileElement>(url, cap);
		
	}
	    @Test
	    public void GotoDashboard () {	    
	    	
        driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("submit")).click();	
		System.out.println(" Hey I am on OrangeHRM Dashboard");
		
              
      

	}

}
