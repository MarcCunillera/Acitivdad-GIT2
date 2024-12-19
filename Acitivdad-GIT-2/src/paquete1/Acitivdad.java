package paquete1;

import java.util.Random;
import java.util.Scanner;

public class Acitivdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s = new Scanner(System.in);
        Random random = new Random();

        int[][] matriz = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = random.nextInt(100) + 1; 
            }
        }
        
        System.out.println("Matriz de 5x5 con números aleatorios:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t"); 
            }
            System.out.println(); 
        }
        
        System.out.print("Ingrese un número para buscar en la matriz: ");
        int numeroBuscado = s.nextInt();
        
        boolean encontrado = false;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] == numeroBuscado) {
                    System.out.println("Número encontrado en la posición: Fila " + i + ", Columna " + j);
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) {
                break;
            }
        }
        
        if (!encontrado) {
            System.out.println("El número no existe en la matriz.");
        }

        
	}

}