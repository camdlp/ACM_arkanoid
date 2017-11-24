package codigo;
/*
 * TO DO
 * Arreglar rebote con ladrillos de la nueva versión
 * 
 * Que el choque con el cursor sea más progresiva.
 * 
 * Crear sistema partida: vidas + cambiar nivel.
 * 
 * Sistema Bonus.
 * 
 */

import java.awt.Color;
import java.awt.event.MouseEvent;
import acm.graphics.GRect;
import acm.util.RandomGenerator;

/*
 * Autor: Carlos Abia		1ºDAM
 * 
 * El Arkanoid pero orientado a objetos
 */

public class Arkanoid extends acm.program.GraphicsProgram{

	Pelota pelota1 = new Pelota(15, Color.GREEN);
	//Pelota pelota2 = new Pelota(30, Color.BLUE);
	Barra barra1 = new Barra(500, 15, Color.RED);
    int anchoLadrillo = 30;
    int altoLadrillo = 20;
    int espacioMenu = 60;
    RandomGenerator colorRandom = new RandomGenerator();
    
    
	
	 Marcador marcador = new Marcador(espacioMenu + pelota1.getWidth(), 40, this);
	
	public void init(){
		addMouseListeners();
		setSize(600, 800);
		GRect lateral = new GRect(3, getHeight());
		lateral.setFilled(true);
		lateral.setFillColor(Color.BLACK);
		add(lateral, getWidth() - espacioMenu - lateral.getWidth() - pelota1.getWidth(), 0);
		 add(pelota1, 0, getHeight()*0.60 - pelota1.getHeight());
		//add(pelota2, 0, getHeight()*0.70 - pelota2.getHeight());
		add(barra1, 0 , getHeight()*0.80);
		
		
	}
	
	public void run(){
		dibujaNivel01();
		marcador.dibuja(this);
		//add(marcador.texto, 0, 20);
		while (true){//importante para las vidas
			pelota1.muevete(this);
			//pelota2.muevete(this);
			barra1.mueveBarra((int)pelota1.getX(), getWidth()-espacioMenu);
			pause(0.5);
		}
	}
	
	public void mouseMoved (MouseEvent evento){
		barra1.mueveBarra(evento.getX(), getWidth()-espacioMenu);
	}
	
	private void dibujaNivel01(){
		int numLadrillos = 14; 
		for (int j=0; j < numLadrillos; j++){
			for(int i=j; i < numLadrillos; i++){
				Ladrillo miLadrillo =
				new Ladrillo(((((getWidth()-espacioMenu-18)-anchoLadrillo*numLadrillos)/2)+anchoLadrillo*i - anchoLadrillo*j/2),
						     altoLadrillo*j,
						     anchoLadrillo, 
						     altoLadrillo, 
						     colorRandom.nextColor());//poner colores random
				
				add(miLadrillo);
				pause(7);
			}
		}
	}
	
}































