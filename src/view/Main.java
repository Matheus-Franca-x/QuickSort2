package view;

import controller.Ordenacao;

public class Main {

	public static void main(String[] args) 
	{
		
		int[] vetor = {12, 13, 14, 15, 51, 53, 57, 25, 26, 27, 90};
		
		Ordenacao ordena = new Ordenacao();
		
		vetor = ordena.quickSort(vetor, 0, vetor.length -1);
		
		for (int valor : vetor)
		{
			System.out.println(valor);
		}
		
		
	}

}
