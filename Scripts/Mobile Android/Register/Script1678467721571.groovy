import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import java.nio.file.Path

import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.keyword.builtin.CallTestCaseKeyword
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.internal.PathUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

CustomKeywords.'mobile.Common.startApp'()

Mobile.comment("register")
Mobile.tap(findTestObject("Object Repository/Mobile Android/button - register"), 10)
Mobile.tap(findTestObject("Object Repository/Mobile Android/editText - username register"), 10)
Mobile.setText(findTestObject("Object Repository/Mobile Android/editText - username register"), "test", 10)
Mobile.tap(findTestObject("Object Repository/Mobile Android/editText - password register"), 10)
Mobile.setEncryptedText(findTestObject("Object Repository/Mobile Android/editText - password register"), "P9ET2sDE0SE=", 10)
Mobile.tap(findTestObject("Object Repository/Mobile Android/editText - confirm password register"), 10)
Mobile.setEncryptedText(findTestObject("Object Repository/Mobile Android/editText - confirm password register"), "P9ET2sDE0SE=", 10)
Mobile.hideKeyboard()
Mobile.tap(findTestObject("Object Repository/Mobile Android/button - create register"), 10)

Mobile.comment("Verify Register Success")
CustomKeywords.'mobile.Common.verifyToastElement'("Account Successfully Created")
Mobile.pressBack()
Mobile.pressBack()
//Mobile.callTestCase(findTestCase("Test Cases/Mobile Android/Login"),null)