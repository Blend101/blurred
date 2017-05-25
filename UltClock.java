
public class UltClock implements Runnable{
	private int time;
	
	public UltClock(int x){
		time = x;
	}
	
	public void run() {
		
		try{
			while(time != 0){
			System.out.println(time + "till ult is ready");
			time--;
			Thread.sleep(1000);
			}}catch(Exception e){
			
		}
		// TODO Auto-generated method stub
		
	}
	
	public void resetClock(){
		time = 100;
		run();
	}
	
	public int getTime(){
		return time;
	}
	}

