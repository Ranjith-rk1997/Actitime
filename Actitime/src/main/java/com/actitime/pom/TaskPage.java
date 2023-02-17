package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskPage {
@FindBy(xpath = "//div[text()='Add New']")
private WebElement addNewBtn;
@FindBy(xpath = "//div[text()='+ New Customer']")
private WebElement newCustomer;
@FindBy(xpath = "(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement custName;
@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
private WebElement custDesc;
@FindBy(xpath = "(//div[@class='dropdownButton'])[15]")
private WebElement selectCustDD;
@FindBy(xpath = "//div[text()='Our company' and @class='itemRow cpItemRow ']")
private WebElement ourCompany;
@FindBy(xpath = "//div[@class='components_button_label' and text()='Create Customer']")
private WebElement createCustomer;
@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[@class='title']")
private WebElement verifyCustomer;



public TaskPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}


public WebElement getAddNewBtn() {
	return addNewBtn;
}
public WebElement getNewCustomer() {
	return newCustomer;
}
public WebElement getCustName() {
	return custName;
}
public WebElement getCustDesc() {
	return custDesc;
}
public WebElement getSelectCustDD() {
	return selectCustDD;
}
public WebElement getOurCompany() {
	return ourCompany;
}
public WebElement getCreateCustomer() {
	return createCustomer;
}
public WebElement getVerifyCustomer() {
	return verifyCustomer;
}


@FindBy(xpath = "//div[@class='item createNewProject']")
private WebElement newProjectBtn;
@FindBy(xpath = "//input[@class='projectNameField inputFieldWithPlaceholder inputNameField']")
private WebElement projectnameTxt;
@FindBy(xpath = "//div[@class='comboboxButton focused']/div[@class='dropdownButton']")
private WebElement selectCustomerDD;
@FindBy(xpath = "//div[text()='HDFC_009'and @class='itemRow cpItemRow selected']")
private WebElement selectCustomer;
public WebElement getSelectCustomer() {
	return selectCustomer;
}
@FindBy(xpath = "//textarea[@placeholder='Add Project Description']")
private WebElement projectDescriptionTxt;
@FindBy(xpath = "(//td[@class='nameCell first']/input)[1]")
private WebElement taskNameTxt;
@FindBy(xpath = "//div[text()='Create Project']")
private WebElement createProjectBtn;



public WebElement getNewProjectBtn() {
	return newProjectBtn;
}
public WebElement getProjectnameTxt() {
	return projectnameTxt;
}
public WebElement getSelectCustomerDD() {
	return selectCustomerDD;
}
public WebElement getProjectDescriptionTxt() {
	return projectDescriptionTxt;
}
public WebElement getTaskNameTxt() {
	return taskNameTxt;
}
public WebElement getCreateProjectBtn() {
	return createProjectBtn;
}


}

