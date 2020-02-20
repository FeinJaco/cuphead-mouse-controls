package cupheadMouse;

import java.awt.Robot;
import java.awt.event.KeyEvent;
//import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.AWTException;

import javax.swing.SwingUtilities;

class Movement implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		Robot keyboard = null;
		try {
			keyboard = new Robot();
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (SwingUtilities.isLeftMouseButton(e)) {
			keyboard.keyPress(KeyEvent.VK_J);
		} else {
			if (SwingUtilities.isRightMouseButton(e)) {
				keyboard.keyPress(KeyEvent.VK_K);
			}
		}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		Robot keyboard = null;
		try {
			keyboard = new Robot();
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (SwingUtilities.isLeftMouseButton(e)) {
			keyboard.keyRelease(KeyEvent.VK_J);
		} else {
			if (SwingUtilities.isRightMouseButton(e)) {
				keyboard.keyRelease(KeyEvent.VK_K);
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
}
