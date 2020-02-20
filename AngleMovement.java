package cupheadMouse;

import java.awt.AWTException;
import java.awt.MouseInfo;
import java.awt.Robot;
//import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
//import java.util.Date;
import java.io.BufferedReader;
//import java.awt.event.KeyListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.io.IOException;
//import java.util.Scanner;
//import java.io.IOException;
import java.io.InputStreamReader;

public class AngleMovement {

	public static void main(String[] args) throws AWTException {

		double mouseX;
		double mouseY;
		double dist;
		boolean r = false;
		boolean l = false;
		boolean d = false;
		boolean u = false;

		Robot robot = new Robot();

		try {
		      String line;
		      Process p = Runtime.getRuntime().exec("C:\\Program Files (x86)\\Steam\\steamapps\\common\\Cuphead\\Cuphead.exe");
		      BufferedReader bri = new BufferedReader
		        (new InputStreamReader(p.getInputStream()));
		      BufferedReader bre = new BufferedReader
		        (new InputStreamReader(p.getErrorStream()));
		      while ((line = bri.readLine()) != null) {
		        System.out.println(line);
		      }
		      bri.close();
		      while ((line = bre.readLine()) != null) {
		        System.out.println(line);
		      }
		      bre.close();
		      p.waitFor();
		      System.out.println("Done.");
		    }
		    catch (Exception err) {
		      err.printStackTrace();
		    }

		try {

			// sleep 30 seconds
			Thread.sleep(30000);

		} catch (InterruptedException e) {
 
			e.printStackTrace();
   
		
		
		}

		while (true) {
			
			//Movement mpress = new Movement();
			//mpress.mousePressed(MouseEvent e);
		
			mouseX = MouseInfo.getPointerInfo().getLocation().getX() - 682;
			mouseY = -(MouseInfo.getPointerInfo().getLocation().getY() - 383);
			dist = Math.sqrt((mouseX)*(mouseX) + (mouseY)*(mouseY));
			
			if (mouseX > 0 && dist > 64 && Math.atan(mouseY/mouseX) > (-3*Math.PI)/8 && Math.atan(mouseY/mouseX) < (3*Math.PI)/8) {
				if (r == false) {
					// Simulate a key press
					robot.keyPress(KeyEvent.VK_RIGHT);
					r = true;
				}
				//System.out.println("right");
			} else {
				if (r == true) {
					robot.keyRelease(KeyEvent.VK_RIGHT);
				}
				r = false;
				if (mouseX < 0 && dist > 64 && Math.atan(mouseY/mouseX) > (-3*Math.PI)/8 && Math.atan(mouseY/mouseX) < (3*Math.PI)/8) {
					if (l == false) {
						// Simulate a key press
						robot.keyPress(KeyEvent.VK_LEFT);
						l = true;
					}
					//System.out.println("left");
				} else {
					if (l == true) {
						robot.keyRelease(KeyEvent.VK_LEFT);
					}
					l = false;
				}
			}

			if (mouseY > 0 && dist > 64 && ((Math.atan(mouseX/mouseY) > (-7*Math.PI)/16 && Math.atan(mouseX/mouseY) < (7*Math.PI)/16))) {
				if (u == false) {
					// Simulate a key press
					robot.keyPress(KeyEvent.VK_UP);
					u = true;
				}
				//System.out.println("up");
			} else {
				if (u == true) {
					robot.keyRelease(KeyEvent.VK_UP);
				}
				u = false;
				if (mouseY < 0 && dist > 64 && ((Math.atan(mouseX/mouseY) > (-7*Math.PI)/16 && Math.atan(mouseX/mouseY) < (7*Math.PI)/16))) {
					if (d == false) {
						// Simulate a key press
						robot.keyPress(KeyEvent.VK_S);
						d = true;
					}
					//System.out.println("down");
				} else {
					if (d == true) {
						robot.keyRelease(KeyEvent.VK_S);
					}
					d = false;
				}
			}

			
			 //System.out.println(mouseX); System.out.println(mouseY);
			 //System.out.println(16*Math.atan(mouseX/mouseY)/Math.PI);
			 
			 
		}
	
	}

}
