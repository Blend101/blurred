import javax.swing.JFrame;

public class Main {
	
	public static void main(String args[]){
	StartUp obj = new StartUp();
	UltClock x = new UltClock(100);
	HeavyClock y = new HeavyClock(1);
	LightClock z = new LightClock(1.00);
	Character c = new Character(2);
	Thread ult = new Thread(x);
	Thread hev = new Thread(y);
	Thread light = new Thread(z);
	ult.start();
	hev.start();
	light.start();
	JFrame frame = new JFrame("Bruh");
	frame.addKeyListener(new KeyList(x, y, z, c));
	frame.setSize(1000, 1000);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
}
}
