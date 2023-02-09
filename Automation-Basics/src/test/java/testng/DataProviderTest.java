package testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

	@Test(dataProvider = "create")
	public void test(String username, String password) {
		System.out.println(username + "====" + password);
	}

	@Test(dataProvider = "create")
	public void test1(String username, String password, String test) {
		System.out.println(username + "====" + password + "====" + test);
	}

	@DataProvider
	public Object[][] dataSet() {
		Object[][] dataSet = new Object[4][2];

		// First Row
		dataSet[0][0] = "user1";
		dataSet[0][1] = "pass1";

		// Second Row
		dataSet[1][0] = "user2";
		dataSet[1][1] = "pass2";

		// Third Row
		dataSet[2][0] = "user3";
		dataSet[2][1] = "pass3";

		// Fourth Row
		dataSet[3][0] = "user4";
		dataSet[3][1] = "pass4";

		return dataSet;

	}

	@DataProvider
	public Object[][] dataSet1() {
		Object[][] dataSet = new Object[4][2];

		return new Object[][] { { "username1", "password1", "test1" }, { "username2", "password2", "test2" },
				{ "username3", "password3", "test3" }, { "username4", "password4", "test4" } };

	}

}
