package diy;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class GraphicsColor extends Applet {

	public void paint(Graphics g) {

		Color customColor = new Color(10, 10, 255);

		g.setColor(customColor);
		g.drawLine(10, 10, 30, 30);

		g.setColor(Color.red);
		g.fillRect(40, 40, 40, 40);

		g.setColor(Color.green);
		g.fillRect(80, 80, 40, 40);

		g.draw3DRect(81, 81, 40, 40, true);

	}
}
