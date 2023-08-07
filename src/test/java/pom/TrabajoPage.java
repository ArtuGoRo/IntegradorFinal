package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrabajoPage extends Base{
	

	public TrabajoPage(WebDriver driver) {
		super(driver);
}
	


	By BtnTrabaja = By.xpath("//a[contains(text(),'Trabaja con nosotros')]");
	By InputBuscarT = By.xpath("//body/div[@id='__next']/div[2]/main[1]/div[1]/form[1]/div[1]/input[1]");
	By BtnBuscarT = By.xpath("//body/div[@id='__next']/div[2]/main[1]/div[1]/form[1]/div[1]/div[1]/button[1]/*[1]");
	By BtnVerOport = By.xpath("//body/div[@id='__next']/div[2]/main[1]/div[1]/form[1]/div[1]/div[1]/button[1]/*[1]");
	By InputMeli = By.xpath("//div[contains(text(),'Busca')]");
	By IrMeli = By.xpath("//button[contains(text(),'Ir')]");
	By BtnPostularse = By.xpath("//body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[4]/div[1]/span[1]/button[1]/span[1]");

	
	public void clickTrabaja() {
		click(BtnTrabaja);
	}
	
	public void clickBuscarT() {
		click(BtnBuscarT);
		
	}
	
	public void buscarT(String trabajo) {
		type(trabajo, InputBuscarT);
	}
	
	public void clickVerOport() {
		click(BtnVerOport);
	
	}
	
	public void buscarMeli(String Meli) {
		type(Meli, InputMeli);
	}
	
	public void clickMeli() {
		click(IrMeli);
	}
	
	public void clickPostularse() { 
		click(BtnPostularse);
	}
	
	
	
	
	
	
}