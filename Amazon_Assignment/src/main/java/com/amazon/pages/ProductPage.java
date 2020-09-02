package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.genericLibraries.BaseTest;

public class ProductPage extends BaseTest{
	@FindBy(id="add-to-cart-button") private WebElement addToCart;
	public WebElement getAddToCartButton() {
		return addToCart;
	}
	public void clickOnButton() {
		addToCart.click();
	}
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}

}
