package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfertasPage extends Base{
	

	public OfertasPage(WebDriver driver) {
		super(driver);
}
	
	//Identificar elementos
	By BtnLiquidacion = By.xpath("//body/main[@id='root-app']/div[1]/section[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[5]/div[1]/img[1]");
	By BtnRelampago = By.xpath("//a[contains(text(),'Supermercado')]");
	

	
	public void clickLiquidacion() {
	click(BtnLiquidacion);
	}
	
	public void clickRelampago() {
		click(BtnRelampago);
	}
}
	
	
	
	