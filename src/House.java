import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class House {
	
	private static final int HOUSE_DIMENSION = 150;
	private static final int HOUSE_HIEGHT = 40;
	
	// draw will render the House on the Graphics object
	public void draw(Graphics g, int houseX, int houseY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=houseX;
		int y=houseY;
		// Draw the body
		g2.setColor(Color.orange);
		g2.fillRect(houseX, houseY, HOUSE_DIMENSION, HOUSE_DIMENSION);
		
		// Draw the roof
		g2.setColor(Color.red);
		g2.fillPolygon(new int[] {houseX, houseX + HOUSE_DIMENSION, houseX + HOUSE_DIMENSION / 2}, new int[] {houseY, houseY, houseY - HOUSE_HIEGHT}, 3);
	
		//Draw the road
		g2.setColor(Color.black);
		g2.fillRect(0, houseY + (int)(1.1 * HOUSE_DIMENSION), 1000,  HOUSE_HIEGHT);
		
		//Draw dashes on the road
		g2.setColor(Color.yellow);
		g2.fillRect(0, houseY + (int)(1.2 * HOUSE_DIMENSION), 50, HOUSE_HIEGHT / 5);
		g2.fillRect(125, houseY + (int)(1.2 * HOUSE_DIMENSION), 50, HOUSE_HIEGHT / 5);
		g2.fillRect(250, houseY + (int)(1.2 * HOUSE_DIMENSION), 50, HOUSE_HIEGHT / 5);
		g2.fillRect(375, houseY + (int)(1.2 * HOUSE_DIMENSION), 50, HOUSE_HIEGHT / 5);
	}
}
