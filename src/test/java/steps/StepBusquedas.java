package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pom.HomePage;

public class StepBusquedas {

    private WebDriver driver;
    private HomePage homePage;

    @Given("Ingresar a la pagina Mercado Libre")
    public void ingresar_a_la_pagina_Mercado_Libre() {
        homePage = new HomePage(driver);
        driver = homePage.chromeDriverConnection();
        homePage.visit("https://www.mercadolibre.com.mx/");
    }

    @Given("Ir a la barra de busqueda")
    public void ir_a_la_barra_de_busqueda() {
        homePage.buscarProducto("Celular");
    }

    @When("darle click en el boton buscar")
    public void darle_click_en_el_boton_buscar() throws InterruptedException {
        homePage.clickBuscar();
    }
    @Then("Filtrar precio hasta 2000")
    public void filtrar_precio_hasta_2000() {
        homePage.clickHasta2000(); 
        }
}


