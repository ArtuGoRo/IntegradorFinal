package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base{
	

	public HomePage(WebDriver driver) {
		super(driver);
}
	
	//Identificar elementos
	
	By InputBuscar = By.xpath("//input[@id='cb1-edit']");
	By BtnBuscar = By.xpath("//header/div[1]/div[2]/form[1]/button[1]/div[1]");
	
	By BtnOfertas = By.xpath("//a[contains(text(),'Ofertas')]");
	By BtnLiquidacion	= By.xpath("//body/main[@id='root-app']/div[1]/section[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[5]/div[1]/img[1]");
	By BtnTrabaja = By.xpath("//a[contains(text(),'Trabaja con nosotros')]");
	By BtnSuperMer	= By.xpath("//a[contains(text(),'Supermercado')]");
	By Btn2000p = By.xpath("//span[contains(text(),'Hasta $ 2,000')]");
	By BtnOrdenar = By.xpath("//span[@id=':R5cad9:-display-values']");
	By BtnMayor = By.xpath("//span[contains(text(),'Mayor precio')]");
	
	
	public void buscarProducto(String producto) {
		type(producto, InputBuscar);
	}
	
	public void clickBuscar() throws InterruptedException {
		Thread.sleep(1000);
		click(BtnBuscar);
		
	}
	
	public void clickOfertas() throws InterruptedException {
		Thread.sleep(1000);
        click(BtnOfertas);
    }

    public void clickLiquidacion() {
        click(BtnLiquidacion);
    }

    public void clickTrabajaConNosotros() {
        click(BtnTrabaja);
    }

    public void clickSupermercado() {
        click(BtnSuperMer);
    }

    public void clickHasta2000() {
    	click(Btn2000p);
    }
    
    public void clickOrdenar() {
    	click(BtnOrdenar);
    }	
    	
    public void clickMayor() {
    	click(BtnMayor);
    	
    
    }
}

	
	
	
	
	