package cl.dmiranda;

public class Cuadrado extends Forma{ 
	/*integracion Liskov en subclase sin afectar su comportamiento
	 * manteniendo la misma interfaz
	 */
	
	private int lado;
	
	public Cuadrado(String nombre, int lado)  {
		super(nombre);
		this.setLado(lado);
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public int calcularArea()  {  //subclase implementa su propia logica para calcular el área
		return lado * lado;
	}

}
