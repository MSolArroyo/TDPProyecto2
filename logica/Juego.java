package logica;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Juego {
	private Celda [][] tablero;  //Matriz de tipo Celda
	private int cantFilas;
	
	public Juego() {
		this.cantFilas = 9;
		tablero = new Celda[this.cantFilas][this.cantFilas]; //Creo Matriz con la misma cantidad de filas que de columnas
		
		
		
		//Inicializo la matriz
		for (int i =0; i<cantFilas; i++) { 
			for (int j =0; j<cantFilas; j++) {
				Random rand = new Random();
				int value = rand.nextInt(2); //ME DA 0 O 1
								
				tablero[i][j] = new Celda();
				//De acuerdo a value decidir si asignar un valor o no
				if (value == 0){
					// elijo aleatoriamente un valor entre 0 (incluido) y cantElementos (excluido)
					int valor = rand.nextInt(tablero[i][j].getCantElementos());
					
					
					
					
					tablero[i][j].setValor(valor);	
				}
			}		
		}
		
	}
	
	public void accionar(Celda c) {
		c.actualizar();
	}
	
	public Celda getCelda(int i, int j) {
		return this.tablero[i][j];
	}
	
	public int getCantFilas() {
		return this.cantFilas;
	}
}