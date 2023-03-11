<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Login</name>
   <tag></tag>
   <elementGuidId>2f719d30-b887-4b4f-bdf7-3fc028f01fd7</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;email\&quot;: \&quot;${username}\&quot;,\n    \&quot;password\&quot;: \&quot;${password}\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>85cbe6ff-8877-49fe-80f6-91ab00e96c64</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.5</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>${GlobalVariable.baseUrl}/api/login</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>''</defaultValue>
      <description>username</description>
      <id>71fee420-34ae-4d00-a380-3fa9207c38e4</id>
      <masked>false</masked>
      <name>username</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description>password</description>
      <id>c155cae9-2547-46e9-95ec-16a664a3bce9</id>
      <masked>false</masked>
      <name>password</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import java.nio.file.WatchService
import java.time.LocalDate

import org.apache.commons.javaflow.bytecode.transformation.bcel.analyser.LocalVariables

import com.kms.katalon.core.testcase.Variable
import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper


RequestObject request = WSResponseManager.getInstance().getCurrentRequest()
ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()

def jsonSlurper = new JsonSlurper()
def jsonResponse = jsonSlurper.parseText(response.getResponseText())
println(jsonResponse)

</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
