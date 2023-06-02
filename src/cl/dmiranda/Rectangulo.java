package cl.dmiranda;
//subclass
public class Rectangulo extends Forma{  //integracion Liskov en subclase en vez de la superclase
	private int altura;
	private int ancho;
	
	public Rectangulo(String nombre, int altura, int ancho)  {
		super(nombre);
		this.altura=altura;
		this.ancho=ancho;	
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	public int calcularArea()  {  //subclase implementa su propia logica para calcular el área
		return ancho * altura;
	}
}
