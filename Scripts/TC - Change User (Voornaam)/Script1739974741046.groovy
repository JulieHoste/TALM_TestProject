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

WebUI.callTestCase(findTestCase('TC - TST - Log in SuccessFactors'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://hcm2preview.sapsf.eu/sf/liveprofile?selected_user_encoded=46313DFEA18F4B559BD18C3166B1F0BD&_s.crb=Mx05L7ycfLF2AbYqmBhxkrVhVW8NnDAFU9s%2f3EAMzPc%3d')

WebUI.click(findTestObject('Object Repository/Page_SuccessFactors People Profile for Tinne Tack/span_Personal Information___button53-img'))

WebUI.click(findTestObject('Object Repository/Page_SuccessFactors People Profile for Tinne Tack/span_When should these changes take effect__d54225'))

WebUI.click(findTestObject('Object Repository/Page_SuccessFactors People Profile for Tinne Tack/span_19'))

WebUI.setText(findTestObject('Object Repository/Page_SuccessFactors People Profile for Tinne Tack/input_Preferred Name___input2-inner'), 
    '')

