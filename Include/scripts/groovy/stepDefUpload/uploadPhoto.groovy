package stepDefUpload
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration


class uploadPhoto {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User is on dashboard page")
	def User_is_on_dashboard_page() {
		WebUI.openBrowser('')
		WebUI.callTestCase(findTestCase('Login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User clicks my info's button")
	def User_clicks_my_info() {
		WebUI.callTestCase(findTestCase('Success Upload Photo'), [:], FailureHandling.STOP_ON_FAILURE)
	}
		/*@When("User clicks my info's button")
		 def User_clicks_my_info() {
		 WebUI.click(findTestObject('Dashboard/a_My Info'))
		 }
		 @And("User clicks img profile button")
		 def User_clicks_img_profile() {
		 WebUI.click(findTestObject('Dashboard/img profile'))
		 }
		 @And("User upload file")
		 def User_upload_file() {
		 WebUI.uploadFile(findTestObject('Dashboard/input file'), null, FailureHandling.STOP_ON_FAILURE)(findTestObject('Dashboard/input file'), RunConfiguration+'/adibul.jpg')
		 }
		 @And("User clicks button save")
		 def User_clicks_button_save() {
		 WebUI.click(findTestObject('Dashboard/btn save'))
		 }
		 @Then("User has successfully edited photo profile")
		 def User_successfully_edited_photo(String status) {
		 WebUI.verifyElementPresent(findTestObject('Dashboard/toastSuccess_uploadfoto'), 0)
		 }*/

	@Then("User has successfully edited photo profile")
	def User_successfully_edited_photo() {
		WebUI.verifyElementPresent(findTestObject('Dashboard/toastSuccess_uploadfoto'), 0)
	
	}
}