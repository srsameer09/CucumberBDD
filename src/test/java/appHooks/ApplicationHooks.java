package appHooks;

import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import com.crm.factory.DriverFactory;
import com.crm.utils.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

//getProperty
//lunchBrowser
//quite Browser
//teardown(takescreenshot)

public class ApplicationHooks {

	private DriverFactory driverFactory;
	private WebDriver driver; //here driver is null
	private ConfigReader configReader;
	Properties prop;
	
	@Before(order=0)
	public void getProperty() {
		
		 configReader=new ConfigReader();
		 prop = configReader.init_prop();
	}
	@Before(order=1)
	public void lunchBrowser() {
		String browserName = prop.getProperty("browser");
		System.out.println("browserName:"+browserName);
		driverFactory=new DriverFactory();
		driver=driverFactory.init_driver(browserName);
		
		System.out.println("driver:"+driver);
			
		}
	@After(order=0)	
    public void quiteBrowser() {
    	
    	driver.quit();
    }
    @After(order=1)
    public void tearDown(Scenario scenario) {
    	if(scenario.isFailed()) {
    		//takescreenshot
    		
    		String Screenshotname = scenario.getName().replaceAll("", "_");
    		byte[] sourcepath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    		scenario.attach(sourcepath, "image/png", Screenshotname);
    		

    	}
    	
    }
	
}
