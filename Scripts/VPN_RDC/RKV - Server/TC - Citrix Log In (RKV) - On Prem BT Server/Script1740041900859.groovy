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

WebUI.openBrowser('https://citrix.rodekruis.be/logon/LogonPoint/tmindex.html')

WebUI.setText(findTestObject('Object Repository/Page_NetScaler AAA/input_User name_login'), 'jhoste')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_NetScaler AAA/input_Password_passwd'), 'ko8H0Q1+OhUhMUmJmlb2+Q==')

WebUI.click(findTestObject('Object Repository/Page_NetScaler AAA/a_Log On'))

WebUI.navigateToUrl('https://citrix.rodekruis.be/Citrix/RODEKRUISWeb/')

WebUI.click(findTestObject('Object Repository/Page_Citrix Workspace/a_Detect Citrix Workspace app'))

WebUI.click(findTestObject('Object Repository/Page_Citrix Workspace/a_Already installed'))

WebUI.click(findTestObject('Object Repository/Page_Citrix Workspace/a_Remote Desktop ConnectionAdmin'))

WebUI.click(findTestObject('Object Repository/Page_Citrix Workspace/div_Open'))

Runtime.getRuntime().exec("cmd /c mstsc /v:serveradres")
