package paquete1;

import java.util.Random;

public class Acitivdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
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
	}

}
