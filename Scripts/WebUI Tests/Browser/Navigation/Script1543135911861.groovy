import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import builder.UrlBuilder
import internal.GlobalVariable as GlobalVariable

WebUI.navigateToUrl(UrlBuilder.appendUrlFromBase('redirector'))
WebUI.back()
assertThat(WebUI.verifyTextPresent("Welcome to the-internet", GlobalVariable.ignoreRegex)).isTrue()
WebUI.forward()
assertThat(WebUI.verifyTextPresent("Redirection", GlobalVariable.ignoreRegex)).isTrue()