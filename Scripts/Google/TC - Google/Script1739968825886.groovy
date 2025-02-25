import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('www.google.com/ncr')

WebUI.click(findTestObject('Object Repository/Page_Google/div_Accept all'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Google/img_Sign in_lnXdpd'), 30)

WebUI.setText(findTestObject('Object Repository/Page_Google/textarea_Sign in_q'), 'plopsaland')

WebUI.click(findTestObject('Object Repository/Page_Google/input_Delete_btnK'))

WebUI.navigateToUrl('https://www.google.com/sorry/index?continue=https://www.google.com/search%3Fq%3Dplopsaland%26sca_esv%3D42c55ce90fafe599%26source%3Dhp%26ei%3D0tW1Z92WMP6N9u8Pn6e-4Qs%26iflsig%3DACkRmUkAAAAAZ7Xj4tYKUWw0gK9npzmAuUB_JNCNxE5B%26ved%3D0ahUKEwjdx76v5c-LAxX-hv0HHZ-TL7wQ4dUDCBA%26oq%3Dplopsaland%26gs_lp%3DEgdnd3Mtd2l6IgpwbG9wc2FsYW5kMg4QLhiABBixAxjHARivATILEC4YgAQYxwEYrwEyBRAAGIAEMgUQABiABDIFEAAYgAQyCxAuGIAEGMcBGK8BMhEQLhiABBjHARiYBRiZBRivATIFEAAYgAQyCxAuGIAEGMcBGK8BMgsQLhiABBjHARivAUi5BFAAWPQCcAB4AJABAJgBngGgAdMDqgEDMi4yuAEMyAEA-AEBmAIEoALlA5gDAJIHAzIuMqAHrE8%26sclient%3Dgws-wiz%26sei%3D1NW1Z824GM6vhbIPydDi6Qw&q=EhAqAqA_6bG3AYVq6ScBJD1wGNSr170GIjAB6Qvoy-a23UyCpLwIibT-fN34mUfsxNZqq6yc3lglJ40YwJ-9-w51mwOaHuPB3d8yAXJaAUM')

