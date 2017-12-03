package br.cesmac.roboTest;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import br.cesmac.robo.Robo;

public class RoboTest {
	private Robo joao;

	@Before
	public void criaObjetos() throws IOException {

		this.joao = new Robo(5, 5);

	}
	
	 

	@Test(expected = RuntimeException.class)
	public void criarObjetoAcimaLimiteX() throws IOException {

		this.joao = new Robo(11, 5);

	}

	@Test
	public void andarDireitaTeste() throws IOException {
		joao.andarDireita(5);

		Assert.assertEquals(10, joao.getX());

	}

	@Test
	public void andarEsquerdaTeste() throws IOException {
		joao.andarEsquerda(3);
		Assert.assertEquals(2, joao.getX());
	}

	@Test
	public void andarBaixoTeste() throws IOException {
		joao.andarBaixo(2);
		Assert.assertEquals(3, joao.getY());
	}

	@Test
	public void andarBaixoCima() throws IOException {
		File file = new File("logOk.txt");
		file.delete();

		Robo joao = new Robo(5, 5);
		joao.andarCima(2); //5 , 7
		joao.andarCima(2); //5 , 9
		joao.andarDireita(2);//7, 9
		
		//verifique o historico log
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader("logOk.txt");
			br = new BufferedReader(fr);
			
			String cCurrentLine;
			int linha = 0;
			while ((cCurrentLine = br.readLine()) !=null) {
				linha++;
				if(linha==1) {
					String[] array = cCurrentLine.split(",");
					String x = array[0];
					String y = array[1];
					Assert.assertEquals("5", x);
					Assert.assertEquals("5", y);
				}
				if(linha==2) {
					String[] array = cCurrentLine.split(",");
					String x = array[0];
					String y = array[1];
					Assert.assertEquals("5", x);
					Assert.assertEquals("7", y);
				}
				
				if(linha==3) {
					String[] array = cCurrentLine.split(",");
					String x = array[0];
					String y = array[1];
					Assert.assertEquals("5", x);
					Assert.assertEquals("9", y);
				}
				if(linha==4) {
					String[] array = cCurrentLine.split(",");
					String x = array[0];
					String y = array[1];
					Assert.assertEquals("7", x);
					Assert.assertEquals("9", y);
				}
				
				
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	//	Assert.assertEquals(7, joao.getY());
	}

}
 

