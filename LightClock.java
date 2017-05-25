public class LightClock implements Runnable{
	private double time;
	
	public LightClock(double x){
		time = x;
	}
	
	public void run() {
		
		try{
			while(time > 0.00){
			System.out.println(time + "till light is ready");
			time -= 0.100;
			Thread.sleep(100);
			}}catch(Exception e){
			
		}
		// TODO Auto-generated method stub
		
	}
	
	public void resetClock(){
		time = 1.0;
		run();
	}
	
	public double getTime(){
		return time;
	}
	}

