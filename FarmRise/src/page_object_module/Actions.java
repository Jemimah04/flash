package page_object_module;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;

public abstract class Actions {
	 AppiumDriver<WebElement> driver;
 
	 public Actions(AppiumDriver<WebElement> driver) 
	 {
	  PageFactory.initElements(driver, this);
	  this.driver=driver;
	 }


	 
	 
	 
	 
	 
	 
}
