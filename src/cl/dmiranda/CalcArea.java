package cl.dmiranda;
//OCP: abierto para extensiones del sist pero sin modificar el cod
public class CalcArea {  //OCP

	public int calcularAreaTotal (Forma [] formas)  {  //agrega nuevas formas sin modificar el cod.
		
		int areaTotal = 0;
		for (Forma forma : formas) {
            areaTotal += forma.calcularArea();
        }
        return areaTotal;
    }
	}
	

