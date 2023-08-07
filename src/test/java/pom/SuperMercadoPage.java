package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuperMercadoPage extends Base{
	

	public SuperMercadoPage(WebDriver driver) {
		super(driver);
}
	
	

	By BtnCuidadoHo = By.xpath("//body/main[@id='root-app']/div[@id='hub']/div[2]/article[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[7]/div[1]/a[1]/div[1]/div[1]/div[1]/img[1]");
	
	
	
	public void clickCuidadoH() {
		click(BtnCuidadoHo);
	}
	}