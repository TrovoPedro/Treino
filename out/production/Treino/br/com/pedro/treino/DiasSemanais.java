package br.com.projetodiassemanais;

import java.util.Scanner;

public class DiasSemanais {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//variaveis
		
		String dia;
		
		//Entrada de dados
		
		System.out.print("Informe o dia da semana: ");
		dia = teclado.next();

		//Processamento
		
		if(dia.equalsIgnoreCase("Sabado")) {
			System.out.println("Voc� n�o vai pra escola!!");
		
		}
		else if(dia.equalsIgnoreCase("domingo")) {
			System.out.println("Voc� n�o vai pra escola!!");
	
		}
		else if(dia.equalsIgnoreCase("Segunda")){
			System.out.println("Voc� vai pra escola");
		}
		else if(dia.equalsIgnoreCase("Terca")) {
			System.out.println("Voc� vai pra escola");
		}
		else if(dia.equalsIgnoreCase("Quarta")) {
			System.out.println("Voc� vai pra escola");
		}
		else if(dia.equalsIgnoreCase("Quinta")) {
			System.out.println("Voc� vai pra escola");
		}
		else if(dia.equalsIgnoreCase("Sexta")) {
			System.out.println("Voc� vai pra escola");
		}
		else {
			System.out.println("Dia da semana inv�lido!!!");
		}
	

	}

}
