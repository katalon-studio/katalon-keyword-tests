package utils

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory

public class DriverManager {
	public static WebDriver getWebDriver() {
		return DriverFactory.getWebDriver()
	}
}
