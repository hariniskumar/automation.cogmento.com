/**
 * 
 */
package com.cogmento.pageObjects.userAccessPages.modules.companies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cogmento.pageObjects.userAccessPages.UserPageTemplate;

/**
 * @author Harini
 *
 */
public class CompanyListPage extends UserPageTemplate {
	/**
	 * 
	 */
	private WebElement newCompanyBtn;

	public CompanyListPage(WebDriver driver) {
		super(driver);
	}

	public WebElement getNewCompanyBtn() {
		newCompanyBtn = getDriver().findElement(By.xpath("//button[contains(text(),'Create')]"));
		return newCompanyBtn;
	}
}
