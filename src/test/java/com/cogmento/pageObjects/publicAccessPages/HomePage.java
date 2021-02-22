/**
 * 
 */
package com.cogmento.pageObjects.publicAccessPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cogmento.pageObjects.GenericPage;

import util.ConfigUtil;

/**
 * @author Harini
 *
 */
public class HomePage extends GenericPage {
	// page entities
	private WebElement cookieConfirmationBtn;
	private WebElement signUpBtn;
	private WebElement loginBtn;

	// constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public WebElement getCookieConfirmationBtn() {
		// <button style="border-color: rgb(0, 0, 0); font-size: 0.9em;">Got It</button>
		if (getDriver().findElements(By.xpath("//button[contains(text(),'Got It')]")).size() > 0) {
			cookieConfirmationBtn = getDriver().findElement(By.xpath("//button[contains(text(),'Got It')]"));
		}
		return cookieConfirmationBtn;
	}

	// getters and setters
	public WebElement getSignUpBtn() {
		signUpBtn = getDriver().findElement(By.xpath("//span[contains(text(),'sign up')]"));
		return signUpBtn;
	}

	public WebElement getLoginBtn() {
		// <a href="https://ui.cogmento.com" class="btn btn-primary btn-xs-2 btn-shadow
		// btn-rect btn-icon btn-icon-left"><span class="icon icon-xs
		// mdi-chart-bar"></span><span>Log In</span></a>
		// <span>Log In</span>
		loginBtn = getDriver().findElement(By.xpath("//span[contains(text(),'Log In')]"));
		return loginBtn;
	}

	// actions
	public void go2SignUpPage() {
		getSignUpBtn().click();
	}

	public void go2LoginPage() {
		getLoginBtn().click();
	}

	public void loadHomePage() {
		getDriver().get(ConfigUtil.getProperty("homePageUrl"));
	}
}