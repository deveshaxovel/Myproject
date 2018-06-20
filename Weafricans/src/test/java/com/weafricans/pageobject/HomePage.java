package com.weafricans.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	@FindBy(xpath="//i[@class='fa fa-home fa-lg']")
	private WebElement HomeBtn;
	@FindBy(xpath="//a[contains(text(),'Services')]")
	private WebElement ServicesBtn;
	@FindBy(xpath="//a[contains(text(),'Event Login')]")
	private WebElement EventLoginBtn;
	@FindBy(xpath="//a[contains(text(),'Premium Subscription Plan')]")
	private WebElement PremiumSibscriptionPlanBtn;
	@FindBy(xpath="//a[contains(text(),'Sponsor Banner Package')]")
	private WebElement SponcerBannerPackageBtn;
	@FindBy(xpath="//a[contains(text(),'Business Ads Package')]")
	private WebElement BusinessAdsPackageBtn;
	@FindBy(xpath="//a[contains(text(),'Event Ads Package.')]")
	private WebElement EventAdsPackage;
	@FindBy(xpath="//a[contains(text(),'Register Business ')]")
	private WebElement RegisterBusinessBtn;
	@FindBy(xpath="//a[starts-with(text(),'Login')]")
	private WebElement LoginBtn;
	@FindBy(xpath="//a[contains(text(),'Contact Us')]")
	private WebElement ContactsUsBtn;
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		}
	public WebElement getHomeBtn(){
		return HomeBtn;	
	}
	public WebElement getServicesBtn(){
		return ServicesBtn;
	}
	public WebElement getEventLoginBtn(){
		return EventLoginBtn;
	}
	public WebElement getPremiumSibscriptionPlanBtn(){
		return PremiumSibscriptionPlanBtn;
	}
	public WebElement getSponcerBannerPackageBtn(){
		return SponcerBannerPackageBtn;
	}
	public WebElement getBusinessAdsPackageBtn(){
		return BusinessAdsPackageBtn;
	}
	public WebElement getEventAdsPackage(){
		return EventAdsPackage;
	}
	public WebElement getRegisterBusinessBtn(){
		return RegisterBusinessBtn;
	}
	public WebElement getLoginBtn(){
		return LoginBtn;
	}
	public WebElement getContactsUsBtn(){
		return ContactsUsBtn;
	}
	
}
