package pruebas;
import org.junit.jupiter.api.Test;

import lógica.ProductoMenu;
import lógica.Restaurante;
import lógica.Combo;
import lógica.Ingrediente;
import lógica.Pedido;
import lógica.PedidoException;
import lógica.ProductoAjustado;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class PedidoTest {
	@Test

	public void testTodoProductoMenu() throws PedidoException, IOException{
	Combo combo=new Combo(10, "corral");
	
	ProductoMenu papas= new ProductoMenu("Papas medianas",5500);
	ProductoMenu hamburguesa= new ProductoMenu("corral",14000);
	ProductoMenu gaseosa= new ProductoMenu("gaseosa",5000);
	combo.agregarPapasACombo(papas);
	combo.agregarHamburguesaACombo(hamburguesa);
	combo.agregarBebidaACombo(gaseosa);
	
	Pedido ped1=new Pedido("Josué","Calle 100");
	ped1.agregarProducto(combo);
	
	///Assert
	
	
	File nuevaFactura = new File("./facturas/factura0.txt");
	ped1.guardarFactura(nuevaFactura);
	
	BufferedReader br = new BufferedReader(new FileReader("./facturas/factura0.txt"));
	String linea = br.readLine(); 
	String factPrueba="";
	while (linea != null) {
		factPrueba=factPrueba+linea+"\n";
		linea = br.readLine(); // Leer la siguiente línea
	}
	br.close();
	assertEquals("Hamburguesas el corral\n"+"\n"+"\n"
	+ "ID Pedido: "+0 +"\n"
	+ "Nombre: "+"Josué\n"
	+ "Dirección: Calle 100" +"\n"+
	"corral      22050"+"\n"+
	"SUBTOTAL: 22050" +"\n"+
	"IVA: 4189.5" +"\n"+
	"Total: 26239"+"\n",factPrueba);
	int i=1;
	while(i<6) {
	ped1.agregarProducto(combo);
	i++;
	
	    }
    assertThrows(PedidoException.class, () -> {
        ped1.agregarProducto(combo);
    }, "Se esperaba una excepción PedidoException");
    assertEquals(Pedido.getNumeroPedidos(),1);
	}
}


