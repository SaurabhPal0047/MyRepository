package AppiumProject.AppiunProject;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppiumTest {

	public static AndroidDriver<MobileElement> driver;
	
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "InfostretchAVD");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("platformVersion", "9");
		capabilities.setCapability("appPackage", "in.amazon.mShop.android.shopping");
		capabilities.setCapability("appActivity", "com.amazon.mShop.android.home.HomeActivity");
		capabilities.setCapability("noReset", true);
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.findElementById("in.amazon.mShop.android.shopping:id/search_edit_text").click();
		driver.findElementById("in.amazon.mShop.android.shopping:id/search_auto_text").sendKeys("earphones");
		
	}
}
