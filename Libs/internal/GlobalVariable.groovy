package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object baseUrl
     
    /**
     * <p></p>
     */
    public static Object timeout
     
    /**
     * <p></p>
     */
    public static Object ignoreRegex
     
    /**
     * <p></p>
     */
    public static Object authorization
     
    /**
     * <p></p>
     */
    public static Object issue_key
     
    /**
     * <p></p>
     */
    public static Object update_issue_key
     
    /**
     * <p></p>
     */
    public static Object latest_response
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['baseUrl' : 'https://the-internet.herokuapp.com/', 'timeout' : 15, 'ignoreRegex' : false, 'authorization' : 'Basic dHJvbmdidWlAa21zLXRlY2hub2xvZ3kuY29tOkJBR1J5QWZ1UmV2dTB4clhkclpMNkVDRA==', 'issue_key' : 'KD-1000', 'update_issue_key' : 'KD-1001', 'latest_response' : ''])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        baseUrl = selectedVariables['baseUrl']
        timeout = selectedVariables['timeout']
        ignoreRegex = selectedVariables['ignoreRegex']
        authorization = selectedVariables['authorization']
        issue_key = selectedVariables['issue_key']
        update_issue_key = selectedVariables['update_issue_key']
        latest_response = selectedVariables['latest_response']
        
    }
}
