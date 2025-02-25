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

WebUI.openBrowser('https://hcm2preview.sapsf.eu/login?company=belgianredT1#/login')

WebUI.click(findTestObject('Object Repository/Page_Login - SAP SuccessFactors/input_User Name_username'))

WebUI.setText(findTestObject('Object Repository/Page_Login - SAP SuccessFactors/input_User Name_username'), 'huybrechtsh')

WebUI.click(findTestObject('Object Repository/Page_Login - SAP SuccessFactors/div_Password___container1--Grid-wrapperfor-_78970e'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - SAP SuccessFactors/input_Password_password'), 'UvCsbLp5GqIVypaRgR4sIw==')

WebUI.click(findTestObject('Object Repository/Page_Login - SAP SuccessFactors/bdi_Log in'))

WebUI.navigateToUrl('https://hcm2preview.sapsf.eu/sf/start?_s.crb=LYDrA1jPtXbhR8W%252fiG7YOsKQcKcUXxDZEkg8EQmFmeo%253d')

