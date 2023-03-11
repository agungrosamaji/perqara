package api
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import groovy.json.JsonSlurper
import internal.GlobalVariable



class Common {

	/**
	 * Login Check Response Code
	 *
	 * @param username for auth login
	 * @param password for auth login
	 */
	@Keyword
	def static void loginResponseCode(String username, String password, int responseCode) {
		def response = WS.sendRequestAndVerify(findTestObject('API/Login', [('username') : username, ('password') : password]))
		WS.verifyResponseStatusCode(response, responseCode)
		println(WS.getResponseStatusCode(response))
	}

	/**
	 * Login get token
	 * 
	 * @param username for auth login
	 * @param password for auth login
	 * @return token for bearer token
	 */
	@Keyword
	def static String loginGetToken(String username, String password) {
		def response = WS.sendRequest(findTestObject('API/Login', [('username') : username, ('password') : password]))
		String token = WS.getElementPropertyValue(response, 'token')
		println(token)
		return token
	}

	/**
	 * Verify parameter value
	 *
	 * @param username for auth login
	 * @param password for auth login
	 * @param response parameter name
	 * @param response parameter value
	 */
	@Keyword
	def static void loginCheckParam(String username, String password, String name, String value) {
		def response = WS.sendRequest(findTestObject('API/Login', [('username') : username, ('password') : password]))
		WS.verifyElementPropertyValue(response, name, value)
	}
}