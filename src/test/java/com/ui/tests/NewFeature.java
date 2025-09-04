package com.ui.tests;

import org.testng.annotations.Test;

public class NewFeature extends TestBase {

	
	@Test(description = "new automation task", groups = { "e2e"})
	public void checkoutTest() {
		System.out.print("working on new feature...undera task");
	}
}