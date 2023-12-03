package pruebas;
import org.junit.jupiter.api.Test;

import lógica.ProductoMenu;
import lógica.Restaurante;
import lógica.Ingrediente;
import lógica.ProductoAjustado;

import static org.junit.jupiter.api.Assertions.*;
public class ProductoAjustadoTest {
	@Test

	public void testTodoProductoMenu(){
		// Arrange
		ProductoMenu prod=new ProductoMenu("corral", 14000);
		
		ProductoAjustado prodAj=new ProductoAjustado(prod);
		
		
		Ingrediente nuevoIng= new Ingrediente("lechuga",1000);
		Ingrediente quitIng=new Ingrediente("tomate",1000);
				//Act
		
		prodAj.agregarIngrediente(nuevoIng);
		prodAj.quitarIngrediente(quitIng);
		String txtFactPTest=prodAj.generarTextoFactura();
		//Assert
		assertEquals(prodAj.getPrecio(),15000);
		
		assertEquals("corral   14000\n    con lechuga   1000\n"
				+ "    sin tomate"+"\n",txtFactPTest);
		
		
	}
}
