import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.assertj.core.api.Assertions.*
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import builder.UrlBuilder
import internal.GlobalVariable as GlobalVariable

TestObject iframe = findTestObject('Object Repository/WebUI Objects/Page_iFrame/iframe_inputText')
TestObject editField = findTestObject('Object Repository/WebUI Objects/Page_iFrame/input_Editor')

WebUI.navigateToUrl(UrlBuilder.appendUrlFromBase('iframe'))
WebUI.switchToFrame(iframe, GlobalVariable.timeout)
WebUI.setText(editField, "Some text to test")
assertThat(WebUI.getText(editField)).isEqualTo("Some text to test")