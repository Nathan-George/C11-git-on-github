import javax.swing.JPanel;
import java.awt.*;
import java.awt.geom.*;

public class Sun {
	
	private static final int SUN_SIZE = 80;
	private static final int NUM_RAYS = 10;
	private static final double RAY_SIZE = SUN_SIZE / 2 + 40;
	private static final double DELTA = 0.1;
	
	// draw will render the House on the Graphics object
	public void draw(Graphics g, int sunX, int sunY)
	{
		Graphics2D g2 = (Graphics2D) g;
		int x=sunX;
		int y=sunY;
		// Draw the body
		g2.setColor(Color.yellow);
		g2.fillOval(sunX - SUN_SIZE / 2, sunY - SUN_SIZE / 2, SUN_SIZE, SUN_SIZE);
		for (int i = 0; i < NUM_RAYS; i++) {
			double angle = 2 * Math.PI / NUM_RAYS * i;
			g2.fillPolygon(
					new int[] {(int)(x + Math.cos(angle) * RAY_SIZE), (int)(x + Math.cos(angle - DELTA) * SUN_SIZE / 1.8), (int)(x + Math.cos(angle + DELTA) * SUN_SIZE / 1.8)}, 
					new int[] {(int)(y + Math.sin(angle) * RAY_SIZE), (int)(y + Math.sin(angle - DELTA) * SUN_SIZE / 1.8), (int)(y + Math.sin(angle + DELTA) * SUN_SIZE / 1.8)}, 
					3);
		}
	}
}
