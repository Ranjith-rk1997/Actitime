package com.actitime.testscripts;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskPage;
//@Listeners(com.actitime.generic.ListenerImplementation.class)
public class CustomerModule extends BaseClass{
	@Test
public void createCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
	Reporter.log("createCustomer",true);
	FileLib f = new FileLib();
	String custName = f.getExcelData("Create Customer",1,3);
	String custDesc = f.getExcelData("Create Customer",1,4);
	HomePage h = new HomePage(driver);
	h.getTaskPage();
	Thread.sleep(3000);
	TaskPage t =new TaskPage(driver);
	t.getAddNewBtn().click();
	t.getNewCustomer().click();
	t.getCustName().sendKeys(custName);
	t.getCustDesc().sendKeys(custDesc);
	t.getSelectCustDD().click();
	t.getOurCompany().click();
	t.getCreateCustomer().click();
	String actualtext = t.getVerifyCustomer().getText();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.textToBePresentInElement(t.getVerifyCustomer(), custName));
	Assert.assertEquals(actualtext,custName);
}
/*	@Test(priority = 1)
public void editCustomer() {
	Reporter.log("editCustomer",true);

}
	@Test(priority = 2)
public void deleteCustomer() {
	Reporter.log("deleteCustomer",true);

}*/
}
