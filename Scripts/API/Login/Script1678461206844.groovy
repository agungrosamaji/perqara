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

import CustomKeywords
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import groovy.json.JsonSlurper
import groovy.ui.Console
import groovy.util.logging.Log as JsonSlurper

/**
 * Login Success : Response Code 200
 */
CustomKeywords.'api.Common.loginResponseCode'(username, password, 200)
/**
 * Login Gagal : Response Code 400
 */
CustomKeywords.'api.Common.loginResponseCode'(usernameF, password, 400)
/**
 * Login Gagal
 * error : user not found
 */
CustomKeywords.'api.Common.loginCheckParam'(usernameF, password, "error", "user not found")
/**
 * Login Gagal
 * error : Missing email or username
 */
CustomKeywords.'api.Common.loginCheckParam'("", "", "error", "Missing email or username")
/**
 * Get Token
 */
GlobalVariable.token = CustomKeywords.'api.Common.loginGetToken'(username, password)