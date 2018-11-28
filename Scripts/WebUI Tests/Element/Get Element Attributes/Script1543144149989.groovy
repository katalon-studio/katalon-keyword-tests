import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.assertj.core.api.Assertions.*
import org.openqa.selenium.WebElement
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import utils.DriverManager

TestObject homepageTitle = findTestObject('WebUI Objects/Page_Homepage/h1_Homepage')
WebElement homepageTitleElement = WebUiCommonHelper.findWebElement(homepageTitle, GlobalVariable.timeout)

assertThat(WebUI.getCSSValue(homepageTitle, 'font-size')).isEqualTo(homepageTitleElement.getCssValue('font-size'))
assertThat(WebUI.getElementHeight(homepageTitle)).isEqualTo(homepageTitleElement.getSize().getHeight())
assertThat(WebUI.getElementWidth(homepageTitle)).isEqualTo(homepageTitleElement.getSize().getWidth())
assertThat(WebUI.getElementLeftPosition(homepageTitle)).isEqualTo(homepageTitleElement.getLocation().x)
