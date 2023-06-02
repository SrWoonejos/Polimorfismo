package cl.dmiranda; 
/*OCP herencia sin modificar el cod de la superclase, 
 * abiertas para su extensión pero cerradas para su modificación.
 *  
superclase*/

public class Forma {
	
private String nombre;
public Forma(String nombre)  {
	this.setNombre(nombre);
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int calcularArea() {
	return 0;
}


}
