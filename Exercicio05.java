package Exercicios;

import javax.swing.*;

import controller.Controller05;

public class Exercicio05 {
	
	public static void main (String[] args) {
		
		Controller05 somatoria = new Controller05();
		 int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo (N):"));

	        if (n <= 0) {
	            JOptionPane.showMessageDialog(null, "Número inválido! Digite um número maior que 0.");
	        } else {
	             double resultado = somatoria.Somatoria(n);
	            
	            JOptionPane.showMessageDialog(null, "O valor da somatória S para N = " + n + " é: " + resultado);
	        }
	  }
}

