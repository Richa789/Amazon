package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.amazon.genericLibraries.BaseTest;

public class FinalSummaryPage extends BaseTest {
  @FindBy(xpath="//span[@class='a-size-medium sc-product-title a-text-bold']") private WebElement bookName;
  public WebElement getBookName() {
	  return bookName;
  }
  public void BookName() {
	 bookName.click();
	  }
  
  
  @FindBy(xpath="(//div[@class='a-row a-spacing-mini sc-subtotal sc-java-remote-feature'])[1]") private WebElement totalPrice;
  public WebElement getTotalPrice() {
	  return totalPrice;
  }
  public void TotalPrice(){
	 totalPrice.click();
  }
  
  
  public FinalSummaryPage() {
	  PageFactory.initElements(driver, this);
  }
 
	
}


