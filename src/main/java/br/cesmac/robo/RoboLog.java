package br.cesmac.robo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RoboLog {
	
	int X;
	int Y;
	int linha; 
	String txt = "logOk.txt";
	


	public void gravaLog(int passoX, int passoY) throws IOException  {
		PrintWriter out = new PrintWriter(new FileWriter(txt, true));
		out.println(passoX+","+passoY);
		out.close();
		 
		
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
	
	
	

}
