package br.cesmac.robo;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class Robo { 
	int X;
	int Y;
	int limiteX = 10;
	int limiteY = 10;
	RoboLog roboLog = new RoboLog();
	public Robo(int x, int y) throws IOException {
		super();
		if(x>limiteX) {
			throw new RuntimeException("Não é possível iniciar o robô com X>"+limiteX);
		} else {
			X = x;
		}
		if(y>limiteY) {
			throw new RuntimeException("Não é possível iniciar o robô com Y>"+limiteY);
		} else {
			Y = y;
			roboLog.gravaLog(X, Y);
		}
	}
	
	public void andarDireita(int passos) throws IOException {
		if((X+passos)>limiteX) {
			throw new RuntimeException("Não pode ultrapassar o limite "+limiteX);
			
		} else {
			X = X+passos;
			roboLog.gravaLog(X, Y);
			
		
		}
	}
	
	public void andarEsquerda(int passos) throws IOException {
		if((X-passos)<0) {
			throw new RuntimeException("Não pode ultrapassar o limite 0");
			
		} else {
			X = X-passos;
			roboLog.gravaLog(X, Y);
		 
			
		}
	}
	
	public void andarCima(int passos) throws IOException {
		if((Y+passos)>limiteY) {
			throw new RuntimeException("Não pode ultrapassar o limite "+limiteY);
			
		} else {
			Y = Y+passos;
			roboLog.gravaLog(X, Y);
		 			 
		}
	}
	public void andarBaixo(int passos) throws IOException {
		if((Y-passos)<0) {
			throw new RuntimeException("Não pode ultrapassar o limite 0");
			
		} else {
			Y = Y-passos;
			roboLog.gravaLog(X, Y);
			 
		
		}
	}
	
	
	
	
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public int getY() {
		return Y;
	}
	public void setY(int y) {
		Y = y;
	}

	public int getLimiteX() {
		return limiteX;
	}

	
	public int getLimiteY() {
		return limiteY;
	}

	

	

 
}
