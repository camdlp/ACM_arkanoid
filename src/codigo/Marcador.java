/*
 * Autor Carlos Abia Merino 	1ºDAM
 */
package codigo;
import java.awt.Color;
import java.awt.Font;
import acm.graphics.GRect;
import acm.graphics.GLabel;
public class Marcador extends GRect{
	GLabel texto = new GLabel("");
	GLabel vidas = new GLabel("");
	int puntuacion = 0;
	
	public Marcador(double width, double height, Arkanoid _arkanoid) {
		super(width, height);
		setFilled(true);
		setFillColor(Color.WHITE);
		//descomenta esto si eres un flojo
		//setColor(Color.WHITE);
		setVisible(false);	//hacer invisible el cuadro del marcador.
 		texto.setLabel("0");
 		texto.setFont(new Font("Arial" ,Font.BOLD, 18));
 		vidas.setLabel("10");
 		
 		
	}
	
	public void dibuja(Arkanoid _arkanoid){
		_arkanoid.add(this,  _arkanoid.getWidth() - _arkanoid.espacioMenu -
				_arkanoid.pelota1.getWidth(), getY());//el cuadro del marcador puesto 
				//ajustado en el espacio del Menú
		_arkanoid.add(texto, _arkanoid.getWidth() - _arkanoid.espacioMenu*0.7 , getY()+30);
		_arkanoid.add(vidas, _arkanoid.getWidth() - _arkanoid.espacioMenu*0.7, getY()+50);
	}
	
	public void actualizaMarcador(int puntos){
		puntuacion +=puntos;
		texto.setLabel("" + puntuacion);
	}
}
