package Desenvolvedor_2;

import java.util.Scanner;


public class Caracter_String {
		
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite uma string para inverter:");
	        String texto = scanner.nextLine();
	        
	        char[] caracteres = texto.toCharArray();
	        int inicio = 0;
	        int fim = caracteres.length - 1;
	        
	        while (inicio < fim) {
	            char temp = caracteres[inicio];
	            caracteres[inicio] = caracteres[fim];
	            caracteres[fim] = temp;
	            inicio++;
	            fim--;
	        }
	        
	        String textoInvertido = new String(caracteres);
	        System.out.println("String invertida: " + textoInvertido);
	    }
	}

	
	
	

