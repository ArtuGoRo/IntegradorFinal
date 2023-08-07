
@tag
Feature: Postularse

  @tag1
  Scenario: usuario se postula
Scenario: usuario busca ofertas de empleo
     Given Ingresar a la pagina Mercado Libre
    And dar click en trabaja con nosotros
		When ver las ofertas labolares 
		And Buscar una oferta
		And dar click en buscar
		Then postularse en la oferta
 