import static org.assertj.core.api.Assertions.*
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

int currentPageHeight = WebUI.getPageHeight()
int currentPageWidth = WebUI.getPageWidth()

assertThat(WebUI.getViewportHeight()).isNotNull()
assertThat(WebUI.getViewportWidth()).isNotNull()

WebUI.maximizeWindow()
assertThat(WebUI.getViewportHeight()).isNotEqualTo(currentPageHeight)
assertThat(WebUI.getViewportWidth()).isNotEqualTo(currentPageWidth)

WebUI.setViewPortSize(800, 600)

assertThat(WebUI.getViewportHeight()).isEqualTo(600)
assertThat(WebUI.getViewportWidth()).isEqualTo(800)