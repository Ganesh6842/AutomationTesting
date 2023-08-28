package Project;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Half_Window {

	public static void main(String[] args) throws InterruptedException {
	   ChromeDriver driver = new ChromeDriver();
	   Thread.sleep(3000);
        driver.get("http://www.facebook.com");
        Thread.sleep(3000);
        Dimension dimension = driver.manage().window().getSize();
       int Dimension_height = dimension.getHeight();
            int Dimension_width = dimension.getWidth();
            Thread.sleep(3000);
            Dimension d = new Dimension(Dimension_width/3, Dimension_height/3);
     	         driver.manage().window().setSize(d);
     	        Thread.sleep(3000);
	        driver.close();
			}
}
	


