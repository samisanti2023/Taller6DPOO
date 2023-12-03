package pruebas;
import org.junit.jupiter.api.Test;

import lógica.ProductoMenu;
import lógica.Restaurante;

import static org.junit.jupiter.api.Assertions.*;
public class ProductoMenuTest {

@Test

public void testTodoProductoMenu(){
	// Arrange
	ProductoMenu prod=new ProductoMenu("corral", 14000);
	
	String txtFactPTest=prod.generarTextoFactura();
	
	assertEquals("corral  14000",txtFactPTest);
	
	
}

}
