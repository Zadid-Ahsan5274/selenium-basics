package testng;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProviderDemo {

	/*
	 * @Test(dataProvider = "dataSet", dataProviderClass = DataProviderTest.class)
	 * public void test(String username, String password) {
	 * System.out.println(username + "====" + password); }
	 * 
	 * @Test(dataProvider = "dataSet1", dataProviderClass = DataProviderTest.class)
	 * public void test1(String username, String password, String test) {
	 * System.out.println(username + "====" + password + "====" + test); }
	 */

	@DataProvider(name = "create")
	public Object[][] dataSet1(Method m) {
		Object[][] testData = null;
		if (m.getName().equals("test")) {
			testData = new Object[][] { { "username1", "password1" }, { "username2", "password2" },
					{ "username3", "password3" }, { "username4", "password4" } };

		} else if (m.getName().equals("test1")) {
			testData = new Object[][] { { "username1", "password1", "third1" }, { "username2", "password2", "third2" },
					{ "username3", "password3", "third3" }, { "username4", "password4", "third4" } };

		}
		return testData;
	}

}
