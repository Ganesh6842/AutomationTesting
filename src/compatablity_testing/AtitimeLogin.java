package compatablity_testing;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AtitimeLogin extends Base_clas {
	@Test
	public void testlogin() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
	}
}
