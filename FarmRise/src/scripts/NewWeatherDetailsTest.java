package scripts;

import org.testng.annotations.Test;

import page_object_module.WeatherDetailsTest;

public class NewWeatherDetailsTest extends Appium_Installation{
  
	
	@Test(priority='1', description = "Test Case 1:")
	public void launchWeatherDetails() throws InterruptedException{
		
		WeatherDetailsTest weather = new WeatherDetailsTest(driver);
		weather.clickOnApp();
		Thread.sleep(10000);
		weather.clickOnWeatherDetailsTab();
		Thread.sleep(2000);
		weather.scroll(76, 782, 600, 704);
		Thread.sleep(2000);
		weather.displayMessage("Test case 1 Passed");
		
		
	}
	
	@Test(priority='2', description = "Test Case 2:")
	public void launchGovScheme() throws InterruptedException   {
		
		WeatherDetailsTest weather = new WeatherDetailsTest(driver);		
		weather.clickOnHomeIcon();
		Thread.sleep(2000);
		weather.clickOnMoreIcon();
		Thread.sleep(2000);
		weather.clickOnGovSchemes();
		Thread.sleep(2000);
		weather.tapOnSearch();
		Thread.sleep(2000);
		weather.typeOnSearch("scheme");
		Thread.sleep(2000);
		weather.displayMessage("Test case 2 Passed");
	}
}
