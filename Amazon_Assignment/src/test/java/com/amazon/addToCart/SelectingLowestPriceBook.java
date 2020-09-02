package com.amazon.addToCart;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.amazon.genericLibraries.BaseTest;
import com.amazon.genericLibraries.FileLibrary;
import com.amazon.genericLibraries.WebDriverCommonLibraries;
import com.amazon.pages.AfterClickingOnNext;
import com.amazon.pages.Cart;
import com.amazon.pages.FinalSummaryPage;
import com.amazon.pages.HomePage;
import com.amazon.pages.ProductPage;
import com.amazon.pages.SearchResultsPage;

@Listeners(com.amazon.genericLibraries.MyListener.class)
public class SelectingLowestPriceBook extends BaseTest{
	@Test
	public void addingProduct() throws IOException, InterruptedException {
		HomePage homePage = new HomePage();
		FileLibrary flib = new FileLibrary();
		WebDriverCommonLibraries wlib = new WebDriverCommonLibraries();
		wlib.waitForPageTitle(flib.getPropKeyValue(PROPERTY_PATH, "pageTitle"));
		wlib.verifyPage(wlib.getPageTitle(), flib.getPropKeyValue(PROPERTY_PATH, "pageTitle"), "Page Title");
		homePage.typeInSearchBox("Selenium Books");
		homePage.clickSubmitButton();
		//Thread.sleep(4000);
		wlib.waitForPageTitle(flib.getPropKeyValue(PROPERTY_PATH, "searchResultsPagetitle"));
		wlib.verifyPage(wlib.getPageTitle(), flib.getPropKeyValue(PROPERTY_PATH, "searchResultsPagetitle"), "Search Page Title ");
		wlib.scrollDown();
		SearchResultsPage srp = new SearchResultsPage();
		srp.clickNextButton();
		Thread.sleep(4000);
		AfterClickingOnNext ac = new AfterClickingOnNext();
		ac.selectMinimumPrice();
		ac.clickOnBook();
		wlib.waitForPageTitle(flib.getPropKeyValue(PROPERTY_PATH, "productPageTitle"));
		wlib.verifyPage(wlib.getPageTitle(), flib.getPropKeyValue(PROPERTY_PATH, "productPageTitle"), "Product page title ");
		ProductPage productPage = new ProductPage();
		productPage.clickOnButton();
		wlib.waitForPageTitle(flib.getPropKeyValue(PROPERTY_PATH, "cartPageTitle"));
		wlib.verifyPage(wlib.getPageTitle(), flib.getPropKeyValue(PROPERTY_PATH, "cartPageTitle"), "Cart page title");
		Thread.sleep(4000);
		Cart cart = new Cart();
		cart.clickOnCart();
		Thread.sleep(4000);
		FinalSummaryPage finalPage = new FinalSummaryPage();
		if(finalPage.getBookName().isDisplayed()) {
			System.out.println(finalPage.getBookName().getText());
		}
		if(finalPage.getTotalPrice().isDisplayed()) {
			System.out.println(finalPage.getTotalPrice().getText());
		}
	   }

}
