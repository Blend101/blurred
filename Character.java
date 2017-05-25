public class Character{
	private int location;
	
	public Character(int x){
		location = x;
	}
	
	public void setLocation(int y){
		if(location == 1 && y == -1){
			
		}else if(location == 3 && y == 1){
			
		}else if(y == 1){
			location++;
		}else if(y == -1){
			location--;
		}
	}
	
	public int getLocation(){
		return location;
	}
}