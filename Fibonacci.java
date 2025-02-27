package Desenvolvedor_2;

import java.util.Scanner;

public class Fibonacci {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite um número para verificar se pertence à sequência de Fibonacci:");
	        int numero = scanner.nextInt();
	        
	        if (pertenceFibonacci(numero)) {
	            System.out.println(numero + " pertence à sequência de Fibonacci");
	        } else {
	            System.out.println(numero + " não pertence à sequência de Fibonacci");
	        }
	    }
	    
	    public static boolean pertenceFibonacci(int numero) {
	        if (numero == 0 || numero == 1) return true;
	        
	        int anterior = 0;
	        int atual = 1;
	        
	        while (atual <= numero) {
	            if (atual == numero) return true;
	            int proximo = anterior + atual;
	            anterior = atual;
	            atual = proximo;
	        }
	        
	        return false;
	    }
}
	
