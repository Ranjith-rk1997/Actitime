package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
public WebDriver driver;
@SuppressWarnings("deprecation")
@BeforeTest
public void openBrowser() {
	Reporter.log("openBrowser", true);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
}
@BeforeMethod
public void Login() throws IOException {
	Reporter.log("Login", true);
	FileLib f = new FileLib();
	 String key = f.getpropertyData("url");
	 String un = f.getpropertyData("username");
	 String pwd = f.getpropertyData("password");
	driver.get(key);
	LoginPage l = new LoginPage(driver);
	l.setlogin(un, pwd);
}
@SuppressWarnings("deprecation")
@AfterMethod
public void logout()  {
	Reporter.log("logout", true);
	HomePage h = new HomePage(driver);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	h.getLogout();
}
@AfterTest
public void closeBrowser() {
	Reporter.log("closeBrowser", true);
	driver.quit();
}
}
