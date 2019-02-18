package page_object_module;

import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class WeatherDetailsTest extends Actions{
	AppiumDriver<WebElement> driver;
	
	public WeatherDetailsTest(AppiumDriver<WebElement> driver) {
		super(driver);
		PageFactory.initElements(driver, this);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	//Test case 1:
	
	@FindBy(xpath="//android.widget.TextView[@text='FarmRise']")
	private WebElement farmRise;
	
	
	public void clickOnApp()
	{
		farmRise.click();
	}
 
	@FindBy(id="com.climate.farmrise:id/checkWeatherDetails")
	private WebElement weatherDetailsTab;
	
	public void clickOnWeatherDetailsTab()
	{
		weatherDetailsTab.click();
	}
	
	@FindBy(xpath ="//android.widget.TextView[@text='Now'")
	private WebElement swipeFromNow;
	
	public void scroll(int fromX, int fromY, int toX, int toY) {
		
		TouchAction touchaction = new TouchAction(driver);
		touchaction.tap(76,782).waitAction(1000).moveTo(600, 704).release(). perform();
	}

	
	
	public void displayMessage(String S1)
	{
		System.out.println(S1);
	}
	
	//Test case 2: 
	
	@FindBy(xpath="//android.widget.TextView[@text='Home'")
	private WebElement clickHomeIcon;
	
	public void clickOnHomeIcon()
	{
		clickHomeIcon.click();
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='More'")
	private WebElement clickMoreIcon;
	
	public void clickOnMoreIcon()
	{
		clickMoreIcon.click();
		}

	@FindBy(xpath="//android.widget.TextView[@text='Government Schemes'")
	private WebElement governmentSchemes;
	
	public void clickOnGovSchemes()
	{
		governmentSchemes.click();
	}
	
	@FindBy(id="android:id/search_button")
	private WebElement clickOnSearch;
	
	public void tapOnSearch()
	{
		clickOnSearch.click();
	}
	
	@FindBy(id="android:id/search_src_text")
	private WebElement typeOnSearch;
	
	public void typeOnSearch(String S2)
	{
		typeOnSearch.sendKeys(S2);
	}
	
    
	
}









