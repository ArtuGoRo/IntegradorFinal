package steps;

	import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
	import io.cucumber.java.en.When;
	import io.cucumber.java.en.Then;

	import pom.HomePage;
	import pom.OfertasPage;
	import pom.SuperMercadoPage;

	public class StepOfertas {

	    private WebDriver driver;
	    private HomePage homePage;

	  /*  @Given("Ingresar a la pagina Mercado Libre")
	    public void ingresar_a_la_pagina_Mercado_Libre() {
	        homePage = new HomePage(driver);
	        driver = homePage.chromeDriverConnection();
	        homePage.visit("https://www.mercadolibre.com.mx/");
	    }*/

	    @Given("dar click en ofertas")
	    public void dar_click_en_ofertas() throws InterruptedException {
	        homePage.clickOfertas();
	    }

	    @Then("dar click en ofertas relampago")
	    public void dar_click_en_ofertas_relampago() {
	        OfertasPage ofertasPage = new OfertasPage(null);
			ofertasPage.clickRelampago(); 
	    }
	    
	    @Then("dar click en Liquidaciones")
	    public void dar_click_en_Liquidaciones() {
	    	OfertasPage ofertasPage = new OfertasPage(null);
			ofertasPage.clickLiquidacion();
	    }
	    

	    @Given("dar click en en apartado supermercado")
	    public void dar_click_en_en_apartado_supermercado() {
	        homePage.clickSupermercado(); 
	    }
	    @And("dar click en Cuidados del hogar")
	    public void dar_click_en_cuidados_del_hogar() {
	    	SuperMercadoPage superMercadoPage = new SuperMercadoPage(driver);
	        superMercadoPage.clickCuidadoH(); 
	    }
	
	
}
	
