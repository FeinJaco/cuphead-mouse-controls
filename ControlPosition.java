package cupheadMouse;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class ControlPosition extends MousePosition implements KeyListener{
	public void keyPressed(KeyEvent e){
		int keyCode = e.getKeyCode();
		if (keyCode == KeyEvent.VK_E){
			//start();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
