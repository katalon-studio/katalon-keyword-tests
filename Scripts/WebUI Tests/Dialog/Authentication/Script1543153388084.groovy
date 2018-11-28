import static org.assertj.core.api.Assertions.*

import org.openqa.selenium.WebDriver

import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import builder.UrlBuilder

WebDriver driver = DriverFactory.getWebDriver()
WebUI.authenticate(UrlBuilder.appendUrlFromBase('basic_auth'), "admin", "admin", 20)

// Successful login
WebUI.verifyTextPresent("Congratulations! You must have the proper credentials.", false)

// Get current cookies after successful login
def authCookies = driver.manage().getCookies()

// Delete cookies and compare deleted one with authenticated one
WebUI.deleteAllCookies()
def blankCookies = driver.manage().getCookies()
assertThat(authCookies).isNotEqualTo(blankCookies)