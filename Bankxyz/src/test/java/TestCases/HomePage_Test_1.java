package TestCases;

import WebPages.Home_Page;

public class HomePage_Test_1  extends DriverSetUp{
	public void Homepage_p() throws InterruptedException {
		Home_Page HP = new Home_Page(driver);
		HP.Managerbutton();
	}
}