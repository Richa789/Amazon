package com.amazon.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.amazon.genericLibraries.BaseTest;

public class AfterClickingOnNext extends BaseTest {
	@FindBy(xpath="//span[@class='a-price-whole']") private List<WebElement> priceList;
	public int getPriceList() {
		return priceList.size();
	}
	public void selectMinimumPrice() {
		if(priceList.contains(0)) {
		Reporter.log("Minimum value is 0", true);
		}
	}

  @FindBy(xpath="//span[.='Environmental Geology Laboratory Manual']") private WebElement minimumPricedBook;
  public WebElement getMinimumPricedBook() {
	return minimumPricedBook;
  }
  public void clickOnBook() {
	  minimumPricedBook.click();
  }
  
  public AfterClickingOnNext() {
	  PageFactory.initElements(driver, this);
  }

}
