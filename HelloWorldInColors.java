package diy;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

@SuppressWarnings("serial")
public class HelloWorldInColors extends Applet {

	public void paint(Graphics g) {

		Color c[] = { Color.black, Color.blue, Color.red, Color.yellow, Color.magenta, Color.pink, Color.orange,
				Color.green };

		for (int i = 0; i < c.length; i++) {

			g.setColor(c[i]);
			g.drawString("Hello World", 10, 10 + (i * 10));
		}

	}

}
