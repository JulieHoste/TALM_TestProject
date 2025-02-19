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

WebUI.setText(findTestObject('Object Repository/Page_Google/textarea_Sign in_q'), 'Katalon')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Google/img_Sign in_lnXdpd'), 30)

WebUI.openBrowser('')

WebUI.click(findTestObject('Object Repository/Page_Google/input_Delete_btnK'))

WebUI.navigateToUrl('https://www.google.com/sorry/index?continue=https://www.google.com/search%3Fq%3DKatalon%26sca_esv%3D90548b20b23b480c%26source%3Dhp%26ei%3D4pG1Z86hM5Kqi-gP1J6EqQg%26iflsig%3DACkRmUkAAAAAZ7Wf8jak7intBI0lUz1XfwMjbYZLUbXI%26ved%3D0ahUKEwjOmq7KpM-LAxUS1QIHHVQPIYUQ4dUDCBA%26oq%3DKatalon%26gs_lp%3DEgdnd3Mtd2l6IgdLYXRhbG9uMgUQLhiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABDIFEAAYgAQyBRAAGIAEMgUQABiABEiDnAFQAFjRA3AAeACQAQCYAbgCoAGYB6oBBzAuMi4xLjG4AQzIAQD4AQGYAgSgAroHwgIREC4YgAQYsQMY1AIYxwEYrwHCAhEQLhiABBixAxiDARjHARivAcICBBAuGAPCAggQLhiABBjUApgDAJIHBzAuMi4xLjGgB4kh%26sclient%3Dgws-wiz%26sei%3D-JG1Z9WnG4Wri-gPhN7R2A4&q=EhAqAqA_6bG3AYVq6ScBJD1wGPij1r0GIjBvqLVjZW8RKq_KEpKPDVwUHVNcUPpmbt-Lm8s404EbBVyiQmEy1ZkwtmyeECvK7aYyAXJaAUM')

WebUI.click(findTestObject('Object Repository/Page_httpswww.google.comsearchqKatalonsca_e_c86a67/div_reCAPTCHA_recaptcha-checkbox-border'))

WebUI.click(findTestObject('Object Repository/Page_httpswww.google.comsearchqKatalonsca_e_c86a67/img_Click verify once there are none left_rc-image-tile-33'))

WebUI.click(findTestObject('Object Repository/Page_httpswww.google.comsearchqKatalonsca_e_c86a67/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_httpswww.google.comsearchqKatalonsca_e_c86a67/button_Verify'))

WebUI.click(findTestObject('Object Repository/Page_httpswww.google.comsearchqKatalonsca_e_c86a67/img_Click verify once there are none left_r_1e3bc3'))

WebUI.click(findTestObject('Object Repository/Page_httpswww.google.comsearchqKatalonsca_e_c86a67/img_Click verify once there are none left_r_1e3bc3_1'))

WebUI.click(findTestObject('Object Repository/Page_httpswww.google.comsearchqKatalonsca_e_c86a67/div_Click verify once there are none left_r_f144f7'))

WebUI.click(findTestObject('Object Repository/Page_httpswww.google.comsearchqKatalonsca_e_c86a67/button_Verify'))

