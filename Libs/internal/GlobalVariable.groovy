package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object baseUrl
     
    /**
     * <p>Profile default : token login</p>
     */
    public static Object token
     
    /**
     * <p></p>
     */
    public static Object G_AndroidApp
     
    /**
     * <p></p>
     */
    public static Object G_WebUrl
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            baseUrl = selectedVariables['baseUrl']
            token = selectedVariables['token']
            G_AndroidApp = selectedVariables['G_AndroidApp']
            G_WebUrl = selectedVariables['G_WebUrl']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
