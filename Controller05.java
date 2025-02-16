package controller;

public class Controller05 {
	
	public Controller05() {
		super();
	}

	public double Somatoria(int N) {
		
		/*
		 * Condição de parada: quando o N chegar em 1, retornaremos 1
		 */
		if (N == 1) {
			return 1;
		} else {
			return (1.0/ N) + Somatoria(N - 1);
		}
	}
}
