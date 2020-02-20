package cupheadMouse;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class Window {
	
	public static void main(String[] args) {
		JFrame window = new JFrame();
		
		window.setSize(1366,760);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
