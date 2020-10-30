package com.actitime.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TaskListPage {

	@FindBy(xpath="//div[.='Add New']")
	private WebElement AddNewBtn;

	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement NewCustomerMenu;

	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement EnterCustomerNameTBX;

	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description' ]")
	private WebElement EnterCustomerDescriptionTBX;

	@FindBy(xpath="//div[.='- Select Customer -'  and @class='emptySelection']")
	private WebElement SelectCustomerDropDown;


	@FindBy(xpath="//div[.='Our company' and @class='itemRow cpItemRow ']")
	private WebElement OurCompanyText;


	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement CreateCustomerPopUpBtn;


	public WebElement getAddNewBtn() {
		return AddNewBtn;
	}


	public void setAddNewBtn(WebElement addNewBtn) {
		AddNewBtn = addNewBtn;
	}


	public WebElement getNewCustomerMenu() {
		return NewCustomerMenu;
	}


	public void setNewCustomerMenu(WebElement newCustomerMenu) {
		NewCustomerMenu = newCustomerMenu;
	}


	public WebElement getEnterCustomerNameTBX() {
		return EnterCustomerNameTBX;
	}


	public void setEnterCustomerNameTBX(WebElement enterCustomerNameTBX) {
		EnterCustomerNameTBX = enterCustomerNameTBX;
	}


	public WebElement getEnterCustomerDescriptionTBX() {
		return EnterCustomerDescriptionTBX;
	}


	public void setEnterCustomerDescriptionTBX(WebElement enterCustomerDescriptionTBX) {
		EnterCustomerDescriptionTBX = enterCustomerDescriptionTBX;
	}


	public WebElement getSelectCustomerDropDown() {
		return SelectCustomerDropDown;
	}


	public void setSelectCustomerDropDown(WebElement selectCustomerDropDown) {
		SelectCustomerDropDown = selectCustomerDropDown;
	}


	public WebElement getOurCompanyText() {
		return OurCompanyText;
	}


	public void setOurCompanyText(WebElement ourCompanyText) {
		OurCompanyText = ourCompanyText;
	}


	public WebElement getCreateCustomerPopUpBtn() {
		return CreateCustomerPopUpBtn;
	}


	public void setCreateCustomerPopUpBtn(WebElement createCustomerPopUpBtn) {
		CreateCustomerPopUpBtn = createCustomerPopUpBtn;
	}

}
