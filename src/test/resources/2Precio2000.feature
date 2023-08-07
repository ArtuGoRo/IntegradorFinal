
Feature: Precio 2000

  @tag1
  Scenario: Filtra precio de 2000
    Given Ingresar a la pagina Mercado Libre
    And Ir a la barra de busqueda
    When darle click en el boton 
		Then Filtrar precio hasta 2000
    
 