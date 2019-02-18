package scripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Appium_Installation {
	
	public static AppiumDriver<WebElement> driver;
	
	@BeforeClass
	public void beforeTest() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("automationName", "Appium");
		caps.setCapability("platformName", "Android");
		caps.setCapability("deviceName", "054b903b");
		caps.setCapability("platformVersion", "8.0.0");
		caps.setCapability("appPackage", "com.climate.farmrise");
		caps.setCapability("appActivity", "com.climate.farmrise.base.FarmriseHomeActivity");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
				
	}
}