package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	    features = {
	        "src/test/resources/1BusquedaCelular.feature",
	        "src/test/resources/2Precio2000.feature",
	        "src/test/resources/3ofertas.feature",
	        "src/test/resources/4Relampago.feature",
	        "src/test/resources/5Liquidacion.feature",
	        "src/test/resources/6Supermercado.feature",
	        "src/test/resources/7CuidadosDelHogar.feature",
	        "src/test/resources/8TrabajaConNosotros.feature",
	        "src/test/resources/9OfertasEmpleo.feature",
	        "src/test/resources/10Postularse.feature"
	    },
		
glue = {"Steps"}

)

public class Run extends AbstractTestNGCucumberTests {
}