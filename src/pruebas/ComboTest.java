package pruebas;
import org.junit.jupiter.api.Test;

import lógica.ProductoMenu;
import lógica.Restaurante;
import lógica.Combo;
import lógica.Ingrediente;
import lógica.ProductoAjustado;

import static org.junit.jupiter.api.Assertions.*;
public class ComboTest {
	// Arrange
	@Test

	public void testTodoProductoMenu(){
	Combo combo=new Combo(10, "corral");
	
	ProductoMenu papas= new ProductoMenu("Papas medianas",5500);
	ProductoMenu hamburguesa= new ProductoMenu("corral",14000);
	ProductoMenu gaseosa= new ProductoMenu("gaseosa",5000);
	combo.agregarPapasACombo(papas);
	combo.agregarHamburguesaACombo(hamburguesa);
	combo.agregarBebidaACombo(gaseosa);
	
	///Assert
	String txtFactPTest=combo.generarTextoFactura();
	
	assertEquals("corral      22050",txtFactPTest);
}}
