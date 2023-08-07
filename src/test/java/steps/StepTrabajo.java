package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.HomePage;
import pom.TrabajoPage;

public class StepTrabajo {

	 private WebDriver driver;
	    private HomePage homePage;
	    private TrabajoPage trabajoPage;

	  /*  @Given("Ingresar a la pagina Mercado Libre")
	    public void ingresar_a_la_pagina_Mercado_Libre() {
	        homePage = new HomePage(driver);
	        driver = homePage.chromeDriverConnection();
	        homePage.visit("https://www.mercadolibre.com.mx/");
	    } */

	    @And("dar click en trabaja con nosotros")
	    public void dar_click_en_trabaja_con_nosotros() {
	        homePage.clickTrabajaConNosotros();
	    }
	    
	    @When("ver las ofertas laborales")
	    public void ver_las_ofertas_laborales() {
	        TrabajoPage trabajoPage = new TrabajoPage(driver); 
	        trabajoPage.clickVerOport(); }
	    

	    @When("Buscar una oferta")
	    public void buscar_una_oferta() {
	        trabajoPage.buscarT("QA"); 
	    }

	    @When("dar click en buscar")
	    public void dar_click_en_buscar() {
	        trabajoPage.clickBuscarT();
	    }

	    @Then("postularse en la oferta")
	    public void postularse_en_la_oferta() {
	        trabajoPage.clickPostularse();
	    }
	}


