package codigo;

import java.awt.Color;

import acm.graphics.GRect;

/**
 * 
 * @author Jorge Cisneros
 *
 *	la clase Barra es la que dibuja el cursor del juego
 */
public class Barra extends GRect{
	
	/*
	 *		 1  2  3  4	 5  6  7		
	 * 		-- -- -- -- -- -- --
	 * 		-- -- -- -- -- -- --
	 * 
	 * 
	 */

	/**
	 * Crea el cursor del juego
	 * @param width -> el ancho del cursor
	 * @param height -> el alto del cursor
	 * @param _color -> color del cursor
	 */
	public Barra(double width, double height, Color _color) {
		super(width, height);
		setFilled(true);
		setFillColor(_color);
		
	}
	/**
	 * mueveBarra reposiciona la barra en la coordenada
	 * en la que est� el rat�n
	 * @param posX la posici�n X del rat�n. La Y la obtiene de la 
	 * propia barra
	 * @param anchoPantalla porque as� no tengo que pasar nada m�s
	 */
	public void mueveBarra(int posX, int anchoPantalla){
		if (posX + getWidth() < anchoPantalla){
			setLocation(posX, getY());
		}
		
	}

}






