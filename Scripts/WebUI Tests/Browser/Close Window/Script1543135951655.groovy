import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import builder.UrlBuilder

TestObject openNewWindowLink = findTestObject('WebUI Objects/Page_Window/a_Open New Window')

WebUI.navigateToUrl(UrlBuilder.appendUrlFromBase('windows'))
assertThat(WebUI.getWindowTitle()).isEqualTo('The Internet')

WebUI.click(openNewWindowLink)

WebUI.switchToWindowIndex(1)
assertThat(WebUI.getWindowIndex()).isEqualTo(1)

WebUI.closeWindowIndex(1)
WebUI.closeWindowTitle('The Internet')
