public class HeavyClock implements Runnable{
	private int time;
	
	public HeavyClock(int x){
		time = x;
	}
	
	public void run() {
		
		try{
			while(time != 0){
			System.out.println(time + "till heavy is ready");
			time--;
			Thread.sleep(1000);
			}}catch(Exception e){
			
		}
		// TODO Auto-generated method stub
		
	}
	
	public void resetClock(){
		time = 30;
		run();
	}
	
	public int getTime(){
		return time;
	}
	}

