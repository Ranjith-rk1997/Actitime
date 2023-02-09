package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(className = "logout")
private WebElement lgoutBtn;
@FindBy(xpath = "//div[text()='Tasks']")
private WebElement tasktab;

public HomePage(WebDriver driver) {
PageFactory.initElements(driver,this);
}
public void getLogout()  {
	lgoutBtn.click();
}
public void getTaskPage() {
	tasktab.click();
}
}
