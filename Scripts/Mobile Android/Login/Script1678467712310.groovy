import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.comment("Login Failed")
Mobile.tap(findTestObject("Object Repository/Mobile Android/editText - username login"), 10)
Mobile.setText(findTestObject("Object Repository/Mobile Android/editText - username login"), "", 10)
Mobile.tap(findTestObject("Object Repository/Mobile Android/editText - password login"), 10)
Mobile.setEncryptedText(findTestObject("Object Repository/Mobile Android/editText - password login"), "", 10)
Mobile.hideKeyboard()
Mobile.doubleTap(findTestObject("Object Repository/Mobile Android/button - login"), 10)

Mobile.comment("Verify Login Failed")
CustomKeywords.'mobile.Common.verifyToastElement'("User Name or Password does not match")

Mobile.comment("Login Success")
Mobile.tap(findTestObject("Object Repository/Mobile Android/editText - username login"), 10)
Mobile.setText(findTestObject("Object Repository/Mobile Android/editText - username login"), "test", 10)
Mobile.tap(findTestObject("Object Repository/Mobile Android/editText - password login"), 10)
Mobile.setEncryptedText(findTestObject("Object Repository/Mobile Android/editText - password login"), "P9ET2sDE0SE=", 10)
Mobile.tap(findTestObject("Object Repository/Mobile Android/button - login"), 10)

Mobile.comment("Verify Login Success")
CustomKeywords.'mobile.Common.verifyToastElement'("Congrats: Login Successfull")
Mobile.verifyElementText(findTestObject("Object Repository/Mobile Android/textView - You have sucessfully logged in )"), "You have sucessfully logged in :)")
Mobile.verifyElementText(findTestObject("Object Repository/Mobile Android/textView - YAAY"), "YAAY !!")
Mobile.closeApplication()