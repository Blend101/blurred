import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyList implements KeyListener {

	UltClock a;
	HeavyClock b;
	LightClock c;
	Character d;
	public KeyList(UltClock x, HeavyClock y, LightClock z, Character m){
		a = x;
		b = y;
		c = z;
		d = m;
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		if(arg0.getKeyCode() == KeyEvent.VK_P){
			if(a.getTime() == 0){
				//WHAT HAPPENS WHEN U ULT
				System.out.println("Ult used");
				a.resetClock();
			}
		}
		if(arg0.getKeyCode() == KeyEvent.VK_O){
			if(b.wgetTime() == 0){
			//WHAT HAPPENS WHEN U HEAVY
			System.out.println("Heavy used");
			b.resetClock();
			
			
		}
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_I){
			if(c.getTime() <= 0){
			//WHAT HAPPENS WHEN U LIGHT
			System.out.println("Light used");
			c.resetClock();
		}
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_W){
			//WHAT HAPPENS WHEN U GO UP
				d.setLocation(1);
			System.out.println("Moved up");
			System.out.println("Current location " + d.getLocation());
		}
		
		if(arg0.getKeyCode() == KeyEvent.VK_S){
			d.setLocation(-1);
			System.out.println("Moved down");
			System.out.println("Current location " + d.getLocation());
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
