package com.actitime.testscript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.objectrepository.HomePage;
import com.actitime.objectrepository.TaskListPage;

@Listeners(com.actitime.generics.ListenerImplementation.class)
public class CreateCustomer {

	@Test
	public void testCreateCustomer() {
		
//		HomePage h=new HomePage(driver);
//		h.getTaskMenu().click();
//		
//		TaskListPage t=new TaskListPage(driver);
//		t.getAddNewBtn().click();
//		
//		t.getNewCustomerMenu().click();
//		
//		t.getEnterCustomerDescriptionTBX().sendKeys(customername);
//		
//		t.getCustomerDescription().sendKeys(customerDescription);
//		
//		t.getSelectCustomerDropDown().click();
//		
//		t.getOurcompanyOption().click();
	}
}
