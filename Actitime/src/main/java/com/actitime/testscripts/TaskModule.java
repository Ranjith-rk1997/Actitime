package com.actitime.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskPage;
//@Listeners(com.actitime.generic.ListenerImplementation.class)
public class TaskModule extends BaseClass {
	@Test
	public void createTask() throws InterruptedException {
		Reporter.log("createTask",true);
		HomePage h = new HomePage(driver);
		h.getTaskPage();
		Thread.sleep(3000);
		TaskPage t = new TaskPage(driver);
		t.getAddNewBtn().click();
		Thread.sleep(2000);
		t.getCreateProjectBtn().click();
		t.getProjectnameTxt().sendKeys("RK");
		t.getProjectDescriptionTxt().sendKeys("Ranjith");
		t.getSelectCustomerDD().click();
		t.getSelectCustomer().click();
		t.getProjectDescriptionTxt().sendKeys("KUMAr");
		t.getTaskNameTxt().sendKeys("kl");
		t.getCreateProjectBtn();
	}
}
