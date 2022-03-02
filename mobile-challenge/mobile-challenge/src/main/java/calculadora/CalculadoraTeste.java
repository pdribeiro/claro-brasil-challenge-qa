package calculadora;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculadoraTeste {

	@Test
	public void deveSomar() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appium:deviceName", "emulator-5554");
		desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
		desiredCapabilities.setCapability("appium:appPackage", "com.android.calculator2");
		desiredCapabilities.setCapability("appium:appActivity", "com.android.calculator2.Calculator");
		desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
		desiredCapabilities.setCapability("appium:newCommandTimeout", 0);
		desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),
				desiredCapabilities);

		MobileElement el3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("plus");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
		el6.click();
		Assert.assertEquals("4", el6.getText());

		driver.quit();

	}

	@Test
	public void deveDividir() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appium:deviceName", "emulator-5554");
		desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
		desiredCapabilities.setCapability("appium:appPackage", "com.android.calculator2");
		desiredCapabilities.setCapability("appium:appActivity", "com.android.calculator2.Calculator");
		desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
		desiredCapabilities.setCapability("appium:newCommandTimeout", 0);
		desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),
				desiredCapabilities);

		MobileElement el3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
		el3.click();
	    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("divide");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
		el6.click();
		Assert.assertEquals("1", el6.getText());

		driver.quit();

	}
	
	@Test
	public void deveSubtrair() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appium:deviceName", "emulator-5554");
		desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
		desiredCapabilities.setCapability("appium:appPackage", "com.android.calculator2");
		desiredCapabilities.setCapability("appium:appActivity", "com.android.calculator2.Calculator");
		desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
		desiredCapabilities.setCapability("appium:newCommandTimeout", 0);
		desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),
				desiredCapabilities);

		MobileElement el3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
		el3.click();
	    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("minus");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
		el6.click();
		Assert.assertEquals("0", el6.getText());

		driver.quit();

	}
	
	@Test
	public void deveMultiplicar() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability("platformName", "Android");
		desiredCapabilities.setCapability("appium:deviceName", "emulator-5554");
		desiredCapabilities.setCapability("appium:automationName", "uiautomator2");
		desiredCapabilities.setCapability("appium:appPackage", "com.android.calculator2");
		desiredCapabilities.setCapability("appium:appActivity", "com.android.calculator2.Calculator");
		desiredCapabilities.setCapability("appium:ensureWebviewsHavePages", true);
		desiredCapabilities.setCapability("appium:newCommandTimeout", 0);
		desiredCapabilities.setCapability("appium:connectHardwareKeyboard", true);

		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),
				desiredCapabilities);

		MobileElement el3 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
		el3.click();
	    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("multiply");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementById("com.android.calculator2:id/digit_2");
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementById("com.android.calculator2:id/result");
		el6.click();
		Assert.assertEquals("4", el6.getText());

		driver.quit();

	}
}