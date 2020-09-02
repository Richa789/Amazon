package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.genericLibraries.BaseTest;

public class Cart extends BaseTest{
	@FindBy(xpath="//a[@id='hlb-view-cart-announce']") private WebElement cartButton;
	public WebElement getCartButton() {
		return cartButton;
	}
	public void clickOnCart() {
		cartButton.click();
	}
	
	public Cart() {
		PageFactory.initElements(driver, this);
	}

}
