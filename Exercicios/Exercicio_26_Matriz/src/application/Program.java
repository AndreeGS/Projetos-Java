package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o tamanho M: ");
		int M = sc.nextInt();
		
		System.out.print("Informe o tamanho N: ");
		int N = sc.nextInt();
		
		int[][] vect = new int[M][N];
		
		for(int i = 0; i<M; i++) {
			
			for(int j = 0; j<N; j++) {
				
				System.out.print("Informe o valor na posição " + i + " x " + j + ": ");
				vect[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Informe o valor X para procura: ");
		int X = sc.nextInt();
			
		for( int i = 0; i < M; i++) {	
			for (int j = 0; j<N; j++) {
				
				if(vect[i][j] == X) {
					
					System.out.printf("\nPosição da ocorrência: " + i + ", " + j);		
			
					if(j > 0) {
						int left = vect[i][j-1];
						
						System.out.printf("\nLeft: " + left);		

					}
					if(i > 0) {
						int up = vect[i-1][j];
						System.out.printf(", Up: " + up);		

					}
					if(j < vect[i].length-1) {
						int right = vect[i][j+1];
						System.out.printf(", Right: " + right);		

					}

					if (i < vect.length-1) {
						int down = vect[i+1][j];
						System.out.printf(", Down: " + down);		

					}
				}	
			}	
		}
		sc.close();
	}
}
