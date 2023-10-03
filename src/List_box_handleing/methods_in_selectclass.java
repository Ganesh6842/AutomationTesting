package List_box_handleing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class methods_in_selectclass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///D:/SeleniumMorning/Html/handle.html");
		WebElement tgt = driver.findElement(By.id("list"));
		Select s = new Select(tgt);
		List<org.openqa.selenium.WebElement> all = s.getOptions();
		System.out.println(all.size());
//		print all option
		for (int i = 0; i < all.size(); i++) {
			String alllist = all.get(i).getText();
			System.out.println("count-->" + alllist);

		}
//		select & print only testing option
		for (int i = 0; i < all.size(); i++) {
			String testing = all.get(i).getText();
			if (testing.contains("Testing")) {
				s.selectByIndex(i);
			}
		}
//		testing option get text count
		List<WebElement> testing_option = s.getAllSelectedOptions();
		int count = testing_option.size();
		System.out.println("count Testing-->" + count);

//     testing option as a txt output
		for (int i = 0; i < testing_option.size(); i++) {
			String txt = testing_option.get(i).getText();
			System.out.println("testing output txt-->" + txt);
		}

//			deselect option
		s.deselectAll();

//			alternate selected option
		for (int i = 0; i < all.size(); i = i + 2) {
			s.selectByIndex(i);
		}

//			print alternative option
		List<WebElement> alter_option = s.getAllSelectedOptions();
		for (int i = 0; i < alter_option.size(); i++) {
			String txt1 = alter_option.get(i).getText();
			System.out.println("alternate txt-->" + txt1);
		}
// 			deselected alternative option

		for (int i = 0; i < alter_option.size(); i++) {
			String txt1 = alter_option.get(i).getText();
			if (txt1.contains("Testing")) {
				s.deselectByIndex(i);
				System.out.println("deselected option-->" + txt1);
			}
		}
		System.out.println("task");
//		driver.close();
	}
}
