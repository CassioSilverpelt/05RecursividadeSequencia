package controller;

public class SequenciaController {
	public SequenciaController() {
		super();
	}
	
	public float sequencia(float n) {
		if (n == 1) {return 1;}
		//Quando N for 1, retorna 1 porque 1/1 é 1. Esse é o ponto de parada
		else {
			return (1/n) + sequencia(n-1);
			//(1/n) somado à sequencia com n recebendo -1 para dar continuidade. 
		}
	}
}
