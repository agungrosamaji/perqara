
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String


 /**
	 * Start Application
	 */ 
def static "mobile.Common.startApp"() {
    (new mobile.Common()).startApp()
}

 /**
	 * Start Application Existing
	 */ 
def static "mobile.Common.startAppExist"() {
    (new mobile.Common()).startAppExist()
}

 /**
	 * Check Toast
	 */ 
def static "mobile.Common.verifyToastElement"(
    	String textName	) {
    (new mobile.Common()).verifyToastElement(
        	textName)
}

 /**
	 * Login Check Response Code
	 *
	 * @param username for auth login
	 * @param password for auth login
	 */ 
def static "api.Common.loginResponseCode"(
    	String username	
     , 	String password	
     , 	int responseCode	) {
    (new api.Common()).loginResponseCode(
        	username
         , 	password
         , 	responseCode)
}

 /**
	 * Login get token
	 * 
	 * @param username for auth login
	 * @param password for auth login
	 * @return token for bearer token
	 */ 
def static "api.Common.loginGetToken"(
    	String username	
     , 	String password	) {
    (new api.Common()).loginGetToken(
        	username
         , 	password)
}

 /**
	 * Verify parameter value
	 *
	 * @param username for auth login
	 * @param password for auth login
	 * @param response parameter name
	 * @param response parameter value
	 */ 
def static "api.Common.loginCheckParam"(
    	String username	
     , 	String password	
     , 	String name	
     , 	String value	) {
    (new api.Common()).loginCheckParam(
        	username
         , 	password
         , 	name
         , 	value)
}
